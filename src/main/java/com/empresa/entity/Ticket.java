package com.empresa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name = "TICKET")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ticket;
	private String asunto_ticket;
	private String fecha_reg_ticket;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima" )
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_asig_ticket;
	
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima" )
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_cierre_ticket;
	
	@ManyToOne
	@JoinColumn(name = "id_estado")
	private Estado estado;
	
	private String id_usuario_creacion;
	private String id_usuario_modificacion;
		
	@JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima" )
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha_mod_ticket;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	private int importancia_ticket;

	public int getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(int id_ticket) {
		this.id_ticket = id_ticket;
	}

	public String getAsunto_ticket() {
		return asunto_ticket;
	}

	public void setAsunto_ticket(String asunto_ticket) {
		this.asunto_ticket = asunto_ticket;
	}

	public String getFecha_reg_ticket() {
		return fecha_reg_ticket;
	}

	public void setFecha_reg_ticket(String fecha_reg_ticket) {
		this.fecha_reg_ticket = fecha_reg_ticket;
	}

	public Date getFecha_asig_ticket() {
		return fecha_asig_ticket;
	}

	public void setFecha_asig_ticket(Date fecha_asig_ticket) {
		this.fecha_asig_ticket = fecha_asig_ticket;
	}

	public Date getFecha_cierre_ticket() {
		return fecha_cierre_ticket;
	}

	public void setFecha_cierre_ticket(Date fecha_cierre_ticket) {
		this.fecha_cierre_ticket = fecha_cierre_ticket;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getId_usuario_creacion() {
		return id_usuario_creacion;
	}

	public void setId_usuario_creacion(String id_usuario_creacion) {
		this.id_usuario_creacion = id_usuario_creacion;
	}

	public String getId_usuario_modificacion() {
		return id_usuario_modificacion;
	}

	public void setId_usuario_modificacion(String id_usuario_modificacion) {
		this.id_usuario_modificacion = id_usuario_modificacion;
	}

	public Date getFecha_mod_ticket() {
		return fecha_mod_ticket;
	}

	public void setFecha_mod_ticket(Date fecha_mod_ticket) {
		this.fecha_mod_ticket = fecha_mod_ticket;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getImportancia_ticket() {
		return importancia_ticket;
	}

	public void setImportancia_ticket(int importancia_ticket) {
		this.importancia_ticket = importancia_ticket;
	}
	
	
	

}
