package com.thindipos.backend.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "order_item_addons")
public class OrderItemAddon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_item_id", nullable = false)
    private OrderItem orderItem;

    @ManyToOne
    @JoinColumn(name = "addon_id", nullable = false)
    private Addon addon;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal addonPrice;

    public OrderItemAddon() {
    }

    public Long getId() {
        return id;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public Addon getAddon() {
        return addon;
    }

    public void setAddon(Addon addon) {
        this.addon = addon;
    }

    public BigDecimal getAddonPrice() {
        return addonPrice;
    }

    public void setAddonPrice(BigDecimal addonPrice) {
        this.addonPrice = addonPrice;
    }
}