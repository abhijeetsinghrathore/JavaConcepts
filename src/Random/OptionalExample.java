package Random;

import java.util.*;

public class OptionalExample {
	
	public static void main(String args[])
	{
		Optional<String> nameOp = getName(1);
		
		
		// isPresent
		System.out.println(nameOp.isPresent()? nameOp.get() : "NA");
		
		
		// ifPresent : takes consumer as input (the sop will not get executed as the value is null)
		nameOp.ifPresent(x-> System.out.println(x));
		
		
		// orElse method
		System.out.println(nameOp.orElse("NA"));
		
		
		// orElseGet : takes a supplier
		
		System.out.println(nameOp.orElseGet(()->{
			return "NA";
		}));
		
		
		// orElseThrow : return an exception when element is not there
		System.out.println(nameOp.orElseThrow(()-> new NoSuchElementException()));
		
		
	}
	
	public static Optional<String> getName(int id)
	{
		// this will give null pointer exception
		// return Optional.of(null);
		
		// we can also use Optional.empty() to return null
		return Optional.ofNullable(null);
	}

}
