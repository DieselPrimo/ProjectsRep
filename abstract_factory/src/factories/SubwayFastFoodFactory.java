package factories;

import menu.Burger;
import menu.Coffee;
import menu.Salad;
import subwaymenu.SubwayBurger;
import subwaymenu.SubwayCoffee;
import subwaymenu.SubwaySalad;

public class SubwayFastFoodFactory implements FastFoodFactory {

    @Override
    public Coffee makeCoffe() {
        return new SubwayCoffee();
    }

    @Override
    public Burger makeBurger() {
        return new SubwayBurger();
    }

    @Override
    public Salad makeSalad() {
        return new SubwaySalad();
    }
}
