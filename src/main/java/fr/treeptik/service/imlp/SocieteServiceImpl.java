package fr.treeptik.service.imlp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.treeptik.dao.impl.SocieteDAOImpl;
import fr.treeptik.exception.DAOException;
import fr.treeptik.exception.ServiceException;
import fr.treeptik.pojo.Societe;
import fr.treeptik.service.SocieteService;

@Service
public class SocieteServiceImpl implements SocieteService{

	@Autowired
	private SocieteDAOImpl societeDAOImpl;
	public Societe save(Societe societe) throws ServiceException {
		try {
			societe = societeDAOImpl.save(societe);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		return societe;
	}

	public Societe remove(Societe societe) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	public Societe findById(Societe societe) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Societe> findAll() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
