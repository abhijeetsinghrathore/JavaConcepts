package StreamsDemo;

import java.util.*;
import java.util.stream.Collectors;

public class OrderOFExecution {
	
	public static void main(String args[])
	{
		List<Integer> list = Arrays.asList(1,2,5,7,8,0,3);
		
		
		// most intermediate operation run in parallel. i.e they dont wait for the complete collection
		// but sorted wait for the complete collection
		List<Integer> s = list.stream().
				filter(i->i>4)
				.peek(i-> System.out.println("after comparsion: "+i))
				.map(i-> i*-1)
				.peek(i-> System.out.println("after negation: "+i))
				.sorted()
				.peek(i-> System.out.println("after sorted: "+i))
				.collect(Collectors.toList());
	}
	
	

}
