package creators;

import cars.Audi;
import cars.Car;

public class AudiCreator extends CarCreator {

    public AudiCreator(String creator, String color, int cost) {
        super(creator, color, cost);
    }

    @Override
    public Car FactoryMethod(String creator, String color, int cost) {
        return new Audi(creator, color, cost);
    }

}
