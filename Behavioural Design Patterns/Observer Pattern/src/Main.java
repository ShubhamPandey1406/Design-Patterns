//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        YouTubeChannel channel= new YouTubeChannel("System design basics");

        channel.subscribe(new EmailSubscriber("shubha123@gmail.com"));
        channel.subscribe(new MobileAppSubscriber("Shubham"));
        channel.Upload("Design Patterns");

    }
}