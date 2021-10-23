package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.empresa.entity.Estado;
import com.empresa.repository.EstadoRepository;


@Service
public class EstadoServicelmpl implements EstadoService{
	
	@Autowired
	private EstadoRepository repository;

	@Override
	public List<Estado> listaEstado() {
		return repository.findAll();
	}
	
}
