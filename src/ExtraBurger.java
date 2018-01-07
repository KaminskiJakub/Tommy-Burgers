
public class ExtraBurger extends ClassicBurger{

	public ExtraBurger() {
		super("Extra", "chicken with bacon", 8.5, "wheat with sesame");
		super.addBurgerAddition1("Chips", 3.25);
		super.addBurgerAddition2("Soda", 2.25);
	}

	@Override
	public void addBurgerAddition1(String name, double price) {
		System.out.println("An additional item cannot be added to the extra burger.");
	}

	@Override
	public void addBurgerAddition2(String name, double price) {
		System.out.println("An additional item cannot be added to the extra burger.");

	}

	@Override
	public void addBurgerAddition3(String name, double price) {
		System.out.println("An additional item cannot be added to the extra burger.");
;
	}

	@Override
	public void addBurgerAddition4(String name, double price) {
		System.out.println("An additional item cannot be added to the extra burger.");

	}

	
	
}
