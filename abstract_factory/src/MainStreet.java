import factories.DonaldFastFoodFactory;
import factories.FastFoodFactory;
import factories.SubwayFastFoodFactory;
import menu.Burger;
import menu.Coffee;
import menu.Salad;

public class MainStreet {
    public static void main(String[] args) {
        FastFoodFactory Donald = new DonaldFastFoodFactory();
        Salad salad = Donald.makeSalad();
        System.out.println("You ate " + salad.getCalories() + " calories");

        FastFoodFactory Subway = new SubwayFastFoodFactory();
        Burger burger = Subway.makeBurger();
        Coffee coffee = Subway.makeCoffe();
        System.out.println("You ate " + (burger.getCalories() + coffee.getCalories()) + " calories");
    }
}
