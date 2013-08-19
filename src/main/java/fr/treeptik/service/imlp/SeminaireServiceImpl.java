package fr.treeptik.service.imlp;

import fr.treeptik.dao.GenericDAO;
import fr.treeptik.dao.SeminaireDAO;
import fr.treeptik.pojo.Seminaire;

public class SeminaireServiceImpl extends GenericServiceImpl<Seminaire, Integer, GenericDAO<Seminaire, Integer>>{

	private SeminaireDAO seminaireDAO;
	@Override
	protected GenericDAO<Seminaire, Integer> getDao() {
		return seminaireDAO;
	}

}
