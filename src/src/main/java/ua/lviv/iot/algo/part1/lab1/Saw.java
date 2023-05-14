package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class Saw {
    private String brand;
    private double weight;
    private int power;
    private double hoursOfWork;
    private boolean isWorking = false;
    private double chainLength;

    public abstract double getRemainingWorkTime();

    public boolean getWorking() {
        return isWorking;
    }

    public int getPower() {
        return power;
    }

    public String getTypeOfEngine() {
        return getTypeOfEngine();
    }

    public String getHeaders(){
        return "brand" + "," + "weight" + "," + "power" + "," + "hoursOfWork" + "," + "isWorking" + "," + "chainLength";
    }

    public String toCSV(){
        return brand + "," + weight + "," + power + "," + hoursOfWork + "," + isWorking + "," + chainLength;
    }
}
