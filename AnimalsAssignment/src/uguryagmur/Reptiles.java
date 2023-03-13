package uguryagmur;

public abstract class Reptiles extends Animal {
	
	private String upperClassName="Sürüngenler";

	public Reptiles(String name, int weight, int length) {
		super(name, weight, length);
		
		
	}

	
	
	
	public String getUpperClassName() {
		return upperClassName;
	}




	public abstract void creep();
	
	
	

}
