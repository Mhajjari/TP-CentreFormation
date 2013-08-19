package fr.treeptik.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SESSION")
public class Session implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "NumeroSession")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "DateSession")
	private Date dateSession;

	@Column(name = "HeurDebut")
	private Date heureDebut;

	@Column(name = "HeureFin")
	private Date heureFin;
	@ManyToOne
	@JoinColumn(name = "seminaire_id")
	private Seminaire seminaire;

	public Session(Integer id, Date dateSession, Date heureDebut, Date heureFin) {
		this.id = id;
		this.dateSession = dateSession;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateSession() {
		return dateSession;
	}

	public void setDateSession(Date dateSession) {
		this.dateSession = dateSession;
	}

	public Date getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Date getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

}