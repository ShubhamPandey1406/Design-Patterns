import java.util.HashMap;

public class CacheVideoDownloader implements VideoDownloader {
    RealVideoDownloader realVideoDownloader;
    HashMap<String,String> cache;

    public CacheVideoDownloader() {
        this.realVideoDownloader = new RealVideoDownloader();
        this.cache = new HashMap<>();
    }

    @Override
    public String downloadVideo(String videoUrl) {

        if(cache.containsKey(videoUrl))
        {
            System.out.println("Returning cached video for: " + videoUrl);
            return cache.get(videoUrl);
        }

        String video= realVideoDownloader.downloadVideo(videoUrl);
        cache.put(videoUrl,video);
        return video;



    }
}
