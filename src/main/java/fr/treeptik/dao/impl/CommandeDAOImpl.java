package fr.treeptik.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import fr.treeptik.dao.CommandeDAO;
import fr.treeptik.exception.DAOException;
import fr.treeptik.pojo.Commande;

@Repository
public class CommandeDAOImpl extends GenericDAOJPA<Commande, Integer> implements
		CommandeDAO {

	public CommandeDAOImpl() {
		super(Commande.class);
	}

	@Override
	public List<Commande> findAllBySociete(Integer societeId)
			throws DAOException {
		try {
			TypedQuery<Commande> query = entityManager.createQuery(
					"SELECT c FROM Commande c WHERE c.societe.id = :id",
					Commande.class);
			query.setParameter("id", societeId);
			return query.getResultList();
		} catch (PersistenceException e) {
			throw new DAOException(e.getMessage(), e.getCause());
		}
	}

}
