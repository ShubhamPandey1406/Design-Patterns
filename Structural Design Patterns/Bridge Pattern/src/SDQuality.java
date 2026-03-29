import java.net.StandardSocketOptions;

public class SDQuality implements VideoQuality{
    @Override
    public void load(String title) {

        System.out.println("Stream " + title + " in SD quality");
    }
}
