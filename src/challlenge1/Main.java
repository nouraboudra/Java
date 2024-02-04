package challlenge1;

public class Main {
    public static void main(String[] args) {

        MP3Player mp3Player = new MP3Player("Song.mp3");
        CDPlayer cdPlayer = new CDPlayer("CD123");

        MusicLibrary library = new MusicLibrary();
        library.addTrack(mp3Player);
        library.addTrack(cdPlayer);

        library.displayLibrary();

        library.manageTracks(1);
    }
}