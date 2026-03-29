//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CheckOutService indiaCheckout = new CheckOutService( "razorpay","india");
        indiaCheckout.completeOrder(1999.0);

        System.out.println("---");

        // Using PayPal in US
        CheckOutService usCheckout = new CheckOutService( "paypal","us");
        usCheckout.completeOrder(49.99);


    }
}