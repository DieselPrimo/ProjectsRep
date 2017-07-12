package factories;

import donaldmenu.DonaldBurger;
import donaldmenu.DonaldCoffee;
import donaldmenu.DonaldSalad;
import menu.Burger;
import menu.Coffee;
import menu.Salad;


public class DonaldFastFoodFactory implements FastFoodFactory {

    @Override
    public Coffee makeCoffe() {
        return new DonaldCoffee();
    }

    @Override
    public Burger makeBurger() {
        return new DonaldBurger();
    }

    @Override
    public Salad makeSalad() {
        return new DonaldSalad();
    }
}
