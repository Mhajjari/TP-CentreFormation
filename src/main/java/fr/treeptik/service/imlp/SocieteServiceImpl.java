package fr.treeptik.service.imlp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.dao.GenericDAO;
import fr.treeptik.dao.SocieteDAO;
import fr.treeptik.pojo.Societe;
import fr.treeptik.service.SocieteService;

@Service
public class SocieteServiceImpl extends GenericServiceImpl<Societe, Integer, GenericDAO<Societe, Integer>> implements SocieteService{

	@Autowired
	private SocieteDAO societeDAO;

	@Override
	protected GenericDAO<Societe, Integer> getDao() {
		return societeDAO;
	}
}
