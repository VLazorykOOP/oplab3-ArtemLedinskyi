package AbstractFactory;

public class PC_RAM implements RAM{
    @Override
    public void store() {
        System.out.println("Storing with PC RAM");
    }
}
