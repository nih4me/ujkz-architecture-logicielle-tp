package ujkz.tp.agregateurservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgregateurServiceApplication {

	public static void main(String[] args) {

		/*
		 * ClientsServices psci = new ClientsServices(); Produit p = new Produit(15,
		 * "NOUVEAU ENCORE", "Depuis Java", 100000); int r =
		 * psci.createProduitAvecStock(p, null); System.out.print(r);
		 */

		SpringApplication.run(AgregateurServiceApplication.class, args);
	}

}
