package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class ElectricSaw extends Saw {
    private double batteryCapacity;
    private String typeOfEngine;

    @Override
    public double getRemainingWorkTime() {
        return (batteryCapacity / getPower());
    }

    public boolean StartWork() {
        setWorking(true);
        return getWorking();
    }

    public boolean StopWork() {
        setWorking(false);
        return getWorking();
    }

    public ElectricSaw(String brand, double weight, int power, double batteryCapacity, String typeOfEngine, double hoursOfWork, boolean isWorking, double chainLength) {
        super(brand, weight, power, hoursOfWork, isWorking, chainLength);
        this.batteryCapacity = batteryCapacity;
        this.typeOfEngine = typeOfEngine;
    }
}
