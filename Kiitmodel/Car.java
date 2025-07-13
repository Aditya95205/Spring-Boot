package Kiitmodel;

public class Car {

	private String carMfgName;
	private String carColor;
	private double carPrice;
	
	Engine engine;
	Gear gear;
	
	public Car() {}
	public Car(String carMfgName, String carColor, double carPrice, Engine engine, Gear gear) {
	super();
	this.carMfgName = carMfgName;
	this.carColor = carColor;
	this.carPrice = carPrice;
	this.engine = engine;
	this.gear = gear;
}

	public String getCarMfgName() {
		return carMfgName;
	}

	public void setCarMfgName(String carMfgName) {
		this.carMfgName = carMfgName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Gear getGear() {
		return gear;
	}

	public void setGear(Gear gear) {
		this.gear = gear;
	}

	@Override
	public String toString() {
		return "Car [carMfgName=" + carMfgName + ", carColor=" + carColor + ", carPrice=" + carPrice + ", engine="
				+ engine + ", gear=" + gear + "]";
	};

	
}
