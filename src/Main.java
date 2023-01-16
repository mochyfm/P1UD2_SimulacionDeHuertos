import Class.Orchard;
import Threads.Client;
import Threads.Farmer;

public class Main {
    public static void main(String[] args) {

        Orchard myOrchard = new Orchard();

        Farmer paco = new Farmer("Paco", 5, myOrchard, 3);
        Client pedro = new Client("Pedro", 5, myOrchard, 3);

        paco.start();
        pedro.start();

    }
}
