/**
 * 
 */
package com.devpredator.practicajpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.devpredator.practicajpa.dao.RestauranteDAO;
import com.devpredator.practicajpa.entity.Restaurante;



/**
 * @author 4PF28LA_2004
 *
 */
public class RestauranteDAOImpl implements RestauranteDAO {
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
			.createEntityManagerFactory("persistenceDevPredator");

	@Override
	public void guardar(Restaurante restaurante) {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.persist(restaurante);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();

		} finally {
			em.close();
		}

	}

	@Override
	public void actualizar(Restaurante restaurante) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.merge(restaurante);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();

		} finally {
			em.close();
		}

	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		Restaurante restaurante = em.find(Restaurante.class, id);

		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.remove(restaurante);
			et.commit();
		} catch (Exception e) {
			if (et != null) {
				et.rollback();
			}
			e.printStackTrace();

		} finally {
			em.close();
		}
	}

	@Override
	public List<Restaurante> consultar() {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		TypedQuery<Restaurante> restauranteQuery = (TypedQuery<Restaurante>) em.createQuery("FROM Restaurante");
		return restauranteQuery.getResultList();
	}

	@Override
	public Restaurante consultarById(Long id) {
		// TODO Auto-generated method stub
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		return em.find(Restaurante.class, id);
	}

}
