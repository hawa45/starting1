package co.simplon.starting1.model.product;

public class Beauty extends Product{
	
	public Beauty(int quantity, String name, float sellingPrice, float buyingPrice, boolean isContainParaben) {
		super(quantity, name, sellingPrice, buyingPrice);
		this.setContainsParaben(containsParaben);
	}

	private boolean containsParaben;

	public boolean isContainsParaben() {
		return containsParaben;
	}

	public void setContainsParaben(boolean containsParaben) {
		this.containsParaben = containsParaben;
	}

}
