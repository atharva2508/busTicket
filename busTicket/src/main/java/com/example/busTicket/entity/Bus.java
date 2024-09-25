package com.example.busTicket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bus {

    @Id
    private long id;
    private String driverName;
    private String busNumber;
    private int totalSeats;
    private int availableSeat;
    
    //Getter and Setter
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getBusNumber() {
        return busNumber;
    }
    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }
    public int getTotalSeats() {
        return totalSeats;
    }
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
    public int getAvailableSeat() {
        return availableSeat;
    }
    public void setAvailableSeat(int availableSeat) {
        this.availableSeat = availableSeat;
    }

}
