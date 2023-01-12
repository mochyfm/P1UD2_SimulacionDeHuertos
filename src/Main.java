import Class.Client;
import Threads.Farmer;
import Threads.Orchard;

public class Main {
    public static void main(String[] args) {
        
        Orchard myOrchard = new Orchard();

        Farmer paco = new Farmer("Paco", 5, myOrchard);
        Client pedro = new Client("Pedro", 5, myOrchard);

        paco.start();
        pedro.start();

    }
}
