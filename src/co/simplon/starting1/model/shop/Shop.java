package co.simplon.starting1.model.shop;

import java.util.Collection;
import java.util.HashSet;

import co.simplon.starting1.model.product.Product;

public class Shop {
	private Collection<Product> listProduct = new HashSet<>();
	
	// appel methode product pour rajouter 'jupe' dans la liste de produit
	public void addProduct(Product produit) {
		listProduct.add(produit);
	}
	
	// afficher liste AVEC BOUCLE FOREACH/ p= variable qui parcours la liste
	public void afficherliste() {
		for(Product p : listProduct) {
			System.out.println(p.getName()+", son prix : "+p.getSellingPrice());
		}
	}
}