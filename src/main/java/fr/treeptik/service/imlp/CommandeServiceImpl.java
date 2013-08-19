package fr.treeptik.service.imlp;

import java.util.List;

import fr.treeptik.dao.CommandeDAO;
import fr.treeptik.dao.GenericDAO;
import fr.treeptik.exception.DAOException;
import fr.treeptik.exception.ServiceException;
import fr.treeptik.pojo.Commande;
import fr.treeptik.service.CommandeService;

public class CommandeServiceImpl extends
		GenericServiceImpl<Commande, Integer, GenericDAO<Commande, Integer>>
		implements CommandeService {

	private CommandeDAO commandeDAO;

	@Override
	protected GenericDAO<Commande, Integer> getDao() {
		return commandeDAO;
	}

	@Override
	public List<Commande> findAllBySociete(Integer societeId)
			throws ServiceException {
		try {
			return commandeDAO.findAllBySociete(societeId);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
	}

}
