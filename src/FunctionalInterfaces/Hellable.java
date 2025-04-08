package FunctionalInterfaces;

public interface Hellable {
	
	abstract void hell();
	
	public default void hellrun()
	{
		hell();
	}

}
