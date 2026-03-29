public class Stripe implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing USD Payment via Stripe " + amount);
    }
}
