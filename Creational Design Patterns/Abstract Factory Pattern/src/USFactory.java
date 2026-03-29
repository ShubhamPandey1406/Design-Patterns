public class USFactory implements RegionFactory{

    public PaymentGateway createPaymentGateway(String gatewayType) {
        if (gatewayType.equalsIgnoreCase("paypal")) {
            return new PayPal();
        } else if (gatewayType.equalsIgnoreCase("stripe")) {
            return new Stripe();
        }
        throw new IllegalArgumentException("Unsupported gateway for US: " + gatewayType);
    }

    public Invoice createInvoice() {
        return new USInvoice();
    }
}
