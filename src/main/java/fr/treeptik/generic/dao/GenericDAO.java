package fr.treeptik.generic.dao;

import java.util.List;

import fr.treeptik.exception.DAOException;

public interface GenericDAO <T, PK> {

	T save(T entite) throws DAOException;
	void remove(T entite) throws DAOException;
	T findById(PK id) throws DAOException;
	List<T> findAll() throws DAOException;
	
}

