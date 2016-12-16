package main;

public class Wheel {

	private String type;
	private int size;
	private String width;
	
	public Wheel(String type, int size, String width) {
		super();
		this.type = type;
		this.size = size;
		this.width = width;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Wheel [type=" + type + ", size=" + size + ", width=" + width + "]";
	}
	
	public void changeTypeOfWheel(String type){
		this.type = type;
		System.out.println("you change type of wheel");
	}
	public void changeSizeOfWheel(int size){
		this.size = size;
		System.out.println("you change size of wheel");
	}
	public void changeWidthOfWheel(String width){
		this.width = width;
		System.out.println("you change width of wheel");
	}
}
