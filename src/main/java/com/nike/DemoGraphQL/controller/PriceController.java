package com.nike.DemoGraphQL.controller;

import com.nike.DemoGraphQL.model.Book;
import com.nike.DemoGraphQL.model.Price;
import com.nike.DemoGraphQL.service.PriceService;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping(path = "/price/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Price getPriceRest(@PathVariable Long id) {
               Price price= new Price(10.2,"USD");
                System.out.println("price"+ price.toString());
               return price;
    }

    @SchemaMapping
    public Price price(Book book) {
        System.out.println("calling price service");
        return priceService.getPriceFromRestCall(book.getId());
    }



}
