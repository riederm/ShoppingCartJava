package org.example;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * CreditCardService
 */
public class CreditCardService {
    private String serviceUrl;

    public CreditCardService(String url){
        this.serviceUrl = url;
    }

    public void withdraw(CreditCard creditCard, ShoppingCart shoppingCart) throws IOException, MalformedURLException{
        URL url = new URL(serviceUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Accept", "application/json");
        OutputStream out = conn.getOutputStream();
        out.write("...".getBytes());


    }
    
}