package cars;

public class Car {

    private String creator;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    private String color;
    private int cost;

    public Car(String creator, String color, int cost) {
        this.creator = creator;
        this.color = color;
        this.cost = cost;
    }

}
