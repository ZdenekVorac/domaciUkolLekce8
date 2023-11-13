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
    public String prvniMetoda() {
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(Data.getPATH()+Data.getFilenameScifi()));
            String line = null;
            while ((line = br.readLine()) != null) {
                sj.add(line);
            }
            br.close();
            return sj.toString();
        }catch (Exception ex){
        }
        return "Soubor neexistuje";
    }
        @GetMapping("/romantic")
        public String druhaMetoda() {
            StringJoiner sj = new StringJoiner(System.lineSeparator());
            try {
                BufferedReader br = new BufferedReader(
                        new FileReader(Data.getPATH()+Data.getFilenameRomantic()));
                String line = null;
                while ((line = br.readLine()) != null) {
                    sj.add(line);
                }
                br.close();
                return sj.toString();
            }catch (Exception ex){
            }
            return "Soubor neexistuje";
        }
    @GetMapping("/historic")
    public String tretiMetoda() {
        StringJoiner sj = new StringJoiner(System.lineSeparator());
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(Data.getPATH()+Data.getFilenameHistoric()));
            String line = null;
            while ((line = br.readLine()) != null) {
                sj.add(line);
            }
            br.close();
            return sj.toString();
        }catch (Exception ex){
        }
        return "Soubor neexistuje";
    }

}
