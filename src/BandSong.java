public class BandSong extends Song {
    private String bandName;

    public BandSong() {
        super();
    }

    public BandSong(String title, double duration, String bandName) {
        super(title, duration);
        this.bandName = bandName;
    }

    @Override
    public String getArtist() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return super.toString() + ", Band: " + bandName;
    }
}
