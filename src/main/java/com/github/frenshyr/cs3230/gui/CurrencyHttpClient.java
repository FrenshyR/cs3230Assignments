package com.github.frenshyr.cs3230.gui;

import com.github.frenshyr.cs3230.models.CurrencyConverter;
import com.google.gson.Gson;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class HttpClient {
    String baseUrl = "https://v6.exchangerate-api.com/v6/";
    String procedure = "pair";
    String apiKey = "ad64ee1ea8754aa4449c18f1";
    static String responseString = "";

    public  CurrencyConverter getCurrencyConverted(String code1, String code2){
        String url = baseUrl + apiKey + procedure + code1 + code2;
        HttpResponse<JsonNode> response = Unirest.get(url)
                .asJson();
        responseString = response.getBody().toPrettyString();
        Gson gson = new Gson();
       return gson.fromJson(responseString, CurrencyConverter.class);
    }


    /*public static void main (String[] args){
        HttpResponse<JsonNode> response = Unirest.get("https://v6.exchangerate-api.com/v6/ad64ee1ea8754aa4449c18f1/pair/EUR/USD")
                .asJson();
        responseString = response.getBody().toPrettyString();
        Gson gson = new Gson();
        CurrencyConverter currencyConverter = gson.fromJson(responseString, CurrencyConverter.class);
        System.out.println(currencyConverter.getRate());
    }*/
}
