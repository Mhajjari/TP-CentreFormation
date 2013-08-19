package fr.treeptik.service;

import java.util.List;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.pojo.Societe;

public interface SocieteService {

	Societe save(Societe societe) throws ServiceException;
	Societe remove(Societe societe) throws ServiceException;
	Societe findById(Societe societe) throws ServiceException;
	List<Societe> findAll() throws ServiceException;
}
