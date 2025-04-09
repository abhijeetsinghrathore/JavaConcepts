package StreamsDemo;

import java.util.*;
import java.util.stream.Stream;

public class WhenMultipleTerminalOperationOnStream {
	
	public static void main(String args[])
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Stream<Integer> s = list.stream().filter(i->i%2==0);
		
		long count = s.count();
		
		System.out.println("count of stream s: "+s);
		
		
		// we have already performed a terminal operation count on stream s, then we are again
		// trying to perform another terminal operation i.e. min. Hence we got: 
		// java.lang.IllegalStateException: stream has already been operated upon or closed
		Optional<Integer> min = s.min((Integer i,Integer j)-> {return i-j;});
	}

}
