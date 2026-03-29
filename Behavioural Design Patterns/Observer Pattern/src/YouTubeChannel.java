import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Channel{

    private List<Subscriber> subsribers= new ArrayList<>();
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subsribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subsribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber(String videoTitle) {

        for(Subscriber subscriber:subsribers)
        {
            subscriber.update(videoTitle);
        }

    }

    public void Upload(String videTitle)
    {
        System.out.println(channelName +" uploaded a new video "+ videTitle);
        notifySubscriber(videTitle);
    }
}
