import AbstractFactory.*;
import Adapter.AudioPlayer;
import Visitor.Computer;
import Visitor.ComputerPart;
import Visitor.ComputerPartDisplayVisitor;

public class Main {
    public static void main(String[] args) {
        ComputerFactory factory;

        // Створення компонентів для ПК
        factory = new PCFactory();
        CPU pcCPU = factory.createCPU();
        RAM pcRAM = factory.createRAM();
        pcCPU.process();
        pcRAM.store();

        // Створення компонентів для Серверу
        factory = new ServerFactory();
        CPU serverCPU = factory.createCPU();
        RAM serverRAM = factory.createRAM();
        serverCPU.process();
        serverRAM.store();

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");


        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}