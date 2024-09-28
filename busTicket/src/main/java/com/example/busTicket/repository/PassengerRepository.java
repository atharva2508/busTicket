package com.example.busTicket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.busTicket.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
