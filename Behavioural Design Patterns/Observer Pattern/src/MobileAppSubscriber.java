public class MobileAppSubscriber implements Subscriber{
    private String Username;

    public MobileAppSubscriber(String username) {
        Username = username;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("In-app notification for "+ Username + " new video uploaded "+ videoTitle);
    }
}
