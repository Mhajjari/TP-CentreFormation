package fr.treeptik.dao;

import java.util.List;

import fr.treeptik.exception.DAOException;
import fr.treeptik.pojo.Commande;

public interface CommandeDAO extends GenericDAO<Commande, Integer>{

	List<Commande> findAllBySociete(Integer societeId) throws DAOException;
}
