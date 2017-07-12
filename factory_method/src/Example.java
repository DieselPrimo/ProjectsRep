import cars.Car;
import creators.CarCreator;
import creators.MercedesCreator;

public class Example {

    public static void main(String[] args) {
        String creator = "Mercedes", creator2 = "Audi";
        String color = "Red", color2 = "Blue";
        int cost = 35000, cost2 = 20000;
        CarCreator car = new MercedesCreator(creator, color, cost);
        Car car2 = car.MakeCar();
    }
}
