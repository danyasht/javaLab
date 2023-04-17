package ua.lviv.iot.algo.part1.lab1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SawWriter {
    private static final String defaultFilename = "result.csv";

    public static String writeToFile(List<Saw> saws) throws IOException {
        if (new File(defaultFilename).exists()) {
            Files.delete(Path.of(defaultFilename));
        }
        if (saws == null || saws.isEmpty()) {
            return null;
        }
        try (FileWriter writer = new FileWriter(defaultFilename)) {
            for (var saw : saws) {
                writer.write(saw.getHeaders());
                writer.write("\r\n");
                writer.write(saw.toCSV());
                writer.write("\r\n");
            }
        } catch (IOException e) {

        }
        return defaultFilename;
    }
}



