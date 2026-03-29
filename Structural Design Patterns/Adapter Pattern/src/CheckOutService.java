public class CheckOutService {

    private PaymentGateway paymentGateway;

    public CheckOutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public  void  checkout(String orderId, double amount)
    {
        paymentGateway.pay(orderId, amount);
    }
}
