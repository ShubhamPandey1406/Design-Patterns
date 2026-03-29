//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SupportHandler general= new GeneralSupport();
        SupportHandler billing= new BillingSupport();
        SupportHandler technical= new TechnicalSupport();
        SupportHandler delivery= new DeliverySupport();

        general.setNextHandler(billing);
        billing.setNextHandler(technical);
        technical.setNextHandler(delivery);

        general.handleRequest("abc");
    }
}