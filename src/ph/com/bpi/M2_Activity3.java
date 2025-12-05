package ph.com.bpi;

public class M2_Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car();
		
		car1.setBrand("Toyota");
		car1.setModel("Raize");
		car1.setColor("Gray");
		car1.setYear(2024);
		car1.carDetails();
		
		Car car2 = new Car("Kia", "Sonet", "Red", 2025);
		car2.carDetails();
		
		
	}

}
