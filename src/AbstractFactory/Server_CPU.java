package AbstractFactory;

public class Server_CPU implements CPU{
    @Override
    public void process() {
        System.out.println("Processing with Server CPU");
    }
}
