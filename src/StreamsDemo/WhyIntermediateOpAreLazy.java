package StreamsDemo;

import java.util.*;
import java.util.stream.Stream;

public class WhyIntermediateOpAreLazy {
	
	public static void main(String args[])
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		// nothing is printed as there is no terminal operation
		Stream<Integer> s = list.stream().filter(i->i%2==0).peek(i -> System.out.println(i));
		
		// the moment we added a terminal operation filter and peek started working
		int n = (int) list.stream().filter(i->i%2==0).peek(i -> System.out.println(i)).count();
		
		
	}

}
