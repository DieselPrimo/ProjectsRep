public abstract class Pie {

    int size, temperature;
    String topping;

    public Pie(int size, int temperature, String topping) {
        this.size = size;
        this.temperature = temperature;
        this.topping = topping;
    }

    protected abstract void prepare(int size);

    protected abstract void bake(int temperature);

    protected abstract void addTopping(String topping);

    public final void makePie() {
        prepare(size);
        bake(temperature);
        addTopping(topping);
    }
}
