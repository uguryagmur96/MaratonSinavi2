package uguryagmur;

public class Lizard extends Reptiles {
	
	private String className;

	public Lizard(String name, int weight, int length) {
		super(name, weight, length);
		setClassName("Lizard");
		setUpperClassName("Reptiles");
		setDangerous(false);
	}

	@Override
	public void creep() {
		System.out.println(getName() + " sürünerek gidiyor");
		
	}
	public void roar() {
		System.out.println(getName() + " çok ayrı tıslıyor!");
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	

}
