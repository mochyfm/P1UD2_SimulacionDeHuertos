package Threads;

import java.util.ArrayList;
import java.util.Iterator;

public class Orchard {

    private int maxOfVegetables = 10;
    private ArrayList<String> orchard = new ArrayList<>();

    public Orchard(int maxOfVegetables) {
        this.maxOfVegetables = maxOfVegetables <= 0 ? 10 : maxOfVegetables;
    }

    public Orchard() {

    }

    synchronized public void plant(String vegetable, String farmerName) {
        try {
            while(orchard.size() >= maxOfVegetables) {
                wait();
            }
            
            orchard.add(vegetable);
            System.out.println(farmerName + " ha plantado una " + vegetable);
            notify();

        } catch(InterruptedException excep) {
            System.err.println(excep);
        }
    }

    synchronized public void showStock() {
        if (orchard.size() != 0) {
            Iterator<String> stock = orchard.iterator();
            System.out.println("En el huerto hay un total de " + orchard.size() + " verduras plantadas.");
            
            while(stock.hasNext()) {
                System.out.println(" - " + stock.next());
                if (!stock.hasNext()) {
                    System.out.println(" ");
                }
            }

        } else {
            System.out.println("No hay verduras en el huerto todavía.\n");
        }
    }

    synchronized public String pickUp(String clientName) {
        try {
            
            while(orchard.size() == 0) {
                wait();
            }
            notify();
            
            return orchard.remove(0);

        } catch (InterruptedException excep) {
            System.err.println(excep);
            return null;
        }
    }

}
