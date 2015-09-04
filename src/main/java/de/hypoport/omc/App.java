package de.hypoport.omc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;

/**
 * Hello world!
 */

public class App {
    private static Logger log = LoggerFactory.getLogger(de.hypoport.omc.App.class);

    public static void main(String[] args) {
        log.info("Hello World!");
    }

    public void decodeAndWriteZipfile(String base64Data, String filename) {
        log.debug("Anfang: decodeAndWriteZipfile");
        byte[] data = Base64.getDecoder().decode(base64Data);

        try {
            try (OutputStream stream = new FileOutputStream(filename)) {
                stream.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        log.debug("Ende: decodeAndWriteZipfile");
    }
}
