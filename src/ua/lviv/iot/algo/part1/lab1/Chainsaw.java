package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Chainsaw {
    private String brand;
    private int power;
    private double fuelTankCapacity;
    private double fuelLevel;
    private boolean isWorking;
    private static Chainsaw instance = new Chainsaw();

    public void start(boolean isWorking) {
        this.isWorking = true;
    }

    public void stop(boolean isWorking) {
        this.isWorking = false;
    }

    public void cutWood(double length) {
        double fuelNeedForCutting = length / 100;
        if (fuelLevel >= fuelNeedForCutting) {
            fuelLevel -= fuelNeedForCutting;
            isWorking = true;
        } else if (fuelLevel < fuelNeedForCutting) {
            isWorking = false;
        }
    }

    public static Chainsaw getInstance() {
        return instance;
    }

    public static void main(String[] args) {

        Chainsaw[] chainsaws = {
                new Chainsaw(),
                new Chainsaw("Stihl", 2700, 120, 30, true),
                Chainsaw.getInstance(),
                Chainsaw.getInstance()};

        for (var chainsaw : chainsaws) {
            System.out.println(chainsaw);
        }

    }
}

