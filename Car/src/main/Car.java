package main;



public class Car {

	private String WINcode;
	private Wheel wheel;
	private	Helm helm;
	private Body body;
	
	public Car(String WINcode, Wheel wheel, Helm helm, Body body) {
		super();
		this.WINcode = WINcode;
		this.wheel = wheel;
		this.helm = helm;
		this.body = body;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}



	
	public String getWINcode() {
		return WINcode;
	}

	public void setWINcode(String wINcode) {
		WINcode = wINcode;
	}
	

	@Override
	public String toString() {
		return "Car [WINcode=" + WINcode + ", wheel=" + wheel + ", helm=" + helm + ", body=" + body + "]";
	}

	public int getSizeWheel() {
		return wheel.getSize();
	}

	public String getColor() {
		return body.getColor();
	}

	public String getTypeWheel() {
		return wheel.getType();
	}

	public void setSizeWheel(int size) {
		wheel.setSize(size);
	}

	public void setTypeWheel(String type) {
		wheel.setType(type);
	}

	public String getTypeHelm() {
		return helm.getType();
	}

	public void setTypeHelm(String type) {
		helm.setType(type);
	}
	
	

	
	
	
	
	
	
	
	
	
}
