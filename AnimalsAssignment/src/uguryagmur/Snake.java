package uguryagmur;

public class Snake extends Reptiles {
	
	private String className;

	public Snake(String name, int weight, int length) {
		super(name, weight, length);
		setUpperClassName("Reptiles");
		setClassName("Snake");
		setDangerous(true);
	}

	@Override
	public void creep() {
		System.out.println(getName() + " sürünüyor!");
		
	}
	
	public void roar() {
		System.out.println(getName() + " tıslıyor!");
	}

}
