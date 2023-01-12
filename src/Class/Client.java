package Class;

import Threads.Orchard;
import Utils.Utils;

public class Client extends Thread {

    private String name;
    private Orchard orchard;
    private int maxOfVegetables;

    public Client(String name, int maxOfVegetables, Orchard orchard) {
        this.name = name;
        this.maxOfVegetables = maxOfVegetables;
        this.orchard = orchard;
    }

    public int consumptionTime() {
        return Utils.getRandomNumber(20);
    }

    public void run() {
        int consumedVegetables = 0;
        while(this.maxOfVegetables > consumedVegetables) {
            try {
                Thread.sleep(consumptionTime());
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
