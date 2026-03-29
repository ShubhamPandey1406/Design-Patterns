public class RazorpayGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing INR Payment via Razorpay " + amount);
    }
}
