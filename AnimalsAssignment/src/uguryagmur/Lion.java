package uguryagmur;

public class Lion extends Mammals {
	
	private String className;
	
	
	

	public Lion(String name, int weight, int length) {
		super(name, weight, length);
		setDangerous(true);
		setUpperClassName("Mammels");
		this.className="Lion";
	}

	@Override
	public void walk() {
		System.out.println(getName()+ " usulca yürüyor!");
		
	}
	
	public void roar() {
		System.out.println(getName() + " kükrüyor!");
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	
	
	

}
