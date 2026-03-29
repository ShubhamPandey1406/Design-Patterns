public class LogisticService {

    public void Send(String mode)
    {

        Logistic logistic=Factory.getLogistic(mode);
         logistic.send();


    }


}
