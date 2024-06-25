package AbstractFactory;

public class ServerFactory implements ComputerFactory{
    @Override
    public CPU createCPU() {
        return new Server_CPU();
    }

    @Override
    public RAM createRAM() {
        return new Server_RAM();
    }
}
