package fr.treeptik.dao.impl;

import fr.treeptik.dao.SessionDAO;
import fr.treeptik.generic.dao.jpa.GenericDAOJPA;
import fr.treeptik.pojo.Session;

public class SessionDAOImpl extends GenericDAOJPA<Session, Integer>implements SessionDAO{

	public SessionDAOImpl(){
			super(Session.class);
	}

}
