package ph.com.bpi;

public class Car {
	
	private String brand;
	private String model;
	private String color;
	private int year;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void carDetails() {
		System.out.println("Car Details");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Year: " + year);
		System.out.println(" ");
	}
	
	public Car() {
		this.brand = "null";
		this.model = "null";
		this.color = "null";
		this.year = 0;
		
	}
	
	public Car(String brand, String model, String color, int year) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.year = year;
		
	}
	

}
