package Threads;

import Class.Orchard;
import Utils.Utils;

public class Farmer extends Thread {

    private String name;
    private Orchard orchard;
    private int growingTime;
    private int producedVegetables = 0;
    private int totalOfVegetables;

    public Farmer(String name, int totalOfVegetables, Orchard orchard, int growingTime) {
        this.name = name;
        this.totalOfVegetables = totalOfVegetables;
        this.orchard = orchard;
        this.growingTime = growingTime;
        this.setPriority(10);
    }

    public void run() {
        try {

            while (producedVegetables < totalOfVegetables) {
                Thread.sleep(growingTime * 1000);
                this.orchard.plant(Utils.getRandomVegetable(), this.name);
                this.orchard.showStock();
                producedVegetables++;
            }

        } catch (InterruptedException excep) {
            {
                System.err.println("No produzco...");
            }
        }
    }
}
