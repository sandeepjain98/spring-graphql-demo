package com.example.DemoGraphQL.service;


import com.example.DemoGraphQL.model.Price;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PriceService {
    public Price getPriceFromRestCall(Long bookId)
    {
        RestTemplate restTemplate = new RestTemplate();
        String priceServiceURL
                = "http://localhost:8080/price";
       Price price= restTemplate.getForObject(priceServiceURL + "/"+bookId, Price.class);
       System.out.println("price"+ price.toString());
       return price;

    }
}
