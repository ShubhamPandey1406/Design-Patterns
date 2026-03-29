public class CheckOutService {

    private PaymentGateway paymentGateway;
    private  Invoice invoice;
    private String gateWayType;
    private RegionFactory factory;


    //Here RegionFactory is taking care in deciding which Location object
    //will be created
    public CheckOutService(String gatewayType,String area)
    {
        this.factory=RegionGenerate.getRegion(area);
        this.gateWayType=gatewayType;
        this.paymentGateway= factory.createPaymentGateway(gateWayType);
        this.invoice= factory.createInvoice();
    }

    public void completeOrder(double amount) {
        paymentGateway.processPayment(amount);
        invoice.generateInvoice();
    }
}
