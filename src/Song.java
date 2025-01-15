public class Song {
    private String title;
    private Singer singer;
    private double duration;

    public Song() {
        this.title = "";
        this.singer = new Singer(); // Default empty singer
        this.duration = 0.0;
    }

    public Song(String title, Singer singer, double duration) {
        this.title = title;
        this.singer = singer;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song: " + title + ", Singer: " + singer + ", Duration: " + duration + " minutes";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return title.equals(song.title) && singer.equals(song.singer);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + singer.hashCode();
        return result;
    }
}
