package fr.treeptik.service.imlp;

import fr.treeptik.dao.GenericDAO;
import fr.treeptik.pojo.Session;
import fr.treeptik.service.SessionService;


public class SessionServiceImpl extends GenericServiceImpl<Session, Integer, GenericDAO<Session,Integer>> implements SessionService{

	private GenericDAO<Session, Integer> session;
	@Override
	protected GenericDAO<Session, Integer> getDao() {
		return session;
	}

}
