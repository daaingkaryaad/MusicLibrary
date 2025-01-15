public abstract class Song {
    private String title;
    private double duration;

    public Song() {
    }

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public abstract String getArtist();

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song: " + title + ", Duration: " + duration + " minutes";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return title.equals(song.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
