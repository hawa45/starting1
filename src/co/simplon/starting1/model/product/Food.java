package co.simplon.starting1.model.product;

public class Food extends Product {

	//chmaps prives
	//constructeurs
	//methodes
	//getters setters
	//override genre toString Equals etc
	private boolean containsGluten;

	public Food(int quantity, String name, float sellingPrice, float buyingPrice, boolean isContainsGluten) {
		super(quantity, name, sellingPrice, buyingPrice);
		this.setContainsGluten(containsGluten);
	}

	public boolean isContainsGluten() {
		return containsGluten;
	}

	public void setContainsGluten(boolean containsGluten) {
		this.containsGluten = containsGluten;
	}
	
	@Override
	public String toString() {
		return super.toString()+isContainsGluten();
	}

}
