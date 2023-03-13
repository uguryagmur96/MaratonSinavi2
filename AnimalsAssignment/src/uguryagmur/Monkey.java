package uguryagmur;

public class Monkey extends Mammals {
	
	private String className;

	public Monkey(String name, int weight, int length) {
		super(name, weight, length);
		setClassName("Monkey");
		setUpperClassName("Mammels");
		setDangerous(false);
	}

	@Override
	public void walk() {
		System.out.println(getName() + " yürüyor!");
		
	}
	
	public void roar() {
		System.out.println(getName() + " çığlık atıyor!");
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	

}
