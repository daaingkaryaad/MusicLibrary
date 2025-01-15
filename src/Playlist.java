import java.util.*;
import java.util.stream.Collectors;

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

    public List<Song> filterByTitle(String partOfTitle) {
        return songs.stream()
                .filter(song -> song.getTitle().contains(partOfTitle))
                .collect(Collectors.toList());
    }

    public List<Song> searchByArtist(String artist) {
        return songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .collect(Collectors.toList());
    }

    public void sortByDuration() {
        songs.sort(Comparator.comparingDouble(Song::getDuration));
    }

    public List<String> getSongTitles() {
        return songs.stream()
                .map(Song::getTitle)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Playlist: " + name + ", Songs: " + getSongTitles();
    }
}
