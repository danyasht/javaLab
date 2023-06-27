package ua.lviv.iot.algo.part1.lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Remover {
    public String removeWordsWithLengthFiveWhichStartWithСonsonantLetter(String data) {
        String regex = ("\\b[bcdfghjklmnpqrstvwxz]\\w{4}\\b");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        return matcher.replaceAll("");
    }

    public static void main(String... strings) {
        String data =
                """
                        I'm listening to a great song.
                        We enjoy warm sunsets on the beach.
                        He drives fast cars and loves speed.
                        He reads books for hours on end.
                        """;
        Remover remover = new Remover();
        System.out.println(remover.removeWordsWithLengthFiveWhichStartWithСonsonantLetter(data));
    }
}