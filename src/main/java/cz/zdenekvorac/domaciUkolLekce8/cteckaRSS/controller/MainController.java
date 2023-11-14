package cz.zdenekvorac.domaciUkolLekce8.cteckaRSS.controller;

import cz.zdenekvorac.domaciUkolLekce8.cteckaRSS.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringJoiner;

@RestController()

public class MainController {
    @GetMapping("/scifi")
    public String getScifi() {
        return getData(Data.getFilenameScifi());
    }

    @GetMapping("/romantic")
    public String getRomantic() {
        return getData(Data.getFilenameRomantic());
    }

    @GetMapping("/historic")
    public String getHistoric() {
        return getData(Data.getFilenameHistoric());
    }

    private static String getData(String FilenameScifi) {
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(Data.getPATH() + FilenameScifi));
            String line = null;
            while ((line = br.readLine()) != null) {
                sj.add(line);
            }
            br.close();
            return sj.toString();
        } catch (Exception ex) {
        }
        return "Soubor neexistuje";
    }
}
