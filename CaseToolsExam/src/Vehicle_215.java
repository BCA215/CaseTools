
public class Vehicle_215 {

	String brand;
	int speed;
	
	Vehicle_215(String brand)
	{
		this.brand=brand;
		this.speed=0;
	}
	
	int decrease_speed(int decr)
	{
		
		this.speed=speed-decr;
		return speed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
