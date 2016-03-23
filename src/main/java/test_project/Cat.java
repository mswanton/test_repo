package test_project;

public class Cat {
	private String name;
	private String color;
	
	public Cat (String name, String color){
		this.name = name;
		this.color = color;
	}
	
	public void noise(){
		System.out.println("meow");
	}
	
	public String toString(){
		return "Name: " + name + " Color: " + color;
	}
}
