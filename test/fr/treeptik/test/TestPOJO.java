package fr.treeptik.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.pojo.Societe;
import fr.treeptik.service.SocieteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestPOJO {

	@Autowired
	private SocieteService societeService;
	
	
	@Test
	@Transactional
	@Rollback(false)
	public void testSociete() {
		try {
			Societe societe = new Societe(null, "nomSociete");
			societe = societeService.save(societe);
			System.out.println(societe.getId());
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

}