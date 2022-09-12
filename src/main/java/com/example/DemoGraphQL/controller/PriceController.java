package com.example.DemoGraphQL.controller;

import com.example.DemoGraphQL.model.Book;
import com.example.DemoGraphQL.model.Price;
import com.example.DemoGraphQL.service.PriceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
