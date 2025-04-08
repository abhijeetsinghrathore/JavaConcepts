package FunctionalInterfaces;

public class AppClass {

	
	public static void main(String args[])
	{
		System.out.println("This is AppClass");
		
		Hellable hellable = ()->{
			System.out.println("this is hell method");
		};
		
		
		hellable.hellrun();
		
		Hellable hellable2 = ()->{
			System.out.println("this is hell method2");
		};
		
		hellable2.hellrun();
	}
}
