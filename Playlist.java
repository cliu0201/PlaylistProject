import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist()
    {
        playlist = new ArrayList<Song>();
    }
    
       /**
       * Adding a song
       */
      
    public void addSong(Song song)
    {
        playlist.add(song);
    }
    
     /**
       * 'liking' a song
       */
    public void likeSong(Song song)
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).equals(song))
            {
                playlist.get(i).like();
            }
        }
    }
    
    public void removeSong(Song song)
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).equals(song))
            {
                playlist.remove(i);
                break;
            }
        }
    }

    public void listSongs()
    {
        for (Song song : playlist)
        {
            System.out.println(song);
        }
    }
    
    public void listLikedSongs()
    {
        for (Song song : playlist)
        {
            if (song.setLiked())
            {
                System.out.println(song);
            }
        }
    }
    
    public String getPlaylistDuration()
    {
         int totalSeconds = 0;
        for (Song song : playlist)
        {
            totalSeconds += (int) Math.round(song.getDuration() * 60);
        }
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        String finalSeconds;
        if (seconds < 10)
        {
            finalSeconds = "0" + seconds;
        }
        else
        {
            finalSeconds = Integer.toString(seconds);
        }
        return minutes + ":" + finalSeconds;
    }
    
    public void removeUnlikedSongs()
     {
        for (int i = playlist.size() - 1; i >= 0; i--)
        {
            if (!playlist.get(i).setLiked())
            {
                playlist.remove(i);
            }
        }
    }
}
