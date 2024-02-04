package challlenge1;

public  abstract class  AudioPlayer implements Playable {

    private int volume = 50;
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

}

