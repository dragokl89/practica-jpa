/**
 * 
 */
package com.devpredator.practicajpa.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 4PF28LA_2004
 *
 */
@Entity
@Table(name = "tipo_restaurante")
public class TipoRestaurante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long idTipoRestaurante;
	@Column
	private LocalDate fechaCreacion;
	@Column
	private LocalDate fechaModificacion;
	@Column
	private boolean estatus;
	/**
	 * @return the idTipoRestaurante
	 */
	public Long getIdTipoRestaurante() {
		return idTipoRestaurante;
	}
	/**
	 * @param idTipoRestaurante the idTipoRestaurante to set
	 */
	public void setIdTipoRestaurante(Long idTipoRestaurante) {
		this.idTipoRestaurante = idTipoRestaurante;
	}
	/**
	 * @return the fechaCreacion
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	/**
	 * @return the fechaModificacion
	 */
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	/**
	 * @param fechaModificacion the fechaModificacion to set
	 */
	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	/**
	 * @return the estaus
	 */
	public boolean isEstatus() {
		return estatus;
	}
	/**
	 * @param estaus the estaus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
}
