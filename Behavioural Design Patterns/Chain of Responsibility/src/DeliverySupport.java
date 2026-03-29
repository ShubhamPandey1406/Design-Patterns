public class DeliverySupport extends SupportHandler{



    @Override
    public void handleRequest(String requestType) {
        if(requestType.equalsIgnoreCase("delivery"))
        {
            System.out.println("DeliverySupport: Handling delivery request");
        }
        else if(nextHandler!=null)
        {
            nextHandler.handleRequest(requestType);
        }
        else
        {
            System.out.println("DeliverySupport :No handler found for the request");
        }
    }
}
