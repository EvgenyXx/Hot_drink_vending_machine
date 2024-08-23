package vending_machine.product;

public class HotDrinks  extends  Product{
    private final int temperature;
    private final double volume;

    public double getVolume() {
        return volume;
    }

    public HotDrinks(int id, String name, int price, int temperature, double volume) {
        super(id, name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString()+ ", volume=" + this.volume + " , temperature=" + this.temperature + "°C";
    }
}
