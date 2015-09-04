package de.hypoport.omc
/**
 * Created by Matthias.Piehl on 04.09.2015.
 */
class TextfileLoader {
    static String loadTextFile(String filename) {
        InputStream is = this.getResourceAsStream(filename);
        return is.text;
    }

    public static String loadAngebotsBase64() {
        return loadTextFile("/AngebotBase64.txt");
    }
}
