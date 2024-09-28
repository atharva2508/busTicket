package com.example.busTicket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.busTicket.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Long>{

}
