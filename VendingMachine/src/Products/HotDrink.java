package Products;

public class HotDrink extends Product {

    private int temperature;

    public HotDrink(String name, Double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int value) {
        this.temperature = value;
    }

    @Override
    public String toString() {
        return "HotDrink{" + super.toString() +
                ", temperature=" + temperature +
                '}';
    }
}
