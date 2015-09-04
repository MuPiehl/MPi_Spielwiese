package de.hypoport.omc;


import de.hypoport.omc.util.base64.EncoderDecoder;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Test
public class AppTest {
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
        String base64Txt = TextfileLoader.loadAngebotsBase64();

        App app = new App();
        app.decodeAndWriteZipfile(base64Txt, "angebotsTest.zip");
        //toDo gucken, ob zipfile jetzt auf platte --> Assert
    }
}
