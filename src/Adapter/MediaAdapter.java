package Adapter;
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter() {
        advancedMusicPlayer = new Mp4Player();
    }
    @Override
    public void play(String audioType, String fileName) {
        advancedMusicPlayer.playMp4(fileName);
    }
}
