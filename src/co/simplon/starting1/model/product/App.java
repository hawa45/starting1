package co.simplon.starting1.model.product;

import co.simplon.starting1.model.shop.Shop;

public class App {

	public static void main(String[] args) {

		Product jupe = new Clothing(1, "jupe", 10f, 5f, ClothingSize.S);
		Product coca = new Food(1, "coca", 16f, 5f, false);
		Shop carrefour = new Shop();
		
		// ajoute jupe et coca dans la liste
		carrefour.addProduct(jupe);
		carrefour.addProduct(coca);
		
		carrefour.afficherliste();
		
	}

}
