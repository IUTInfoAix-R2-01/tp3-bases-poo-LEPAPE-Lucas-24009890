
public class Livre {
	private String name;
	private float price;
	private int qty;
	
	public Livre() {
		name = "20th Century Boy";
		price = 7.99f;
		qty = 3;
	}
	
	public Livre(String name, float price, int qty) {
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setName(float newPrice) {
		this.price = newPrice;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int newQty) {
		this.qty = newQty;
	}
	
	public String toString() {
		return String.format("Livre[name=%s, price=%.2f, quantity=%d]", this.name, this.price, this.qty);
	}
}
