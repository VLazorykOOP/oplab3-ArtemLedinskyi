package AbstractFactory;

public class PCFactory implements ComputerFactory{
    @Override
    public CPU createCPU() {
        return new PC_CPU();
    }

    @Override
    public RAM createRAM() {
        return new PC_RAM();
    }
}
