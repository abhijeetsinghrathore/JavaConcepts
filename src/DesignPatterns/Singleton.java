package DesignPatterns;

public class Singleton {
	
	String s;
	
	private static Singleton obj;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if(obj==null)
		{
			obj = new Singleton();
		}
		return obj;
	}

}
