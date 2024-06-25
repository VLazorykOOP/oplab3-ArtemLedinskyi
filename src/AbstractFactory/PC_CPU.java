package AbstractFactory;

public class PC_CPU implements CPU{
    @Override
    public void process() {
        System.out.println("Processing with PC CPU");
    }
}
