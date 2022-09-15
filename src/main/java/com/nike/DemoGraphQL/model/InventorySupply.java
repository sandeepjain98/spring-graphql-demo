package com.nike.DemoGraphQL.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InventorySupply {
    public InventorySupply() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGTIN() {
        return GTIN;
    }

    public void setGTIN(String GTIN) {
        this.GTIN = GTIN;
    }

    public String getNodeCode() {
        return nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getSalesOrganizationCode() {
        return salesOrganizationCode;
    }

    public void setSalesOrganizationCode(String salesOrganizationCode) {
        this.salesOrganizationCode = salesOrganizationCode;
    }

    public String getSupplyProtectionReferenceHeaderNumber() {
        return supplyProtectionReferenceHeaderNumber;
    }

    public void setSupplyProtectionReferenceHeaderNumber(String supplyProtectionReferenceHeaderNumber) {
        this.supplyProtectionReferenceHeaderNumber = supplyProtectionReferenceHeaderNumber;
    }

    public String getSupplyProtectionItemReferenceNumber() {
        return supplyProtectionItemReferenceNumber;
    }

    public void setSupplyProtectionItemReferenceNumber(String supplyProtectionItemReferenceNumber) {
        this.supplyProtectionItemReferenceNumber = supplyProtectionItemReferenceNumber;
    }

    public String getAvailabilityTypeCode() {
        return availabilityTypeCode;
    }

    public void setAvailabilityTypeCode(String availabilityTypeCode) {
        this.availabilityTypeCode = availabilityTypeCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getInventorySegmentationCode() {
        return inventorySegmentationCode;
    }

    public void setInventorySegmentationCode(String inventorySegmentationCode) {
        this.inventorySegmentationCode = inventorySegmentationCode;
    }

    public String getInventoryQualityCode() {
        return inventoryQualityCode;
    }

    public void setInventoryQualityCode(String inventoryQualityCode) {
        this.inventoryQualityCode = inventoryQualityCode;
    }

    public String getInventoryTypeCode() {
        return inventoryTypeCode;
    }

    public void setInventoryTypeCode(String inventoryTypeCode) {
        this.inventoryTypeCode = inventoryTypeCode;
    }

    public String getAvailabilityDate() {
        return availabilityDate;
    }

    public void setAvailabilityDate(String availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    public String getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(String availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getAvailableQuantityUnitofMeasure() {
        return availableQuantityUnitofMeasure;
    }

    public void setAvailableQuantityUnitofMeasure(String availableQuantityUnitofMeasure) {
        this.availableQuantityUnitofMeasure = availableQuantityUnitofMeasure;
    }

    public String getOpenToReferenceQuantity() {
        return openToReferenceQuantity;
    }

    public void setOpenToReferenceQuantity(String openToReferenceQuantity) {
        this.openToReferenceQuantity = openToReferenceQuantity;
    }

    public String getSalesUnitofMeasure() {
        return salesUnitofMeasure;
    }

    public void setSalesUnitofMeasure(String salesUnitofMeasure) {
        this.salesUnitofMeasure = salesUnitofMeasure;
    }

    public String getCustomerRequestedDeliveryDt() {
        return customerRequestedDeliveryDt;
    }

    public void setCustomerRequestedDeliveryDt(String customerRequestedDeliveryDt) {
        this.customerRequestedDeliveryDt = customerRequestedDeliveryDt;
    }

    public String getModify_ts() {
        return modify_ts;
    }

    public void setModify_ts(String modify_ts) {
        this.modify_ts = modify_ts;
    }

    public String getSoldToIdentifier() {
        return soldToIdentifier;
    }

    public void setSoldToIdentifier(String soldToIdentifier) {
        this.soldToIdentifier = soldToIdentifier;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getAvailSegmentationHierarchyName() {
        return availSegmentationHierarchyName;
    }

    public void setAvailSegmentationHierarchyName(String availSegmentationHierarchyName) {
        this.availSegmentationHierarchyName = availSegmentationHierarchyName;
    }

    public String getAvailSegmentationHierarchyCode() {
        return availSegmentationHierarchyCode;
    }

    public void setAvailSegmentationHierarchyCode(String availSegmentationHierarchyCode) {
        this.availSegmentationHierarchyCode = availSegmentationHierarchyCode;
    }

    public String getAvailSegmentationHierarchyTypeName() {
        return availSegmentationHierarchyTypeName;
    }

    public void setAvailSegmentationHierarchyTypeName(String availSegmentationHierarchyTypeName) {
        this.availSegmentationHierarchyTypeName = availSegmentationHierarchyTypeName;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getIs_dirty_node() {
        return is_dirty_node;
    }

    public void setIs_dirty_node(String is_dirty_node) {
        this.is_dirty_node = is_dirty_node;
    }

    public String getDirty_node_expiry_dt() {
        return dirty_node_expiry_dt;
    }

    public void setDirty_node_expiry_dt(String dirty_node_expiry_dt) {
        this.dirty_node_expiry_dt = dirty_node_expiry_dt;
    }

    public String getEvent_sequence_id() {
        return event_sequence_id;
    }

    public void setEvent_sequence_id(String event_sequence_id) {
        this.event_sequence_id = event_sequence_id;
    }

    public String getEvent_sequence_timestamp() {
        return event_sequence_timestamp;
    }

    public void setEvent_sequence_timestamp(String event_sequence_timestamp) {
        this.event_sequence_timestamp = event_sequence_timestamp;
    }

    public String getEventSequenceId() {
        return eventSequenceId;
    }

    public void setEventSequenceId(String eventSequenceId) {
        this.eventSequenceId = eventSequenceId;
    }

    @Column(name = "ID")
    @Id
    String id;
    @Column(name = "GTIN")
    String GTIN;
    @Column(name = "NODE_CODE")
    String nodeCode;
    @Column(name = "SALES_ORGANIZATION_CODE")
    String salesOrganizationCode;
    @Column(name = "SUPPLY_PROTECTION_REFERENCE_HEADER_NUMBER")
    String supplyProtectionReferenceHeaderNumber;
    @Column(name = "SUPPLY_PROTECTION_ITEM_REFERENCE_NUMBER")
    String supplyProtectionItemReferenceNumber;
    @Column(name = "AVAILABILITY_TYPE_CODE")
    String availabilityTypeCode;
    @Column(name = "PRODUCT_CODE")
    String productCode;
    @Column(name = "SIZE_CODE")
    String sizeCode;
    @Column(name = "INVENTORY_SEGMENTATION_CODE")
    String inventorySegmentationCode;
    @Column(name = "INVENTORY_QUALITY_CODE")
    String inventoryQualityCode;
    @Column(name = "INVENTORY_TYPE_CODE")
    String inventoryTypeCode;
    @Column(name = "AVAILABILITY_DATE")
    String availabilityDate;
    @Column(name = "AVAILABLE_QUANTITY")
    String availableQuantity;
    @Column(name = "AVAILABLE_QUANTITY_UNIT_OF_MEASURE")
    String availableQuantityUnitofMeasure;
    @Column(name = "OPEN_TO_REFERENCE_QUANTITY")
    String openToReferenceQuantity;
    @Column(name = "SALES_UNIT_OF_MEASURE")
    String salesUnitofMeasure;
    @Column(name = "CUSTOMER_REQUESTED_DELIVERY_DT")
    String customerRequestedDeliveryDt;
    @Column(name = "MODIFY_TS")
    String modify_ts;
    @Column(name = "SOLD_TO_IDENTIFIER")
    String soldToIdentifier;
    @Column(name = "EVENT_DATE")
    String eventDate;
    @Column(name = "AVAIL_SEGMENTATION_HIERARCHY_NAME")
    String availSegmentationHierarchyName;
    @Column(name = "AVAIL_SEGMENTATION_HIERARCHY_CODE")
    String availSegmentationHierarchyCode;
    @Column(name = "AVAIL_SEGMENTATION_HIERARCHY_TYPE_NAME")
    String availSegmentationHierarchyTypeName;
    @Column(name = "SELLER")
    String seller;
    @Column(name = "IS_DIRTY_NODE")
    String is_dirty_node;
    @Column(name = "DIRTY_NODE_EXPIRY_DT")
    String dirty_node_expiry_dt;
    @Column(name = "EVENT_SEQUENCE_ID")
    String event_sequence_id;
    @Column(name = "EVENT_SEQUENCE_TIMESTAMP")
    String event_sequence_timestamp;
    @Column(name = "EVENT_SEQUENCE_NUMBER")
    String eventSequenceId;
}

