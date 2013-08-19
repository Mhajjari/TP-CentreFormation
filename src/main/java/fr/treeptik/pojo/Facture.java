package fr.treeptik.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FACTURE")
public class Facture implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "NumeroFacture")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Date DateFacture;
	private int MontantFacture;
	private int NbrPlacesFacturees;
	@OneToOne
	@JoinColumn(name = "commande_id")
	private Commande commande;

	public Facture() {
		super();
	}

	public Facture(Integer id, Date dateFacture, int montantFacture,
			int nbrPlacesFacturees) {
		this.id = id;
		DateFacture = dateFacture;
		MontantFacture = montantFacture;
		NbrPlacesFacturees = nbrPlacesFacturees;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateFacture() {
		return DateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		DateFacture = dateFacture;
	}

	public int getMontantFacture() {
		return MontantFacture;
	}

	public void setMontantFacture(int montantFacture) {
		MontantFacture = montantFacture;
	}

	public int getNbrPlacesFacturees() {
		return NbrPlacesFacturees;
	}

	public void setNbrPlacesFacturees(int nbrPlacesFacturees) {
		NbrPlacesFacturees = nbrPlacesFacturees;
	}

}
