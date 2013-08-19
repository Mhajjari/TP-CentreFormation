package fr.treeptik.dao.impl;

import fr.treeptik.dao.SeminaireDAO;
import fr.treeptik.generic.dao.jpa.GenericDAOJPA;
import fr.treeptik.pojo.Seminaire;

public class SeminaireDAOImpl extends GenericDAOJPA<Seminaire, Integer>implements SeminaireDAO{

	public SeminaireDAOImpl() {
		super(Seminaire.class);
	}

}
