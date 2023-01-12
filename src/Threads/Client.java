package Threads;

import Class.Orchard;

public class Client extends Thread {

    private String name;
    private Orchard orchard;
    private int consumptionTime;
    private int maxOfVegetables;

    public Client(String name, int maxOfVegetables, Orchard orchard, int consumptionTime) {
        this.name = name;
        this.maxOfVegetables = maxOfVegetables;
        this.orchard = orchard;
        this.consumptionTime = consumptionTime;
    }

    public void run() {
        int consumedVegetables = 0;
        while (this.maxOfVegetables > consumedVegetables) {
            try {
                Thread.sleep(consumptionTime * 1000);
                String vegetableObtained = this.orchard.pickUp(this.name);
                System.out.println(this.name + " ha comprado " + vegetableObtained);
                this.orchard.showStock();
            } catch (InterruptedException excep) {
                System.err.println(excep);
            }
            consumedVegetables++;
        }
    }

}
