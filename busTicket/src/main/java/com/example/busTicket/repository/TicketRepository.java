package com.example.busTicket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.busTicket.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
