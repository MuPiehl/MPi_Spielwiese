package de.hypoport.omc;


import de.hypoport.omc.util.base64.EncoderDecoder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Test
public class AppTest {

    public static final String ANGEBOTS_TEST_ZIP_FILENAME = "angebotsTest.zip";

    public void testLoadBase64FromFile() {
        String base64Txt = TextfileLoader.loadAngebotsBase64();
//        System.out.println(base64Txt);

        assertTrue(base64Txt.length() > 0);
    }

    public void testEncodeDecodeBase64() {
        String clearText = "abcd";
        EncoderDecoder encoderDecoder = new EncoderDecoder();
        String encodedText = encoderDecoder.encodeText(clearText);
        Assert.assertEquals(encodedText, "YWJjZA==");

        String decodeResult = encoderDecoder.decodeText(encodedText);
        Assert.assertEquals(decodeResult, "abcd");
    }

    public void testDecodeAndWriteZipfile() {
        // todo lösche file (fals vorhanden)
        assertTrue(checkZipFileExists());
        deleteZipFile();
        assertFalse(checkZipFileExists());

        String base64Txt = TextfileLoader.loadAngebotsBase64();

//        App app = new App();
//        app.decodeAndWriteZipfile(base64Txt, ANGEBOTS_TEST_ZIP_FILENAME);
        //toDo gucken, ob zipfile jetzt auf platte --> Assert
        //toDo gucken, ob zipfile inhaltlich gleich Inhalt_im_Zip_dSL.json
    }

    private void deleteZipFile() {
        File fileTemp = new File(ANGEBOTS_TEST_ZIP_FILENAME);
        if (fileTemp.exists()) {
            fileTemp.delete();
        }
    }

    private boolean checkZipFileExists() {
        File f = new File(ANGEBOTS_TEST_ZIP_FILENAME);
        return (f.exists() && !f.isDirectory());
    }
}
