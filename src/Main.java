public class Main {
    public static void main(String[] args) {

        Singer singer1 = new Singer("The Beatles");
        Song song1 = new Song("Hey Jude", singer1.getName(), 7.08);
        Song song2 = new Song("Let It Be", singer1.getName(), 4.03);


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
