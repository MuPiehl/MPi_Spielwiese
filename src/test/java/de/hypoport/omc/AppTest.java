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
}
