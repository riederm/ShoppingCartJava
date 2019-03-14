package org.example;

/**
 * PaymentService
 */
public class PaymentService {

    private CreditCardService creditCardService = new CreditCardService("http://paypal.com/...");

    public void pay(ShoppingCart shoppingCart, CreditCard card){

    }

}