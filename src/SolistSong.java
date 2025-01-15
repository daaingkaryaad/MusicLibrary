public class SolistSong extends Song {
    private String artist;

    public SolistSong() {
        super();
    }

    public SolistSong(String title, double duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist;
    }
}
