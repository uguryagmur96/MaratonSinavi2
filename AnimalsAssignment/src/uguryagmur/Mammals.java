package uguryagmur;

public abstract class Mammals extends Animal {
	
	private String upperClassName="Memeli Hayvan";
	
	

	public Mammals(String name, int weight, int length) {
		super(name, weight, length);
		
		
	}

	
	
	public String getUpperClassName() {
		return upperClassName;
	}



	public abstract void walk();

}
