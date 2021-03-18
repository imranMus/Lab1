import java.util.Scanner;

public class weightcal {
	
	double mass;
	
	weightcal(double mass){
		this.mass = mass;
	}
	
	void setMass(double mass) {
		this.mass = mass;
	}
	
	public void weight() {
		double earthWeight = mass * 9.80665;
		double marsWeight = mass * 3.711;
		
		System.out.println("Mass: "+mass+"KG\nWeight on Earth: " +earthWeight+"N\nWeight on Mars: "+marsWeight+"N\n");
	}
}
