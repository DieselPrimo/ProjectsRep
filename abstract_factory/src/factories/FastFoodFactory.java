package factories;

import menu.Burger;
import menu.Coffee;
import menu.Salad;


public interface FastFoodFactory {
    public Coffee makeCoffe();

    public Burger makeBurger();

    public Salad makeSalad();
}
