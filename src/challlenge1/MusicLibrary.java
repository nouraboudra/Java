package challlenge1;

import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<AudioPlayer> tracks;

    public MusicLibrary() {
        this.tracks = new ArrayList<>();
    }

    public void addTrack(AudioPlayer track) {
        tracks.add(track);
    }

    public void manageTracks(int trackIndex) {
        if (tracks.isEmpty()) {
            System.out.println("No tracks in the library.");
            return;
        }

        if (trackIndex >= 0 && trackIndex < tracks.size()) {
            AudioPlayer selectedTrack = tracks.get(trackIndex);
            selectedTrack.Play();
            selectedTrack.pause();
            selectedTrack.Stop();
        } else {
            System.out.println("Invalid track index.");
        }
    }

    public void displayLibrary() {
        System.out.println("Library contents:");
        for (AudioPlayer track : tracks) {
            System.out.println("- " + track.getClass().getSimpleName());
        }
    }
}
