package fr.treeptik.dao.impl;

import org.springframework.stereotype.Repository;

import fr.treeptik.dao.CommandeDAO;
import fr.treeptik.generic.dao.jpa.GenericDAOJPA;
import fr.treeptik.pojo.Commande;

@Repository
public class CommandeDAOImpl extends GenericDAOJPA<Commande, Integer> implements CommandeDAO{

	public CommandeDAOImpl() {
		super(Commande.class);
	}

}
