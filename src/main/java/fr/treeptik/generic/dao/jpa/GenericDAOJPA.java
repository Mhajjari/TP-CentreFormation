package fr.treeptik.generic.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import fr.treeptik.exception.DAOException;
import fr.treeptik.generic.dao.GenericDAO;

public class GenericDAOJPA<T, PK> implements GenericDAO<T, PK> {

	@PersistenceContext
	protected EntityManager entityManager;

	private Class<T> type;

	public GenericDAOJPA(Class<T> type) {
		this.type = type;
	}

	@Override
	public T save(T entite) throws DAOException {
		try {
			entityManager.persist(entite);
		} catch (PersistenceException e) {
			throw new DAOException(e.getMessage(), e.getCause());
		}
		return entite;
	}

	@Override
	public void remove(T entite) throws DAOException {
		try {
			entityManager.remove(entite);
		} catch (PersistenceException e) {
			throw new DAOException(e.getMessage(), e.getCause());
		}
	}

	@Override
	public T findById(PK id) throws DAOException {
		try {
			return entityManager.find(type, id);
		} catch (PersistenceException e) {
			throw new DAOException(e.getMessage(), e.getCause());
		}
	}

	@Override
	public List<T> findAll() throws DAOException {
		try {
			return entityManager.createQuery(
					"select o from " + type.getSimpleName() + " o", type)
					.getResultList();
		} catch (PersistenceException e) {
			throw new DAOException(e.getMessage(), e.getCause());
		}
	}

}
