package pe.edu.dps.patterns.structural.adapter3;

public class Main {
    public static void main(String args[]) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
        audioPlayer.play("mp5", "dsp.mp5");
    }
}
