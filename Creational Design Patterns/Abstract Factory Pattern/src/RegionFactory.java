
//now here we are creating a factory that will used to create another factory
//locationwise. Here we will use interface of paymentGateway and invoice as a return type
//for methods
public interface RegionFactory {

    PaymentGateway createPaymentGateway(String gateWayType);
    Invoice createInvoice();
}
