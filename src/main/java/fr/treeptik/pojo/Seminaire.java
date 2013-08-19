package fr.treeptik.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SEMINAIRE")
public class Seminaire implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date DateSession;
	private String DateDebut;
	private String HeureFin;
	private Integer NbPlacesSeminaire;

	public Seminaire() {
		super();
	}

	public Seminaire(Integer id, Date dateSession, String dateDebut,
			String heureFin, Integer nbPlacesSeminaire) {
		this.id = id;
		DateSession = dateSession;
		DateDebut = dateDebut;
		HeureFin = heureFin;
		NbPlacesSeminaire = nbPlacesSeminaire;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateSession() {
		return DateSession;
	}

	public void setDateSession(Date dateSession) {
		DateSession = dateSession;
	}

	public String getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(String dateDebut) {
		DateDebut = dateDebut;
	}

	public String getHeureFin() {
		return HeureFin;
	}

	public void setHeureFin(String heureFin) {
		HeureFin = heureFin;
	}

	public Integer getNbPlacesSeminaire() {
		return NbPlacesSeminaire;
	}

	public void setNbPlacesSeminaire(Integer nbPlacesSeminaire) {
		NbPlacesSeminaire = nbPlacesSeminaire;
	}
	

	
}
