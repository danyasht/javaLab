package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;

public class SawManager {
    List<Saw> saws = new LinkedList<>();

    public List<Saw> findAllNoWorking() {
        return saws.stream().filter(saw -> saw.getWorking() == false).toList();
    }

    public List<Saw> findAllWithTypeOfEngine(String typeOfEngine) {
        return saws.stream().filter(saw -> saw.getTypeOfEngine() == "Gasoline").toList();
    }

    public List<Saw> findAllWithChainLengthMoreThan(double chainLength) {
        return saws.stream().filter(saw -> saw.getChainLength() > 1.1).toList();
    }

    public List<Saw> findAllWorking() {
        return saws.stream().filter(saw -> saw.getWorking() == true).toList();
    }

    public void addSaw(final Saw saw) {
        this.saws.add(saw);
    }

    public static void main(String[] args) {
        List<Saw> saws = new LinkedList<Saw>();
        SawManager sawManager = new SawManager();
        sawManager.addSaw(new ElectricSaw("Makita", 4.2, 2500, 20250, "Electric", 3, true, 1.4));
        sawManager.addSaw(new Chainsaw("Kross WXT-1080 XX", 3.2, 3400, 30500, "Gasoline", 3.7, false, 1.7));
        sawManager.addSaw(new UniversalSaw("Tatra garden", 3, 1800, 15200, "Gasoline", 3.5, true, 1.5));
        sawManager.addSaw(new ToySaw("Child's saw", 0.8, 20, 510, "none", 0, false, 0.7));

        System.out.println("\t");
        System.out.println("All the saws are: ");

        for (Saw saw : sawManager.saws) {
            System.out.println(saw);
        }

        System.out.println("\t");

        System.out.println("Saws with searched engine type are: ");
        var sawsToBeFound1 = sawManager.findAllWithTypeOfEngine("Gasoline");
        for (Saw saw : sawsToBeFound1) {
            System.out.println(saw);
        }

        System.out.println("\t");

        System.out.println("Saws which aren't working are: ");
        var sawsToBeFound2 = sawManager.findAllNoWorking();
        for (Saw saw : sawsToBeFound2) {
            System.out.println(saw);
        }

        System.out.println("\t");

        System.out.println("Saws which are working are: ");
        var sawsToBeFound3 = sawManager.findAllWorking();
        for (Saw saw : sawsToBeFound3) {
            System.out.println(saw);
        }

        System.out.println("\t");

        System.out.println("Saws with setted chain length: ");
        var sawsToBeFound4 = sawManager.findAllWithChainLengthMoreThan(1.1);
        for (Saw saw : sawsToBeFound4) {
            System.out.println(saw);
        }

        System.out.println("\t");

        for (Saw saw : sawManager.saws) {
            System.out.println("Remaining Working Time is: " + String.format("%.2f", saw.getRemainingWorkTime()) + " sec");
        }
    }
}
