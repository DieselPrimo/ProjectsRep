package creators;

import cars.Car;
import cars.Mercedes;

public class MercedesCreator extends CarCreator {

    public MercedesCreator(String creator, String color, int cost) {
        super(creator, color, cost);
    }

    @Override
    public Car FactoryMethod(String creator, String color, int cost) {
        return new Mercedes(creator, color, cost);
    }
}
