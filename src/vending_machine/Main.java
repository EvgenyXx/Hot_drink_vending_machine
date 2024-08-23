package vending_machine;


import vending_machine.vandingMachine.BottleOfWaterVendingMachine;
import vending_machine.vandingMachine.HotDrinkVendingMachine;
import vending_machine.vandingMachine.VendingMachine;


public class Main {
    public static void main(String[] args) {

        BottleOfWaterVendingMachine bottleOfWaterVendingMachine = new BottleOfWaterVendingMachine();
        bottleOfWaterVendingMachine.addProduct("coca-cola",50,1);
        bottleOfWaterVendingMachine.addProduct("milk",70,2);
        bottleOfWaterVendingMachine.addProduct("sap",100,3);
        System.out.println(bottleOfWaterVendingMachine);
        System.out.println("методы по поиску воды");
        System.out.println(bottleOfWaterVendingMachine.getProduct("sap"));
        System.out.println(bottleOfWaterVendingMachine.getProduct("sa"));
        System.out.println(bottleOfWaterVendingMachine.getBottleWater("coca-cola",1));
        System.out.println();
        System.out.println("магазин горячих напитков");


        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();
        hotDrinkVendingMachine.addHotDrink("coffee",60,0.5,20);
        hotDrinkVendingMachine.addHotDrink("tea",40,0.3,30);

        System.out.println(hotDrinkVendingMachine);
        System.out.println();
        System.out.println("методы по поиску горячих напитков ");
        System.out.println(hotDrinkVendingMachine.getProduct("tea"));
        System.out.println(hotDrinkVendingMachine.getHotDrink("coffee",60,20));










    }
}