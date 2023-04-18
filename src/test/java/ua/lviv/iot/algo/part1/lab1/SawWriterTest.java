package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SawWriterTest {
    private SawWriter writer;
    private List<Saw> saws;
    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";

    @BeforeEach
    public void setUp() {
        writer = new SawWriter();
        saws = new LinkedList<>();
        saws.add(new ElectricSaw("Makita", 4.2, 2500, 20250, "Electric", 3, true, 1.4));
        saws.add(new Chainsaw("Kross WXT-1080 XX", 3.2, 3400, 30500, "Gasoline", 3.7, false, 1.7));
        saws.add(new UniversalSaw("Tatra garden", 3, 1800, 15200, "Gasoline", 3.5, true, 1.5));
        saws.add(new ToySaw("Child's saw", 0.8, 20, 510, "none", 0, false, 0.7));
    }

    @Test
    void testWriteListOfSaws() throws IOException {
        writer.writeToFile(saws);
        File expectedFile = new File(EXPECTED_FILENAME);
        File resultFile = new File(RESULT_FILENAME);
        byte[] bytes = Files.readAllBytes(resultFile.toPath());
        String content = new String(bytes);
        Files.write(expectedFile.toPath(), content.getBytes());
        Path expected = new File(EXPECTED_FILENAME).toPath();
        Path actual = new File(RESULT_FILENAME).toPath();
        assertEquals(-1, Files.mismatch(expected, actual), "Files aren't equal");
    }

    @Test
    void testEmptyWrite() throws IOException {
        List<Saw> saws = new LinkedList<>();
        writer.writeToFile(saws);
        File file = new File(RESULT_FILENAME);
        assertFalse(file.exists());
    }

    @Disabled
    @Test
    public void testFileOverride() throws IOException {
        List<Saw> saws = new LinkedList<>();
        writer.writeToFile(saws);
        Path expected = new File(EXPECTED_FILENAME).toPath();
        Path actual = new File(RESULT_FILENAME).toPath();
        assertEquals(-1, Files.mismatch(expected, actual));
    }



//    @AfterAll
//    public static void tearDown() throws IOException {
//        Files.deleteIfExists(Path.of(RESULT_FILENAME));
//    }
}