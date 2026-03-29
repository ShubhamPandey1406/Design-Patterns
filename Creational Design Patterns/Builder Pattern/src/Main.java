//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BurgerMeal burgerMeal=new BurgerMeal.BurgerBuilder("wheat","veg").withChesee(true).build();
        System.out.println(burgerMeal.toString());
       //if build method is not being called it will be object BurgerBuilder class not Burger meal

    }
}