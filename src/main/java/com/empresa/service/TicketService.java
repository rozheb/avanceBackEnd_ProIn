package com.empresa.service;

import java.util.List;

import com.empresa.entity.Ticket;

public interface TicketService {
	
	public Ticket insertaActualizaTicket(Ticket obj);
	public List<Ticket> listaTicket();

}
