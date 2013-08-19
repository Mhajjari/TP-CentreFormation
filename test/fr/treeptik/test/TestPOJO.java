package fr.treeptik.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.pojo.Societe;
import fr.treeptik.service.imlp.SocieteServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestPOJO {

	@Autowired
	private SocieteServiceImpl societeDAOImpl;

	@Test
	public void testSociete() {
		try {
			Societe societe = new Societe();
			societe = societeDAOImpl.save(societe);
			System.out.println(societe.getId());
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

}
