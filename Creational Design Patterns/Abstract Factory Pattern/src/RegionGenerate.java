public class RegionGenerate {
    public static RegionFactory getRegion(String region)
    {
         if(region.equalsIgnoreCase("India"))
         {
             return new IndiaFactory();
         }
         else if(region.equalsIgnoreCase("US"))
         {
             return new USFactory();
         }

         throw new IllegalArgumentException("Unknown region" + region);
    }
}
