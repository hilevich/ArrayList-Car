package main;



public class UserManu {

	

	public void infoUserManu(){
		System.out.println();
		System.out.println("1 - create new Car");
		System.out.println("2 - delete Car ");
		System.out.println("3 - veaw all car in factory");
		System.out.println("4 - Find cars that have entered diameter wheels");
		System.out.println("5 - Find cars that have entered diameter wheels and body color.");
		System.out.println("6 - Replace all machines that have a red body color wheel to another");
		System.out.println("7 - Larger diameter wheels doubled if the steering wheel has buttons");
		System.out.println("8 - Replace all machines that have smaller diameter wheels introduced values for other wheels");
		System.out.println("9 - Exit");
		
	}
	
	
	
	public void swithManu(){
		boolean flag = true;
		while(flag){
		infoUserManu();
		
		switch (UserSystemIn.getChange()) {
		case "1":{
			infoUserCreateNewCar();
			break;
		}
		case "2":{
			deleteCar();
			break;
		}
		case "3":{
			veawAllCarInFactory();
			break;
		}
		case "4":{
			findCarsThatHaveEnteredDiameterWheels();
			break;
		}
		case "5":{
			findCarsThatHaveEnteredDiameterWheelsAndBodyColor();
			break;
		}
		case "6":{
			replaceAllMachinesThatHaveARedBodyColorWheelToAnother();
			break;
		}
		case "7":{
			largerDiameterWheelsDoubledIfTheSteeringWheelHasButtons();
			break;
		}
		case "8":{
			replaceAllMachinesThatHaveSmallerDiameterWheelsIntroducedValuesForOtherCar();
			break;
		}
		case "9":{
			System.out.println("Exit");
			flag = false;
			break;
		}
		}
		}
		
	}
	
	
	
	
	
	
	

	public Car infoUserCreateNewCar(){
	
		 int  sizeOfWheel =0;
		int flag = 1;
		String WINcode =null;
		System.out.println("continue ( y/n )");
		if(UserSystemIn.getChange().equalsIgnoreCase("n")){
			return null;
		}
		
		while(flag!=0){
		flag = 0;	
		
		
		System.out.println("Enter WIN code");
		WINcode = UserSystemIn.getChange();
		
		for (Car car : ArrayCar.array) {
			if (car.getWINcode().equals(WINcode)){
				flag++;
			}
		}
		if(flag==0){
			System.out.println("WIN code is create");
		}else{
			System.out.println("Enter another WIN code");
		}
		
	
		}
		System.out.println("new WINcode is correct");
		System.out.println();
		System.out.println("Enter type Of Wheel");
		String typeOfWheel = UserSystemIn.getChange();
		System.out.println("Enter size Of Wheel (int)");
		String size = UserSystemIn.getChange();
	    try {
	         sizeOfWheel = Integer.valueOf(size);
	          
	    }catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    } 
		
		System.out.println("Enter width Of Wheel");
		String widthOfWheel = UserSystemIn.getChange();
		System.out.println("Enter color Of Helm");
		String colorOfHelm = UserSystemIn.getChange();
		System.out.println("Enter type OF Helm");
		String typeOFHelm = UserSystemIn.getChange();
		System.out.println("Enter color Of Body");
		String colorOfBody = UserSystemIn.getChange();
		System.out.println("Enter length Of Body");
		String lengthOfBody = UserSystemIn.getChange();
		System.out.println("Enter width Of Body");
		String widthOfBody = UserSystemIn.getChange();
		//String query = "INSERT INTO factorry.car (code, typeOfWheel, sizeOfWheel, widthOfWheel, colorOfHelm, typeOFHelm, colorOfBody, lengthOfBody, widthOfBody)" + " VALUES ('"+WINcode+"','"+typeOfWheel+"', '"+sizeOfWheel+"', '"+widthOfWheel+"', '"+colorOfHelm+"', '"+typeOFHelm+"', '"+colorOfBody+"', '"+lengthOfBody+"', '"+widthOfBody+"');";
	//	stmt.executeUpdate(query);
		Car car = new Car(WINcode, new Wheel(typeOfWheel, sizeOfWheel, widthOfWheel), new Helm(colorOfHelm, typeOFHelm), new Body(colorOfBody, lengthOfBody, widthOfBody));
		 ArrayCar.array.add(car);
		System.out.println("new car is create");
		
		return car;
	}

	public void deleteCar(){
		
		int flag = 1;
		Car deletCar = null;
		String WINcode =null;
		System.out.println("continue ( y/n )");
		if(UserSystemIn.getChange().equalsIgnoreCase("n")){
			return;
		}
	
		
		while(flag!=0){
		
		
		
		System.out.println("Enter WIN code");
		WINcode = UserSystemIn.getChange();
		
		for (Car car :  ArrayCar.array) {
			if (car.getWINcode().equals(WINcode)){
				flag = 0;
				deletCar = car; 
			}
		}
		if(flag==0){
			ArrayCar.array.remove(deletCar);
			System.out.println("Car is delete with this WIN code = " + WINcode);
		}else{
			System.out.println("Enter another WIN code");
		}
		}
		
		
	}

	public void veawAllCarInFactory(){
		
		
		for (Car car : ArrayCar.array) {
			System.out.println(car);
		}
		
	}

	public void findCarsThatHaveEnteredDiameterWheels(){
		
		System.out.println("Enter Diameter of Wheels");
		int diametr = 0;
		
		String str = UserSystemIn.getChange();
	    try {
	         diametr = Integer.valueOf(str);
	          
	    }catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    } 
		
		for (Car car :  ArrayCar.array) {
			if(car.getSizeWheel()==diametr){
				System.out.println(car);
			}
		}
		
	}
	
	public void findCarsThatHaveEnteredDiameterWheelsAndBodyColor(){
		
		System.out.println("Enter Diameter of Wheels");
	
		
		int diametr = 0;
		
		String str = UserSystemIn.getChange();
	    try {
	         diametr = Integer.valueOf(str);
	          
	    }catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    } 
		
		
		System.out.println("Enter color of body");
		String color = UserSystemIn.getChange();
		
		for (Car car :  ArrayCar.array) {
			if(car.getSizeWheel()==diametr && car.getColor().equals(color)){
				System.out.println(car);
			}
		}
		
	}
	
	public void replaceAllMachinesThatHaveARedBodyColorWheelToAnother(){
		
		
		
		
		System.out.println("Enter change type of Helm");
		String typeNew = UserSystemIn.getChange();
		
		for (Car car :  ArrayCar.array) {
			if(car.getColor().equals("red")){
				car.setTypeHelm(typeNew);;
			}
		}
		
	}
	
	
	public void largerDiameterWheelsDoubledIfTheSteeringWheelHasButtons(){
		
	
		
		for (Car car :  ArrayCar.array) {
			if(car.getTypeHelm().equals("multi")){
				car.setSizeWheel(car.getSizeWheel()*2);;
			}
		}
		
	}
	
	
	
	

	public void replaceAllMachinesThatHaveSmallerDiameterWheelsIntroducedValuesForOtherCar(){
		
		int index = 0;
		
		int diametr = 0;
		
		String str = UserSystemIn.getChange();
	    try {
	         diametr = Integer.valueOf(str);
	          
	    }catch (NumberFormatException e) {  
	        System.err.println("Неверный формат строки!");  
	    } 
		
		for (Car car :  ArrayCar.array) {
			if(car.getSizeWheel()<diametr){
				index ++;
				 ArrayCar.array.set(index, infoUserCreateNewCar());
			}
		}
		
	}
	
	
	
	
}


