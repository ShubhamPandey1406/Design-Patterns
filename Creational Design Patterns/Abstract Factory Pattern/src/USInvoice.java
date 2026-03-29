import java.net.StandardSocketOptions;

public class USInvoice implements Invoice{
    @Override
    public void generateInvoice() {

        System.out.println("Invoice genrated for USA");
    }
}
