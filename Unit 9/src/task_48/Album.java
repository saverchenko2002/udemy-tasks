package task_48;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            return songs.add(song);
        }

        private Song findSong(String title) {
            Iterator<Song> songsIterator = songs.iterator();
            Song currentSong;
            while (songsIterator.hasNext()) {
                currentSong = songsIterator.next();
                if (currentSong.getTitle().equals(title)) {
                    return currentSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if (songs.size() < trackNumber || trackNumber <= 0 || songs.get(trackNumber - 1) == null) {
                return null;
            }

            return songs.get(trackNumber - 1);
        }
    }

    public boolean addSong(String songTitle, double songDuration) {
        if (songs.findSong(songTitle) != null) {
            return false;
        }
        return songs.add(new Song(songTitle, songDuration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> currentPlaylist) {
        Song searchedSong;
        searchedSong = songs.findSong(trackNumber);
        if (searchedSong != null) {
            return currentPlaylist.add(searchedSong);
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> currentPlaylist) {
        Song optionalSong = songs.findSong(songTitle);
        if (optionalSong == null) {
            return false;
        }
        return currentPlaylist.add(optionalSong);
    }
}
