package fr.treeptik.dao.impl;

import org.springframework.stereotype.Repository;

import fr.treeptik.dao.SessionDAO;
import fr.treeptik.pojo.Session;

@Repository
public class SessionDAOImpl extends GenericDAOJPA<Session, Integer>implements SessionDAO{

	public SessionDAOImpl(){
			super(Session.class);
	}

}
