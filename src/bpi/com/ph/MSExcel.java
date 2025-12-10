package bpi.com.ph;

public class MSExcel extends Program{
	
	public MSExcel(String name) {
		this.setName(name);
	}

	@Override
	void run() {
		String message = "Opening MS Excel...";
		setRunning(true);
		System.out.println(message);
	}

	@Override
	void stop() {
		String message = "Stopping MS Excel...";
		setRunning(false);
		System.out.println(message);
	}
	
	

}
