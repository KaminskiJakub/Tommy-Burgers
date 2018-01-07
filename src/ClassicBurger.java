public class ClassicBurger {

	private String breadRollType;
	private String meat;
	private String name;
	private double price;

	private String addition1Name;
	private double addition1Price;

	private String addition2Name;
	private double addition2Price;

	private String addition3Name;
	private double addition3Price;

	private String addition4Name;
	private double addition4Price;

	public ClassicBurger(String name, String meat, double price, String breadRollType) {
		this.name = name;
		this.meat = meat;
		this.price = price;
		this.breadRollType = breadRollType;
	}

	public void addBurgerAddition1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}

	public void addBurgerAddition2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}

	public void addBurgerAddition3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}

	public void addBurgerAddition4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}

	public double itemizeBurger() {
		double burgerPrice = this.price;
		System.out.println(this.name + " burger" + " on a " + this.breadRollType + " roll " + "with " + this.meat
				+ " , price is " + this.price);

		if (this.addition1Name != null) {
			burgerPrice += this.addition1Price;
			System.out.println(this.addition1Name + " was added for an extra " + this.addition1Price);
		}

		if (this.addition2Name != null) {
			burgerPrice += this.addition2Price;
			System.out.println(this.addition2Name + " was added for an extra " + this.addition2Price);
		}

		if (this.addition3Name != null) {
			burgerPrice += this.addition3Price;
			System.out.println(this.addition3Name + " was added for an extra " + this.addition3Price);
		}

		if (this.addition4Name != null) {
			burgerPrice += this.addition4Price;
			System.out.println(this.addition4Name + " was added for an extra " + this.addition4Price);
		}

		return burgerPrice;
	}

}
