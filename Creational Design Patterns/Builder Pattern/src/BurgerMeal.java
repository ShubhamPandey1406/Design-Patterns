import java.util.List;

public class BurgerMeal {

    //Required Stuffs
    // Fields are finals as we have to make it immutable
    private final String bunType;

    private final String patty;

    //Optional

    private final boolean hasCheese;

    private final List<String> toppings;

    private final String side;

    private final String drink;



    public BurgerMeal(BurgerBuilder burgerBuilder)
    {
        this.bunType=burgerBuilder.bunType;
        this.patty= burgerBuilder.patty;
        this.hasCheese=burgerBuilder.hasCheese;
        this.toppings=burgerBuilder.toppings;
        this.side=burgerBuilder.side;
        this.drink= burgerBuilder.drink;
    }

//    You should override the toString() method inside the BurgerMeal class, not just inside the BurgerBuilder.
//            Why?
//    burgerMeal is an instance of BurgerMeal, not BurgerBuilder.
//
//    So when you do System.out.println(burgerMeal), Java calls burgerMeal.toString().
//
//    If BurgerMeal doesn’t override toString(), you’ll get the default output like:

    @Override
    public String toString() {
        return "BurgerMeal{" +
                "bunType='" + bunType + '\'' +
                ", patty='" + patty + '\'' +
                ", hasCheese=" + hasCheese +
                ", toppings=" + toppings +
                ", side='" + side + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }




    public static class BurgerBuilder
    {


        private final String bunType;

        private final String patty;

        //Optional

        private  boolean hasCheese;

        private  List<String> toppings;

        private  String side;

        private  String drink;



        //Required things will be created
        public BurgerBuilder(String bunType,String patty)
        {
            this.bunType=bunType;
            this.patty=patty;
        }

        // now adding optional things with help of setter method
        public BurgerBuilder withChesee(boolean hasCheese)
        {
            this.hasCheese=hasCheese;
            return this;
        }

        public BurgerBuilder withToppings(List<String> toppings)
        {
            this.toppings=toppings;
            return this;
        }

        public BurgerBuilder withSides(String sides)
        {
            this.side=sides;
            return this;
        }

        public BurgerBuilder withDrinks(String drinks)
        {
            this.drink=drinks;
            return this;
        }

        public BurgerMeal build()
        {
            return new BurgerMeal(this);
        }





    }



}
