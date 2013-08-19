package fr.treeptik.service;

import java.util.List;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.pojo.Commande;

public interface CommandeService {

	Commande save(Commande commande) throws ServiceException;
	Commande remove(Commande commande) throws ServiceException;
	Commande findById(Commande commande) throws ServiceException;
	List<Commande> findAll() throws ServiceException;
}
