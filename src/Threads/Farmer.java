package Threads;

import Utils.Utils;

public class Farmer extends Thread{

    private String name;
    private Orchard orchard;
    private int producedVegetables = 0;
    private int totalOfVegetables;

    public Farmer(String name, int totalOfVegetables, Orchard orchard) {
        this.name = name;
        this.totalOfVegetables = totalOfVegetables;
        this.orchard = orchard;
    }
    
    public int growingTime() {
        return Utils.getRandomNumber(20);
    }

    public void run() {
        try {

            while(producedVegetables < totalOfVegetables) {
                sleep(growingTime());
                this.orchard.plant(Utils.getRandomVegetable(), this.name);
                this.orchard.showStock();
                producedVegetables++;
            }

        } catch (InterruptedException excep) {{
            System.err.println("No produzco...");
        }}
    }
}
