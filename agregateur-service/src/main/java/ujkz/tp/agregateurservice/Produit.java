package ujkz.tp.agregateurservice;

public class Produit {

	private final int id;
	private final String designation;
	private final String description;
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