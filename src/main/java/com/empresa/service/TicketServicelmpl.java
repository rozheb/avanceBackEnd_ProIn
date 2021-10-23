package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Ticket;
import com.empresa.repository.TicketRepository;

@Service
public class TicketServicelmpl implements TicketService {
	
	@Autowired
	private TicketRepository repositorio;

	@Override
	public Ticket insertaActualizaTicket(Ticket obj) {
		return repositorio.save(obj);
	}

	@Override
	public List<Ticket> listaTicket() {
		return repositorio.findAll();
	}

}
