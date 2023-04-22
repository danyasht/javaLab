package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChainsawTest {
    @Test
    void testGetRemainingWorkTime(){
        var chainsaw = new Chainsaw();
        chainsaw.setBatteryCapacity(25000);
        chainsaw.setPower(2500);
        assertEquals(10, chainsaw.getRemainingWorkTime());
    }

    @Test
    void testStartWork(){
        var chainsaw = new Chainsaw();
        chainsaw.setWorking(true);
        chainsaw.startWork();
        assertEquals(true, chainsaw.getWorking());
    }

    @Test
    void testStopWork(){
        var chainsaw = new Chainsaw();
        chainsaw.setWorking(true);
        chainsaw.stopWork();
        assertEquals(false ,chainsaw.getWorking());
    }

    @Test
    void testBatteryCapacityAtribute(){
        var chainsaw = new Chainsaw();
        chainsaw.setBatteryCapacity(22500);
        double expected = 22500;
        double actual = chainsaw.getBatteryCapacity();
        assertEquals(expected, actual);
    }



}