public class RazorpayAdapter implements PaymentGateway{

    RazorPayAPI razorPayAPI;

    public RazorpayAdapter() {
        this.razorPayAPI = new RazorPayAPI();
    }

    @Override
    public void pay(String orderId, double amount) {

        razorPayAPI.makePayment(orderId, amount);

    }
}
