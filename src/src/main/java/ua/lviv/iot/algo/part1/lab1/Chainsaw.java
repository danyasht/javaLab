package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString(callSuper = true)
public class Chainsaw extends Saw {
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

    public Chainsaw(String brand, double weight, int power, double batteryCapacity, String typeOfEngine, double hoursOfWork, boolean isWorking, double chainLength) {
        super(brand, weight, power, hoursOfWork, isWorking, chainLength);
        this.batteryCapacity = batteryCapacity;
        this.typeOfEngine = typeOfEngine;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "batteryCapacity" + "," + "typeOfEngine";
    }

    public String toCSV() {
        return super.toCSV() + "," + batteryCapacity + "," + typeOfEngine;
    }
}
