package fr.treeptik.dao.impl;

import fr.treeptik.dao.FactureDAO;
import fr.treeptik.generic.dao.jpa.GenericDAOJPA;
import fr.treeptik.pojo.Facture;

public class FactureDAOImpl extends GenericDAOJPA<Facture, Integer>implements FactureDAO{

	public FactureDAOImpl() {
		super(Facture.class);
	}

}
