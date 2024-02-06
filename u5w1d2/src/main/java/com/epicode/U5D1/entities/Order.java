package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Order {
    private static int nextOrderNumber = 1;

    private int orderNumber;
    private OrderStatus status;
    private int numberOfSeats;
    private LocalDateTime acquisitionTime;
    private List<Item> items;
    private double totalCost;
    private double coverCharge;
    private Table table;

    public Order(int numberOfSeats, double coverCharge, Table table) {
        this.orderNumber = nextOrderNumber++;
        this.status = OrderStatus.IN_PROGRESS;
        this.numberOfSeats = numberOfSeats;
        this.acquisitionTime = LocalDateTime.now();
        this.items = new ArrayList<>();
        this.totalCost = 0;
        this.coverCharge = coverCharge;
        this.table = table;
    }

    public void addItem(Item item) {
        items.add(item);
        totalCost += item.getPrice();
    }

    public void markAsReady() {
        this.status = OrderStatus.READY;
    }

    public void markAsServed() {
        this.status = OrderStatus.SERVED;
    }

    public double calculateTotalCost() {
        return totalCost + (numberOfSeats * coverCharge);
    }
}
