 class GeneralSupport extends SupportHandler{



     @Override
    public void handleRequest(String requestType) {

        if(requestType.equalsIgnoreCase("general"))
        {
            System.out.println("General Support : Handle general querry");
        }
        else if(nextHandler!=null)
        {
            nextHandler.handleRequest(requestType);
        }
    }
}
