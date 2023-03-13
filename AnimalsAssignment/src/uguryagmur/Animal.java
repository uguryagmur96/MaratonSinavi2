package uguryagmur;

public abstract class Animal {
	
	private String name;
	private int weight;
	private int length;
	private boolean isDangerous;
	private String className;
	private String upperClassName;
	
	
	public Animal(String name, int weight, int length) {
		this.name = name;
		this.weight = weight;
		this.length = length;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public boolean isDangerous() {
		return isDangerous;
	}


	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
		
	}
	
	


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", length=" + length + ", isDangerous=" + isDangerous
				+ "]";
	}
	
	
	
	public String getUpperClassName() {
		return upperClassName;
	}


	public void setUpperClassName(String upperClassName) {
		this.upperClassName = upperClassName;
	}


	public abstract void roar();
	
	
	

}
