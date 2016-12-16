package main;

public class Body {

	private String color;
	private String length;
	private String width;
	public Body(String color, String length, String width) {
		super();
		this.color = color;
		this.length = length;
		this.width = width;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Body [color=" + color + ", length=" + length + ", width=" + width + "]";
	}
	

	
	public void changeColorOfBody(String color){
		this.color = color;
		System.out.println("you change Color of Body");
	}public void changeLengthOfBody(String length){
		this.length = length;
		System.out.println("you change Length of Body");
	}public void changeWidthOfBody(String width){
		this.width = width;
		System.out.println("you change Widt of Body");
	}
	
	
}
