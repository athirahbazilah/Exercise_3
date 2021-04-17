package Exercise3;

public class Main {

	public static void main(String[] args) {
		
		Battery Energizer = new Battery();
		System.out.println("Battery Brand: " + Energizer.brand);
		System.out.println("Battery Size: " + Energizer.size);
		System.out.println("Battery Shape: " + Energizer.shape);
		System.out.println("Battery Voltage: " + Energizer.voltage + " Volts");
		System.out.println("Battery Price: RM " + Energizer.price);
		System.out.println();
		
		Battery Panasonic = new Battery("Panasonic", "AA", "Cylinder", 1.5, 34.50);
		System.out.println("Battery Brand: " + Panasonic.brand);
		System.out.println("Battery Size: " + Panasonic.size);
		System.out.println("Battery Shape: " + Panasonic.shape);
		System.out.println("Battery Voltage: " + Panasonic.voltage + " Volts");
		System.out.println("Battery Price: RM " + Panasonic.price);
		

	}

}
