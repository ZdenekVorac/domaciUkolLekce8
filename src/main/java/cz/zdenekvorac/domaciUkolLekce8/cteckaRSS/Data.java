package cz.zdenekvorac.domaciUkolLekce8.cteckaRSS;

public class Data {
    private static final String PATH = "./src/main/resources/static/";
    private static final String FILENAME_SCIFI = "scifi.txt";
    private static final String FILENAME_ROMANTIC = "romatic.txt";
    private static final String FILENAME_HISTORIC = "historic.txt";

    public static String getPATH() {
        return PATH;
    }

    public static String getFilenameScifi() {
        return FILENAME_SCIFI;
    }
    public static String getFilenameRomantic() {
        return FILENAME_ROMANTIC;
    }
    public static String getFilenameHistoric() {
        return FILENAME_HISTORIC;
    }

    }


