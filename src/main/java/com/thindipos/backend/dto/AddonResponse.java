package com.thindipos.backend.dto;

import java.math.BigDecimal;

public class AddonResponse {

    private Long id;
    private String name;
    private BigDecimal price;
    private Boolean isAvailable;

    public AddonResponse() {
    }

    public AddonResponse(Long id, String name, BigDecimal price, Boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}