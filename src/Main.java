public class Main {
    public static void main(String[] args) {
        Singer singer1 = new Singer("Charli xcx");
        Song song1 = new Song("Guess", singer1, 2.23);
        Song song2 = new Song("365", singer1, 3.23);

        Playlist playlist = new Playlist("My Favorite Songs");
        playlist.addSong(song1);
        playlist.addSong(song2);

        System.out.println(song1);
        System.out.println(song2);
        System.out.println(playlist);

        if (song1.equals(song2)) {
            System.out.println("The songs are the same.");
        } else {
            System.out.println("The songs are different.");
        }
    }
}
