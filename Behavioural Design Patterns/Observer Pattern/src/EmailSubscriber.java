public class EmailSubscriber implements Subscriber{

    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("email is sent to " + email + " video is uploaded " + videoTitle);
    }
}
