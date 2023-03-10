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
        }
        else if (fuelLevel < fuelNeedForCutting){
            isWorking = false;
        }
    }

    public static Chainsaw getInstance(){
        return instance;
    }

    @Override
    public String toString(){
        return "Chainsaw brand: " +brand +", power: " +power +", fuel capacity: " +fuelTankCapacity +", fuel level: " +fuelLevel;
    }
    public static void main(String[] args) {
        Chainsaw woodChainsaw = new Chainsaw ("Dnipro-M", 2600, 100, 20, true);
        woodChainsaw.start(true);
        System.out.println(woodChainsaw.isWorking);
        woodChainsaw.stop(false);
        System.out.println(woodChainsaw.isWorking);
        woodChainsaw.cutWood(2400);
        System.out.println(woodChainsaw.isWorking);
        woodChainsaw.cutWood(1000);
        System.out.println(woodChainsaw.isWorking);

        Chainsaw[] chainsaws = new Chainsaw[4];
        chainsaws[0] = Chainsaw.getInstance();
        chainsaws[1] = new Chainsaw();
        chainsaws[2] = new Chainsaw("Stihl", 2700, 120, 30, true);
        chainsaws[3] = Chainsaw.getInstance();

        for (int i = 0; i < chainsaws.length; i++){
            System.out.println("Chainsaw brand is " + chainsaws[i].getBrand());
        }

        System.out.println(woodChainsaw.toString());
    }
}

