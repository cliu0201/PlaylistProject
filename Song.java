/**
 * File for a Song class to be used in the Playlist Project
 * @author Cici Liu, Hera Yuan
 * @version 
 */
public class Song
{
    private String title;
    private String name;
    private String artist;
    private double duration;
    private boolean liked;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */

    public Song (String t, String a, double d)
    {
        title = t;
        artist = a;
        duration = d;
        liked = false;
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public double getDuration()
    {
        return duration;
    }

    public Boolean setLiked()
    {
        return liked;
    }

    public void like()
    {
        liked = true;
    }

    public String toString()
    {
        int totalSeconds = (int) Math.round(duration * 60);
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        String time;
        if (seconds < 10) 
        {
            time = minutes + ":0" + seconds;
        } 
        else 
        {
            time = minutes + ":" + seconds;
        }

        String sentence = "“" + title + "” by " + artist + " (" + time + ")";
        if (liked)
        {
            sentence += " -- liked";
        }

        return sentence;
    }
}
