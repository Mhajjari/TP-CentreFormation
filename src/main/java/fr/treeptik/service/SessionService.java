package fr.treeptik.service;

import java.util.List;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.pojo.Session;

public interface SessionService {

	Session save(Session session) throws ServiceException;
	Session remove(Session session) throws ServiceException;
	Session findById(Session session) throws ServiceException;
	List<Session> findAll() throws ServiceException;
}
