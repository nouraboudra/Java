package challlenge1;

public class CDPlayer extends AudioPlayer {
    private String cdIdentifier;

    public CDPlayer(String cdIdentifier) {
        this.cdIdentifier = cdIdentifier;
    }

    @Override
    public void Play() {
        System.out.println("Playing CD: " + cdIdentifier);
    }

    @Override
    public void pause() {
        System.out.println("Pausing CD: " + cdIdentifier);
    }

    @Override
    public void Stop() {
        System.out.println("Stopping CD: " + cdIdentifier);
    }
}
