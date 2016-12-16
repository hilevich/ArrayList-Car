package main;

import java.util.ArrayList;

public class ArrayCar {
	
	static ArrayList<Car> array = new ArrayList<>();

	
	public  ArrayList<Car> getArray() {
		return array;
	}

	public  void addCar(Car car) {
		array.add(car);
	}
	
	public void addNewCarInArray(){
		Car car = new Car("1",new Wheel("summer", 19, "225"), new Helm("red", "multi"), new Body("red", "5 m", "2 m"));
		Car car1 = new Car("2",new Wheel("summer", 10, "225"), new Helm("black", "not_multi"), new Body("black", "5 m", "2 m"));
		Car car2 = new Car("3",new Wheel("wintter", 12, "225"), new Helm("red", "multi"), new Body("black", "5 m", "2 m"));
		Car car3 = new Car("4",new Wheel("summer", 14, "225"), new Helm("black", "multi"), new Body("red", "5 m", "2 m"));
		Car car4 = new Car("5",new Wheel("wintter", 15, "225"), new Helm("red", "not_multi"), new Body("black", "5 m", "2 m"));
		
		array.add(car);
		array.add(car1);
		array.add(car2);
		array.add(car3);
		array.add(car4);
		
		
	}
	
}
