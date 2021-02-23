/**
 * 
 */
package com.devpredator.practicajpa.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author 4PF28LA_2004
 *
 */
@Entity
@Table(name = "restaurante")
public class Restaurante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long idRestaurante;
	@Column
	private String nombre;
	@Column
	private String imagen;
	@Column
	private String slogan;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoRestaurante")
	@Cascade(CascadeType.PERSIST)
	private TipoRestaurante tipoRestaurante;
	
	@Column
	private LocalDate fechaCreacion;
	@Column
	private LocalDate fechaModificacion;
	@Column
	private boolean estatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMenu")
	@Cascade(CascadeType.PERSIST)
	private Menu menu;

	/**
	 * @return the idRestaurante
	 */
	public Long getIdRestaurante() {
		return idRestaurante;
	}

	/**
	 * @param idRestaurante the idRestaurante to set
	 */
	public void setIdRestaurante(Long idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the slogan
	 */
	public String getSlogan() {
		return slogan;
	}

	/**
	 * @param slogan the slogan to set
	 */
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	/**
	 * @return the tipoRestaurante
	 */
	public TipoRestaurante getTipoRestaurante() {
		return tipoRestaurante;
	}

	/**
	 * @param tipoRestaurante the tipoRestaurante to set
	 */
	public void setTipoRestaurante(TipoRestaurante tipoRestaurante) {
		this.tipoRestaurante = tipoRestaurante;
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
	 * @return the estatus
	 */
	public boolean isEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	/**
	 * @return the menu
	 */
	public Menu getMenu() {
		return menu;
	}

	/**
	 * @param menu the menu to set
	 */
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
}