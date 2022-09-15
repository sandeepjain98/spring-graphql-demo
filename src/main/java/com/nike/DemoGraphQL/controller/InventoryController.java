package com.nike.DemoGraphQL.controller;

import com.nike.DemoGraphQL.model.InventorySupply;
import com.nike.DemoGraphQL.service.InventoryService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {

    InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @QueryMapping
    public List<InventorySupply> findInventorySupply(@Argument String GTIN,
                                                     @Argument String inventoryTypeCode,
                                                     @Argument  Integer anchor,
                                                     @Argument Integer count
    )
    {
        return inventoryService.FindInventorySupply(GTIN,inventoryTypeCode,anchor,count);
    }
}
