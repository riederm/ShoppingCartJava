package org.example;

/**
 * Item
 */
public class Item {
    private String name;
    private int amount = 0;
    private double price = 0.0;

    public Item(String name, double price, int amount){

    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
}