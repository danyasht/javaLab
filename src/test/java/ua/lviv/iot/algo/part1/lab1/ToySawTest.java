package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToySawTest {
    @Test
    void testGetRemainingWorkTime() {
        var toySaw = new ToySaw();
        toySaw.setBatteryCapacity(1000);
        toySaw.setPower(10);
        assertEquals(100, toySaw.getRemainingWorkTime());
    }

    @Test
    void testStartWork() {
        var toySaw = new ToySaw();
        toySaw.setWorking(true);
        toySaw.startWork();
        assertEquals(true, toySaw.getWorking());
    }

    @Test
    void testStopWork() {
        var toySaw = new ToySaw();
        toySaw.setWorking(true);
        toySaw.stopWork();
        assertEquals(false, toySaw.getWorking());
    }

    @Test
    void testBatteryCapacityAtribute() {
        var toySaw = new ToySaw();
        toySaw.setBatteryCapacity(950);
        double expected = 950;
        double actual = toySaw.getBatteryCapacity();
        assertEquals(expected, actual);
    }
}