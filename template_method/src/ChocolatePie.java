public class ChocolatePie extends Pie {

    public ChocolatePie(int size, int temperature, String topping) {
        super(size, temperature, topping);
    }

    @Override
    protected void prepare(int size) {
        System.out.println("Add more chocolate as u can! Size, about " + size);
    }

    @Override
    protected void bake(int temerature) {
        System.out.println("bake in a middle shelf, with " + temerature + "c");
    }

    @Override
    protected void addTopping(String topping) {
        System.out.println("U choose " + topping + " topping");

    }
}
