package FunctionalInterfaces;

public interface VehicleRun {

	
	public static void main(String args[])
	{
		Vehicle truck = ()->{
			System.out.println("Truck has 8 tires");
		};
		
		truck.getNumberOfTires();
		
		
		Vehicle car = ()->{
			System.out.println("Car has 4 tires");
		};
		car.getNumberOfTires();
		
		Vehicle bike = ()->{
			System.out.println("Bike has 2 tires");
		};
		bike.getNumberOfTires();
		
		
		Vehicle2 cycle = (int x)->{
			System.out.println("Number of tires in cycle: "+x);
		};
		
		cycle.getNumberOfTires(2);
	}
}
