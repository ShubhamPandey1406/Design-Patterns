//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationSendorTemplate emailSender = new EmailNotification();
        emailSender.send("john@example.com", "Welcome to TUF+!");

        System.out.println(" ");

        NotificationSendorTemplate smsSender = new SMSNotification();
        smsSender.send("9876543210", "Your OTP is 4567.");
    }
}