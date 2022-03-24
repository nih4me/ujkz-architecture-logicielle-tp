package ujkz.tp.produitservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produit {

	@Id
	private final int id;
	@Column(name = "designation", nullable = false)
	private final String designation;
	@Column(name = "description", nullable = true)
	private final String description;
	@Column(name = "prix", nullable = false)
	private final int prix;

	Produit() {
		this.id = -1;
		this.designation = "";
		this.description = "";
		this.prix = -1;
	}

	Produit(int id, String designation, String description, int prix) {
		this.id = id;
		this.designation = designation;
		this.description = description;
		this.prix = prix;
	}

	public int getId() {
		return id;
	}

	public String getDesignation() {
		return designation;
	}

	public String getDescription() {
		return description;
	}

	public int getPrix() {
		return prix;
	}

}
