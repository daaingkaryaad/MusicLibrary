public class Main {
    public static void main(String[] args) {
        Song solistSong1 = new SolistSong("Make a wish", 2.22, "Bayymack");
        Song solistSong2 = new SolistSong("Strangers", 5.44, "Ethel Cain");
        Song bandSong1 = new BandSong("We are the people", 4.27, "Empire Of The Sun");
        Song bandSong2 = new BandSong("Something in the way", 3.52, "Nirvana");


        Playlist playlist = new Playlist("My Playlist");
        playlist.addSong(solistSong1);
        playlist.addSong(solistSong2);
        playlist.addSong(bandSong1);
        playlist.addSong(bandSong2);


        System.out.println("Filtered songs by title 'Strangers': " + playlist.filterByTitle("Strangers"));
        System.out.println("Songs by 'Ethel Cain': " + playlist.searchByArtist("Ethel Cain"));


        playlist.sortByDuration();
        System.out.println("Playlist after sorting by duration: " + playlist);
    }
}
