/**
 * 
 */
package com.devpredator.practicajpa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.devpredator.practicajpa.dao.RestauranteDAO;
import com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl;
import com.devpredator.practicajpa.entity.Menu;
import com.devpredator.practicajpa.entity.Restaurante;
import com.devpredator.practicajpa.entity.TipoRestaurante;
import com.devpredator.practicajpa.entity.Restaurante;

/**
 * @author c-ado
 *
 */
class RestauranteDAOImplTest {
     RestauranteDAO restauranteDao = new RestauranteDAOImpl();
	/**
	 * Test method for {@link com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl#guardar(com.devpredator.practicajpa.entity.Restaurante)}.
	 */
	@Test
	void testGuardar() {
		Menu menu = new Menu ();
		menu.setClave("secreto");
		menu.setDescripcion("Italiano");
		menu.setEstatus(true);
		menu.setFechaCreacion(LocalDate.now());
		
		TipoRestaurante tipo = new TipoRestaurante();
		tipo.setEstatus(true);
		tipo.setFechaCreacion(LocalDate.now());
		
		Restaurante restaurante = new Restaurante();
		restaurante.setEstatus(true);
		restaurante.setFechaCreacion(LocalDate.now());
		restaurante.setImagen("hola");
		restaurante.setNombre("KFC");
		restaurante.setSlogan("mundo");
		restaurante.setMenu(menu);
		restaurante.setTipoRestaurante(tipo);
		
		this.restauranteDao.guardar(restaurante);
		
		
	}

	/**
	 * Test method for {@link com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl#actualizar(com.devpredator.practicajpa.entity.Restaurante)}.
	 */
	@Test
	void testActualizar() {
		Restaurante restauranteConsultada = this.restauranteDao.consultarById(14L);
		restauranteConsultada.setNombre("McDonalds");
		this.restauranteDao.actualizar(restauranteConsultada);
	}

	/**
	 * Test method for {@link com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.restauranteDao.eliminar(14L);
	}

	/**
	 * Test method for {@link com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<Restaurante> restaurantesConsultadas = this.restauranteDao.consultar();
		assertTrue(restaurantesConsultadas.size() > 0);
		restaurantesConsultadas.forEach(restaurante -> {
			System.out.println("Restaurante : " + restaurante.getNombre());
		});
	}

	/**
	 * Test method for {@link com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		Restaurante restaurante = this.restauranteDao.consultarById(14L);
		assertNotNull(restaurante);

		System.out.println("Descripcion :" + restaurante.getNombre());
	}

	/**
	 * Test method for {@link java.lang.Object#Object()}.
	 */
	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#getClass()}.
	 */
	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#hashCode()}.
	 */
	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#clone()}.
	 */
	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#notify()}.
	 */
	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#notifyAll()}.
	 */
	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait()}.
	 */
	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait(long)}.
	 */
	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#wait(long, int)}.
	 */
	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#finalize()}.
	 */
	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

}
