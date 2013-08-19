package fr.treeptik.dao.impl;

import org.springframework.stereotype.Repository;

import fr.treeptik.dao.FactureDAO;
import fr.treeptik.generic.dao.jpa.GenericDAOJPA;
import fr.treeptik.pojo.Facture;

@Repository
public class FactureDAOImpl extends GenericDAOJPA<Facture, Integer>implements FactureDAO{

	public FactureDAOImpl() {
		super(Facture.class);
	}

}
