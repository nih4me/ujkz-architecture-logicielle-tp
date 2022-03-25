package ujkz.tp.agregateurservice;

import com.google.gson.Gson;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ClientsServices {

	private static final String PRODUIT_SERVICE_URL = "http://127.0.0.1:8001";
	private static final String STOCK_SERVICE_URL = "http://127.0.0.1:8002";
	public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
	private OkHttpClient client = new OkHttpClient();

	public int createProduitAvecStock(Produit produit, Stock stock) {

		// Enregistrement d'un Produit
		RequestBody body = RequestBody.create(new Gson().toJson(produit), JSON);
		Request request = new Request.Builder().url(ClientsServices.PRODUIT_SERVICE_URL + "/produit").post(body)
				.build();
		try {
			Response response = this.client.newCall(request).execute();
			String out = response.body().string();

			// Si Enregistrement du Produit est OK
			// Enregistrer le Stock lie a ce Produit

			// TODO

			return Integer.parseInt(out);

		} catch (Exception e) {
			return -1;
		}

	}

	// TODO: M1, M2 et M3

	// M1. Recuperer toutes informations de tous les produits (produit + stock si le
	// ws est disponible)

	// M2. Enregistrer Stock pour un produit deja enregistre

	// M3. Recuperer toutes informations (produit + stock) pour un produit donne
	// grace a son ID

}
