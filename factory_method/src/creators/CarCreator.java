package creators;

import cars.Car;

public abstract class CarCreator {

    private String creator;
    private String color;
    private int cost;

    public CarCreator(String creator, String color, int cost) {
        this.creator = creator;
        this.color = color;
        this.cost = cost;
    }

    protected abstract Car FactoryMethod(String creator, String color, int cost);

    public Car MakeCar() {
        final Car myCar = FactoryMethod(creator, color, cost);
        myCar.setCost(myCar.getCost() + 100);
        return myCar;
    }
}
