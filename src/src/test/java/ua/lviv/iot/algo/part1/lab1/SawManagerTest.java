package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SawManagerTest {
    @Test
    void testAddSaw(){
        var sawManager = new SawManager();
        sawManager.addSaw(new ToySaw());
        sawManager.addSaw(new Chainsaw());
        sawManager.addSaw(new ElectricSaw());
        sawManager.addSaw(new UniversalSaw());
        assertEquals(4, sawManager.saws.size());
    }

    @Test
    void testFindAllNoWorking() {
        var sawManager = new SawManager();
        sawManager.addSaw(new ElectricSaw("Makita", 4.2, 2500, 20250, "Electric", 3, true, 1.4));
        sawManager.addSaw(new Chainsaw("Kross WXT-1080 XX", 3.2, 3400, 30500, "Gasoline", 3.7, false, 1.7));
        sawManager.addSaw(new UniversalSaw("Tatra garden", 3, 1800, 15200, "Gasoline", 3.5, true, 1.5));
        sawManager.addSaw(new ToySaw("Child's saw", 0.8, 20, 510, "none", 0, false, 0.7));
        List<Saw> brokenSaws = sawManager.findAllNoWorking();
        assertEquals(2, brokenSaws.size());
    }

    @Test
    void testFindAllWorking(){
        var sawManager = new SawManager();
        sawManager.addSaw(new ElectricSaw("Makita", 4.2, 2500, 20250, "Electric", 3, true, 1.4));
        sawManager.addSaw(new Chainsaw("Kross WXT-1080 XX", 3.2, 3400, 30500, "Gasoline", 3.7, false, 1.7));
        sawManager.addSaw(new UniversalSaw("Tatra garden", 3, 1800, 15200, "Gasoline", 3.5, true, 1.5));
        sawManager.addSaw(new ToySaw("Child's saw", 0.8, 20, 510, "none", 0, false, 0.7));
        List<Saw> workingSaws = sawManager.findAllWorking();
        assertEquals(2, workingSaws.size());
    }

    @Test
    void testFindAllWithChainLengthMoreThan(){
        var sawManager = new SawManager();
        sawManager.addSaw(new ElectricSaw("Makita", 4.2, 2500, 20250, "Electric", 3, true, 1.4));
        sawManager.addSaw(new Chainsaw("Kross WXT-1080 XX", 3.2, 3400, 30500, "Gasoline", 3.7, false, 1.7));
        sawManager.addSaw(new UniversalSaw("Tatra garden", 3, 1800, 15200, "Gasoline", 3.5, true, 1.5));
        sawManager.addSaw(new ToySaw("Child's saw", 0.8, 20, 510, "none", 0, false, 0.7));
        List<Saw> longChainSaws = sawManager.findAllWithChainLengthMoreThan(1.1);
        assertEquals(3, longChainSaws.size());
    }

    @Test
    void testFindAllWithTypeOfEngine(){
        var sawManager = new SawManager();
        sawManager.addSaw(new ElectricSaw("Makita", 4.2, 2500, 20250, "Electric", 3, true, 1.4));
        sawManager.addSaw(new Chainsaw("Kross WXT-1080 XX", 3.2, 3400, 30500, "Gasoline", 3.7, false, 1.7));
        sawManager.addSaw(new UniversalSaw("Tatra garden", 3, 1800, 15200, "Gasoline", 3.5, true, 1.5));
        sawManager.addSaw(new ToySaw("Child's saw", 0.8, 20, 510, "none", 0, false, 0.7));
        List<Saw> gasolineSaws = sawManager.findAllWithTypeOfEngine("Gasoline");
        assertEquals(2, gasolineSaws.size());
    }

    @Test
    void testPrintAllSaws() {
        var sawManager = new SawManager();
        List<Saw> saws = sawManager.saws;
        sawManager.addSaw(new ElectricSaw("Makita", 4.2, 2500, 20250, "Electric", 3, true, 1.4));
        sawManager.addSaw(new Chainsaw("Kross WXT-1080 XX", 3.2, 3400, 30500, "Gasoline", 3.7, false, 1.7));
        sawManager.addSaw(new UniversalSaw("Tatra garden", 3, 1800, 15200, "Gasoline", 3.5, true, 1.5));
        sawManager.addSaw(new ToySaw("Child's saw", 0.8, 20, 510, "none", 0, false, 0.7));
        assertEquals(4, saws.size());
    }

}