package Adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
