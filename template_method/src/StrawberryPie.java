public class StrawberryPie extends Pie {

    public StrawberryPie(int size, int temperature, String topping) {
        super(size, temperature, topping);
    }

    @Override
    protected void prepare(int size) {
        System.out.println("Put some strawberry and cream) Size, about " + size);
    }

    @Override
    protected void bake(int temperature) {
        System.out.println("bake in a upper shelf, with " + temperature + "c");
    }

    @Override
    protected void addTopping(String topping) {
        System.out.println("Also u can add " + topping + " topping, but i don't recommend to do this");
    }
}
