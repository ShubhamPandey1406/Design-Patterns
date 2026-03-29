public class HDQuality implements VideoQuality{
    @Override
    public void load(String title) {
        System.out.println("Stream " + title + " in HD quality");
    }
}
