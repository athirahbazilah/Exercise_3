package Exercise3;
import java.util.*;

public class Battery {
	
	String brand;
	String size;
	String shape;
	double voltage;
	double price;
	
	Scanner in = new Scanner(System.in);
	
	Battery() {
		
		System.out.println("Enter Battery Brand: ");
		this.brand = in.nextLine();
		System.out.println("Enter Battery Size: ");
		this.size = in.nextLine();
		System.out.println("Enter Battery Shape: ");
		this.shape = in.nextLine();
		System.out.println("Enter Battery Voltage: ");
		this.voltage = in.nextDouble();
		System.out.println("Enter Battery Price: ");
		this.price = in.nextDouble();
		
	}
	
	Battery(String b, String sz, String sh, double v, double p) {
		this.brand = b;
		this.size = sz;
		this.shape = sh;
		this.voltage = v;
		this.price = p;
		
	}

}
