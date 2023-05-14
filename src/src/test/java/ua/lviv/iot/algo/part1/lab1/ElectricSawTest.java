package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricSawTest {
    @Test
    void testGetRemainingWorkTime() {
        var electricSaw = new ElectricSaw();
        electricSaw.setBatteryCapacity(18500);
        electricSaw.setPower(1000);
        assertEquals(18.5, electricSaw.getRemainingWorkTime());
    }

    @Test
    void testStartWork() {
        var electricSaw = new ElectricSaw();
        electricSaw.setWorking(true);
        electricSaw.startWork();
        assertEquals(true, electricSaw.getWorking());
    }

    @Test
    void testStopWork() {
        var electricSaw = new ElectricSaw();
        electricSaw.setWorking(true);
        electricSaw.stopWork();
        assertEquals(false, electricSaw.getWorking());
    }

    @Test
    void testBatteryCapacityAtribute() {
        var electricSaw = new ElectricSaw();
        electricSaw.setBatteryCapacity(18000);
        double expected = 18000;
        double actual = electricSaw.getBatteryCapacity();
        assertEquals(expected, actual);
    }
}