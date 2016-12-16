package main;

public class Helm {

	private String color;
	private String type;
	
	public Helm(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Helm [color=" + color + ", type=" + type + "]";
	}
	
	public void changeColorOfHelm(String color){
		this.color = color;
		System.out.println("you change color of helm");
	}
	public void changeTypeOfHelm(String type){
		this.type = type;
		System.out.println("you change type of helm");
	}
	
	
}
