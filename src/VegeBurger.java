
public class VegeBurger extends ClassicBurger {

	private String vegeExtra1Name;
	private double vegeExtra1Price;
	
	private String vegeExtra2Name;
	private double vegeExtra2Price;
	
	public VegeBurger(String meat, double price) {
		super("VegeBurger", meat, price, "brown");
	}
	
	public void addVegeAddition1(String name, double price) {
		this.vegeExtra1Name = name;
		this.vegeExtra1Price = price;
	}
	
	public void addVegeAddition2(String name, double price) {
		this.vegeExtra2Name = name;
		this.vegeExtra2Price = price;
	}

	@Override
	public double itemizeBurger() {
		double burgerPrice = super.itemizeBurger();
		if (this.vegeExtra1Name != null) {
			burgerPrice += this.vegeExtra1Price;
			System.out.println(this.vegeExtra1Name + " was added for an extra " + this.vegeExtra1Price);
		}
		
		if (this.vegeExtra2Name != null) {
			burgerPrice += this.vegeExtra2Price;
			System.out.println(this.vegeExtra2Name + " was added for an extra " + this.vegeExtra2Price);
		}
		
		return burgerPrice;
	}
	
	
}
