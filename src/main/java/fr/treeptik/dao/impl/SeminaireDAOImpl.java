package fr.treeptik.dao.impl;

import org.springframework.stereotype.Repository;

import fr.treeptik.dao.SeminaireDAO;
import fr.treeptik.pojo.Seminaire;

@Repository
public class SeminaireDAOImpl extends GenericDAOJPA<Seminaire, Integer>implements SeminaireDAO{

	public SeminaireDAOImpl() {
		super(Seminaire.class);
	}

}
