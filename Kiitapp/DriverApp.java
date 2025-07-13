package Kiitapp;

import Kiitmodel.Car;
import Kiitmodel.Engine;
import Kiitmodel.Gear;
public class DriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine engine1=new Engine("Tata",25,2500);
		Engine engine2=new Engine("Volvo",35,2500);
  
		Gear gear1=new Gear("Maruti",8,"Manual");
		Gear gear2=new Gear("BMW",12,"Automatic");
          //              cbv     cbv      cbv     cbv     cbv
		Car car1=new Car("Audi", "White", 1000.0, engine2,gear2); //CDI
		Car car2=new Car();  //CDI -->Constructor Dependency injection
		
		car2.setCarMfgName("Mercedes");
		car2.setCarColor("White");
		car2.setCarPrice(500.0);
		car2.setEngine(engine1);     //SDI-->Setter Dependency Injection
		car2.setGear(gear1);
		System.out.println(car1);
		System.out.println(car2);
	}

}
