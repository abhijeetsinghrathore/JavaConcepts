package DesignPatterns;

public class SingletinDesignPattern {
	
	public static void main(String args[])
	{
		Singleton object1 = Singleton.getInstance();
		object1.s = "String of object1";
		
		Singleton object2 = Singleton.getInstance();
		
		
		// We did not set any value to s of object2 , still we got the same value of s that we set in object1
		System.out.println(object2.s);
	}

}
