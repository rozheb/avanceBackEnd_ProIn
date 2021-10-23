package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.empresa.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

	
}
