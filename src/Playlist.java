import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final String name;
    private final List<Song> songs;

    public Playlist() {
        this.name = "";
        this.songs = new ArrayList<>();
    }

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

    public int getSongCount() {
        return songs.size();
    }

    @Override
    public String toString() {
        if (songs.isEmpty()) {
            return "Playlist: " + name + ", No songs available";
        }
        StringBuilder songTitles = new StringBuilder();
        for (int i = 0; i < songs.size(); i++) {
            songTitles.append(songs.get(i).getTitle());
            if (i < songs.size() - 1) {
                songTitles.append(", ");
            }
        }
        return "Playlist: " + name + ", Songs: " + songTitles.toString();
    }
}
