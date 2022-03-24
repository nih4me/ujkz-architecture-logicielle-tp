package ujkz.tp.produitservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitController {

	private final ProduitRepository repository;

	ProduitController(ProduitRepository repository) {
		this.repository = repository;
	}

	@PostMapping("/produit")
	int createProduit(@RequestBody Produit produit) {
		Produit produitEnregistre = this.repository.save(produit);
		return produitEnregistre.getId();
	}

	@GetMapping("/produit")
	ArrayList<Produit> produits() {
		ArrayList<Produit> produits = (ArrayList<Produit>) this.repository.findAll();
		return produits;
	}

	@GetMapping("/produit/{id}")
	Produit getProduitById(@PathVariable int id) {
		Produit produit = this.repository.findById(id).orElse(null);
		return produit;
	}

}
