import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
    public boolean addSong(String name, double duration){
        return this.songs.add(new Song(name,duration));
    }
    public boolean addToPlayList(int tracker,LinkedList<Song> playlist){
        Song it = this.songs.findSong(tracker);
        if (it!=null){
            playlist.add(it);
            return true;
        }else {
            return false;
        }
    }
    public boolean addToPlayList(String name, LinkedList<Song> playlist){
        Song it = songs.findSong(name);
        if (it == null){
            playlist.add(it);
            return true;
        }else {
            return false;
        }
    }
    public static class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs=new ArrayList<>();
        }
        public boolean add(Song son){
            if (songs.contains(son)){
                return false;
            }else {
                songs.add(son);
                return true;
            }
        }
        public Song findSong(String name){
            for (Song it: this.songs){
                if (it.getTitle().equals(name)){
                    return it;
                }
            }
            return null;
        }
        public Song findSong(int it) {
            int i = it - 1;
            if (i >= 0 && i < songs.size()) {
                return songs.get(i);
            } else {
                return null;
            }
        }
    }
}
