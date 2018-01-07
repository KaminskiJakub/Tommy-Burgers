
public class MainBurger {

	public static void main(String[] args) {

		ClassicBurger classicBurger1 = new ClassicBurger("Classico", "beef", 2.25, "wheat");
		double price = classicBurger1.itemizeBurger();
		classicBurger1.addBurgerAddition1("Tomato", 0.35);
		classicBurger1.addBurgerAddition2("Lettuce", 0.50);
		classicBurger1.addBurgerAddition3("Cheese", 1);
		System.out.println("Total burger price is: "+  classicBurger1.itemizeBurger() + " euro.");
		
		VegeBurger vegeBurger1 = new VegeBurger("soy chop", 5);
		vegeBurger1.addBurgerAddition1("Arugula", 0.7);
		vegeBurger1.addVegeAddition1("Courgette", 1.25);
		System.out.println("Total VegeBurger price is: " + vegeBurger1.itemizeBurger());

		ExtraBurger extraBurger1 = new ExtraBurger();
		extraBurger1.addBurgerAddition3("Should not do this", 50.50);
		extraBurger1.itemizeBurger();
	}

}
