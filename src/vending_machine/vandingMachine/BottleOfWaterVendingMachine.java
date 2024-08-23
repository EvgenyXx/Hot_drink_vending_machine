package vending_machine.vandingMachine;

import vending_machine.BuilderProduct.BuilderProduct;
import vending_machine.product.BottleOfWater;
import vending_machine.product.Product;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine  implements VendingMachine{
    private final List<Product>productList;
    private BuilderProduct builderProduct;

    private int money;

    public BottleOfWaterVendingMachine() {
        productList = new ArrayList<>();
        builderProduct = new BuilderProduct();

    }

    public void addWater(Product product){
        productList.add(product);
    }



    @Override
    public Product getProduct(String name) {
        for (Product product : productList){
            if (product.getName().equals(name)){
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    public BottleOfWater getBottleWater(String name,int volume){
        for (Product product : productList){
            if (product instanceof BottleOfWater ){
                if (product.getName().equals(name) && ((BottleOfWater) product).getVolume() == volume){
                    money += product.getPrice();
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }

    public void addProduct(String name,int price,int volume){
        BottleOfWater bottleOfWater = builderProduct.build(name,price,volume);
        productList.add(bottleOfWater);
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder();
       for (Product product : productList){
           stringBuilder.append(product);
           stringBuilder.append("\n");
       }
       return stringBuilder.toString();
    }
}
