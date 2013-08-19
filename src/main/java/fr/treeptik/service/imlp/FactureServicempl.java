package fr.treeptik.service.imlp;

import fr.treeptik.dao.FactureDAO;
import fr.treeptik.dao.GenericDAO;
import fr.treeptik.pojo.Facture;
import fr.treeptik.service.FactureService;

public class FactureServicempl extends GenericServiceImpl<Facture, Integer, GenericDAO<Facture, Integer>> implements FactureService{

	private FactureDAO factureDAO;
	@Override
	protected GenericDAO<Facture, Integer> getDao() {
		return factureDAO;
	}

}
