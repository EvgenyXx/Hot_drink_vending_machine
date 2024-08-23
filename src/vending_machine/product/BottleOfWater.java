package vending_machine.product;

public class BottleOfWater extends Product{
    private int volume;

    public BottleOfWater(int volume) {
        this.volume = volume;
    }


    public void setVolume(int volume) {
        this.volume = volume;
    }


    public int getVolume() {
        return volume;
    }



    public BottleOfWater(int id, String name, int price,int volume) {
        super(id, name, price);
        this.volume = volume;
    }

    public BottleOfWater() {
    }

    @Override
    public String toString() {
        return super.toString() + ", volume=" +"л" + getVolume() + "}";
    }
}
