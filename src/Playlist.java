import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;


    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }


    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }


    @Override
    public String toString() {
        StringBuilder songTitles = new StringBuilder();
        for (Song song : songs) {
            songTitles.append(song.getTitle()).append(", ");
        }
        return "Playlist: " + name + ", Songs: " + songTitles.toString();
    }
}
