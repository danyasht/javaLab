package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
public class UniversalSaw extends Saw {
    private double batteryCapacity;
    private String typeOfEngine;

    @Override
    public double getRemainingWorkTime() {
        return (batteryCapacity / getPower());
    }

    public boolean startWork() {
        setWorking(true);
        return getWorking();
    }

    public boolean stopWork() {
        setWorking(false);
        return getWorking();
    }

    public UniversalSaw(String brand, double weight, int power, double batteryCapacity, String typeOfEngine, double hoursOfWork, boolean isWorking, double chainLength) {
        super(brand, weight, power, hoursOfWork, isWorking, chainLength);
        this.batteryCapacity = batteryCapacity;
        this.typeOfEngine = typeOfEngine;
    }
}
