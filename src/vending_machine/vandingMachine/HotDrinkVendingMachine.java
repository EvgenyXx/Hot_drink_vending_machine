package vending_machine.vandingMachine;

import vending_machine.BuilderProduct.BuilderProduct;
import vending_machine.product.HotDrinks;
import vending_machine.product.Product;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    private final List<HotDrinks> hotDrinksLlist;
    private final BuilderProduct builderProduct;

    public HotDrinkVendingMachine() {
        hotDrinksLlist = new ArrayList<>();
        builderProduct = new BuilderProduct();
    }
    public void addHotDrink(String name,int price,double volume,int temperature){
        HotDrinks hotDrinks1 = builderProduct.built(name,price,volume,temperature);
        hotDrinksLlist.add(hotDrinks1);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product :hotDrinksLlist ){
            if (product instanceof  HotDrinks){
                if (product.getName().equals(name)){
                    return product;
                }
            }
        }
        return null;
    }

    public Product getHotDrink(String name,int price,int temperature){
        for (HotDrinks hotDrinks : hotDrinksLlist){
            if (hotDrinks.getName().equals(name) && hotDrinks.getPrice() == price && hotDrinks.getTemperature() == temperature){
                return hotDrinks;
            }

        }
        return null;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder();
       for (HotDrinks hotDrinks : hotDrinksLlist){
           stringBuilder.append(hotDrinks);
           stringBuilder.append("\n");
       }
       return stringBuilder.toString();
    }
}
