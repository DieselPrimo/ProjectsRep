public class Kitchen {

    public static void main(String[] args) {
        int size = 30, temperature = 180;
        String topping = "Strawberry";

        Pie firstPie = new ChocolatePie(size, temperature, topping);
        firstPie.makePie();

        Pie secondPie = new StrawberryPie(size, temperature, topping);
        secondPie.makePie();
    }
}
