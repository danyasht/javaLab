package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniversalSawTest {
    @Test
    void testGetRemainingWorkTime() {
        var universalSaw = new UniversalSaw();
        universalSaw.setBatteryCapacity(26000);
        universalSaw.setPower(2600);
        assertEquals(10, universalSaw.getRemainingWorkTime());
    }

    @Test
    void testStartWork() {
        var universalSaw = new UniversalSaw();
        universalSaw.setWorking(true);
        universalSaw.startWork();
        assertEquals(true, universalSaw.getWorking());
    }

    @Test
    void testStopWork() {
        var universalSaw = new UniversalSaw();
        universalSaw.setWorking(true);
        universalSaw.stopWork();
        assertEquals(false, universalSaw.getWorking());
    }

    @Test
    void testBatteryCapacityAtribute() {
        var universalSaw = new UniversalSaw();
        universalSaw.setBatteryCapacity(25300);
        double expected = 25300;
        double actual = universalSaw.getBatteryCapacity();
        assertEquals(expected, actual);

    }
}