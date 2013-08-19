package fr.treeptik.service;

import java.util.List;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.pojo.Commande;


public interface CommandeService extends GenericService<Commande, Integer>{
	List<Commande> findAllBySociete(Integer societeId) throws ServiceException;
}
