package AbstractFactory;

public class Server_RAM implements RAM{
    @Override
    public void store() {
        System.out.println("Storing with Server RAM");
    }
}
