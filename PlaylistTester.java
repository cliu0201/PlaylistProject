/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author Cici Liu & Hera Yuan
 * @version Cici's commmit
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        Song s1 = new Song("Everything Everywhere", "Noah Kahan", 257.0 / 60.0);
        Song s2 = new Song("OK Love You Bye", "Olivia Dean", 154.0 / 60.0);
        Song s3 = new Song("Tears", "Sabrina Carpenter", 160.0 / 60.0);
        Song s4 = new Song("Free Now", "Gracie Abrams", 214.0 / 60.0);
        p.addSong(s1);
        p.addSong(s2);
        p.addSong(s3);
        p.addSong(s4);
        
        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        p.listSongs();

        System.out.println("\nLiking the songs 'Everything Everywhere' and 'Tears'\n");
        p.likeSong(s1);
        p.likeSong(s3);

        System.out.println("Printing the songs...\n");
        p.listSongs();

        System.out.println("\nRemoving the song 'OK Love You Bye'\n");
        p.removeSong(s2);

        System.out.println("Printing the songs...\n");
        p.listSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        p.listLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        System.out.println(p.getPlaylistDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        p.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        p.listSongs();
        System.out.println();
    }
}
