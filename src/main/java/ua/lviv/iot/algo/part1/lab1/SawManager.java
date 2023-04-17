package ua.lviv.iot.algo.part1.lab1;

import java.io.IOException;
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


}
