package vending_machine.BuilderProduct;

import vending_machine.product.BottleOfWater;
import vending_machine.product.HotDrinks;


public class BuilderProduct {
    private int genId;

    public BottleOfWater build (String name,int price,int volume){
        return new BottleOfWater(genId++,name,price,volume);
    }

    public HotDrinks built (String name,int price,double volume,int temperature){
        return new HotDrinks(genId++,name,price,temperature,volume);
    }
}
