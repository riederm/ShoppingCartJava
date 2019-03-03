package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * ShoppingCart
 */
public class ShoppingCart {

    List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public void checkOut(CreditCard creditCard){

    }

    public double getFullPrice(){
        double price = items.stream()
                .mapToDouble(i -> i.getAmount()*i.getPrice())
                .sum();

        return price;
    }
}