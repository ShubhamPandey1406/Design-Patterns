public class NearestDriverStrategy implements  MatchingStrategy{
    @Override
    public void match(String riderLocation) {
        System.out.println("Matching with the nearest driver available to "+riderLocation);
    }
}
