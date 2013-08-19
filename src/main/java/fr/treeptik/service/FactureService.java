package fr.treeptik.service;

import java.util.List;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.pojo.Facture;


public interface FactureService {
	Facture save(Facture facture) throws ServiceException;
	Facture remove(Facture facture) throws ServiceException;
	Facture findById(Facture facture) throws ServiceException;
	List<Facture> findAll() throws ServiceException;
}
