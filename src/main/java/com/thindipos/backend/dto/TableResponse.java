package com.thindipos.backend.dto;

public class TableResponse {

    private Long id;
    private Integer tableNumber;
    private Integer capacity;
    private Boolean isActive;

    public TableResponse() {
    }

    public TableResponse(Long id, Integer tableNumber,
                         Integer capacity, Boolean isActive) {
        this.id = id;
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}