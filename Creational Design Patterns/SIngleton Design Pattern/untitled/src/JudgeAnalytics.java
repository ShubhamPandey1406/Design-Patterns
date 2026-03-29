
//Eager Loading. Instance is created as class is loaded and is thread safe

//public class JudgeAnalytics {
//
//    public static final JudgeAnalytics judgeanalytics= new JudgeAnalytics();
//
//    private JudgeAnalytics()
//    {
//
//    }
//
//
//    public static JudgeAnalytics getInstance()
//    {
//        return judgeanalytics;
//    }
//
//}
//--------------------------------


//This is lazy loading, but it is not thread safe, to make it threadsafe synchronised keyword is used
//public class JudgeAnalytics {
//
//    public static  JudgeAnalytics judgeanalytics;
//
//    private JudgeAnalytics()
//    {
//
//    }
//
////Making it thread safe in lazy loading
//    public static synchronized JudgeAnalytics getInstance()
//    {
//        if(judgeanalytics==null) {
//
//            judgeanalytics=new JudgeAnalytics();
//        }
//
//        return judgeanalytics;
//    }
//
//    //Double checked logging
//
//
//
//}


//double check logging
public class JudgeAnalytics {

    public static  volatile JudgeAnalytics judgeanalytics;

    private JudgeAnalytics()
    {

    }

    //Making it thread safe in lazy loading
    public static  JudgeAnalytics getInstance()
    {
        if(judgeanalytics==null) {
            synchronized (JudgeAnalytics.class) {
                if (judgeanalytics == null) {
                    judgeanalytics = new JudgeAnalytics();
                }

            }
        }

        return judgeanalytics;
    }

    //Double checked logging



}
