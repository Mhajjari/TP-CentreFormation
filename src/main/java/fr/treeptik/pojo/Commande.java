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
@Table(name = "COMMANDE")
public class Commande implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "NumeroCommande")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "DateCommande")
	private Date dateCommande;
	@Column(name = "NdrPlaceCommandes")
	private int NdrPlaceCommandes;
	@ManyToOne
	@JoinColumn(name = "societe_id")
	private Societe societe;

	@ManyToOne
	@JoinColumn(name = "session_id")
	private Session session;

	public Commande(Integer id, Date dateCommande, int ndrPlaceCommandes) {
		this.id = id;
		this.dateCommande = dateCommande;
		NdrPlaceCommandes = ndrPlaceCommandes;
	}

	public Commande() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public int getNdrPlaceCommandes() {
		return NdrPlaceCommandes;
	}

	public void setNdrPlaceCommandes(int ndrPlaceCommandes) {
		NdrPlaceCommandes = ndrPlaceCommandes;
	}

}
