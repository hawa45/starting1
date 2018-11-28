package co.simplon.starting1.model.product;

public class Clothing extends Product {
	

	public Clothing(int quantity, String name, float sellingPrice, float buyingPrice, ClothingSize size) {
		super(quantity, name, sellingPrice, buyingPrice);
		this.setSize(size);
	}

	private ClothingSize size;

	public ClothingSize getSize() {
		return size;
	}

	public void setSize(ClothingSize size) {
		this.size = size;
	}
	
	@Override
	public String toString() {		
		return super.toString()+" ,Taille : "+this.getSize();
	}



}
