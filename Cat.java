package pregovor;

public class Cat extends Animal {

	public Cat() {
		super();
	}
	
	public Cat(String name) {
		super(name);
	}

	@Override
	public void greets() {
		System.out.println("Meow");
	}

}
