public class RealVideoDownloader implements VideoDownloader{
    @Override
    public String downloadVideo(String videoUrl) {
        System.out.println("Dwonloading from URL + " + videoUrl);
        return "Video content from " + videoUrl;
    }
}
