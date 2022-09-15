package com.nike.DemoGraphQL.service;

import com.nike.DemoGraphQL.model.InventorySupply;
import com.nike.DemoGraphQL.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    private InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public List<InventorySupply> FindInventorySupply(String gtin, String inventoryTypeCode, Integer anchor, Integer count) {

        return inventoryRepository.GetInventorySupplyByFilters(gtin,inventoryTypeCode,anchor, count);
    }
}
