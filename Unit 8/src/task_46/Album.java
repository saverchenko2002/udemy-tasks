package task_46;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double songDuration) {
        if (findSong(songTitle) != null) {
            return false;
        }
        return songs.add(new Song(songTitle, songDuration));
    }

    private Song findSong(String title) {
        Iterator<Song> songIterator = songs.iterator();
        Song currentSong;
        while (songIterator.hasNext()) {
            currentSong = songIterator.next();
            if (currentSong.getTitle().equals(title)) {
                return currentSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> currentPlaylist) {
        if (songs.size() < trackNumber || trackNumber <= 0) {
            return false;
        }
        Song searchedSong = songs.get(trackNumber - 1);
        if (searchedSong == null) {
            return false;
        }
        return currentPlaylist.add(songs.get(trackNumber - 1));
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> currentPlaylist) {
        Song optionalSong = findSong(songTitle);
        if (optionalSong == null) {
            return false;
        }
        return currentPlaylist.add(optionalSong);
    }
}
