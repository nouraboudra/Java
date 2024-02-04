package challlenge1;

public class MP3Player extends AudioPlayer{

    private String mp3File;

    public MP3Player(String mp3File) {
        this.mp3File = mp3File;
    }

    @Override
    public void Play() {
        System.out.println("Playing MP3 file: " + mp3File);
    }

    @Override
    public void pause() {
        System.out.println("Pausing MP3 file: " + mp3File);
    }

    @Override
    public void Stop() {
        System.out.println("Stopping MP3 file: " + mp3File);
    }
}
