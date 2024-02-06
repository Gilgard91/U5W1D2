package com.epicode.U5D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Table {
    private int tableNumber;
    private int maxSeats;
    private boolean occupied;

    public Table(int tableNumber, int maxSeats) {
        this.tableNumber = tableNumber;
        this.maxSeats = maxSeats;
        this.occupied = false;
    }
}