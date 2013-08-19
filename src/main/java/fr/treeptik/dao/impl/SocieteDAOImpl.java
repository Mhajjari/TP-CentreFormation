package fr.treeptik.dao.impl;

import org.springframework.stereotype.Repository;

import fr.treeptik.dao.SocieteDAO;
import fr.treeptik.generic.dao.jpa.GenericDAOJPA;
import fr.treeptik.pojo.Societe;

@Repository
public class SocieteDAOImpl extends GenericDAOJPA<Societe, Integer> implements SocieteDAO{

	public SocieteDAOImpl() {
		super(Societe.class);
	}

}
