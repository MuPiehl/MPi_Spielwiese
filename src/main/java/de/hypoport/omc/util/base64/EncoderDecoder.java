package de.hypoport.omc.util.base64;

import java.util.Base64;

/**
 * Created by Matthias.Piehl on 04.09.2015.
 */
public class EncoderDecoder {
    public String encodeText(String clearText) {
        return Base64.getEncoder().encodeToString(clearText.getBytes());
    }

    public String decodeText(String encodedText) {
        byte decodeResult[] = Base64.getDecoder().decode(encodedText);
        return new String(decodeResult);
    }
}
