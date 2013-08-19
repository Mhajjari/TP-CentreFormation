package fr.treeptik.service;

import java.util.List;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.pojo.Seminaire;

public interface SeminaireService {

	Seminaire save(Seminaire seminaire) throws ServiceException;
	Seminaire remove(Seminaire seminaire) throws ServiceException;
	Seminaire findById(Seminaire seminaire) throws ServiceException;
	List<Seminaire> findAll() throws ServiceException;
}
