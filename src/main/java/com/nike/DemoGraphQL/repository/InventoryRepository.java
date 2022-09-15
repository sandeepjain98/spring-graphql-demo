package com.nike.DemoGraphQL.repository;

import com.nike.DemoGraphQL.model.InventorySupply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InventoryRepository extends JpaRepository<InventorySupply,Long> {

  @Query( value ="SELECT * FROM INVENTORY_SUPPLY INVENTORY_SUPPLY WHERE " +
          "INVENTORY_SUPPLY.GTIN=:gtin " +
          "AND INVENTORY_SUPPLY.INVENTORY_TYPE_CODE= NVL(:inventoryTypeCode,INVENTORY_SUPPLY.INVENTORY_TYPE_CODE )" +
          " limit :count offset :anchor",
          nativeQuery = true)
    public List<InventorySupply> GetInventorySupplyByFilters(@Param("gtin") String gtin,
                                                             @Param("inventoryTypeCode") String inventoryTypeCode,
                                                            @Param("anchor") Integer anchor ,
                                                             @Param("count") Integer count);
}
