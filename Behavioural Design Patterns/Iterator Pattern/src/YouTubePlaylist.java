import java.util.ArrayList;
import java.util.List;

public class YouTubePlaylist implements Playlist{

    private List<Video> videos= new ArrayList<>();

    public void addVideo(Video video)
    {
        videos.add(video);
    }

//    public List<Video> getVideos(){
//        return videos;
//    }

    @Override
    public PlaylistIterator createIterator() {
        return new YouTubePlaylistIterator(videos);
    }
}
