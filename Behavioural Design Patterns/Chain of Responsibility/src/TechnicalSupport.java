public class TechnicalSupport extends SupportHandler{


    @Override

    public void handleRequest(String requestType) {
        if(requestType.equalsIgnoreCase("technical"))
        {
            System.out.println("Technicalsupport: Handling technical request");
        }
        else if(nextHandler!=null)
        {
            nextHandler.handleRequest(requestType);
        }
    }
}
