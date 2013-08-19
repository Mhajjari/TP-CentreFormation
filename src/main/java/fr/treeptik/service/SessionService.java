package fr.treeptik.service;

import java.util.List;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.pojo.Session;

public interface SessionService {

	Session save(Session facture) throws ServiceException;
	Session remove(Session facture) throws ServiceException;
	Session findById(Session facture) throws ServiceException;
	List<Session> findAll() throws ServiceException;
}
