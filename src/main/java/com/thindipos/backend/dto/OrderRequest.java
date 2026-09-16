package com.thindipos.backend.dto;

import java.math.BigDecimal;
import java.util.List;

public class OrderRequest {

    private Long tableId;
    private List<OrderItemRequest> items;
    private BigDecimal discount;

    public OrderRequest() {
    }

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public List<OrderItemRequest> getItems() {
        return items;
    }

    public void setItems(List<OrderItemRequest> items) {
        this.items = items;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }
}