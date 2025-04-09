package StreamsDemo;

import java.util.*;
import java.util.stream.Stream;

public class CreatingStreams {
	
	public static void main(String args[])
	{
		// creating stream from list
		List<Integer> list = Arrays.asList(1,2,3);
		Stream<Integer> stream1= list.stream();
		System.out.println(stream1);
		
		
		//Creating stream from array
		Integer[] a = {1,2,3};
		Stream<Integer> stream2 = Arrays.stream(a);
		
		// Using Stream class of method
		Stream<Integer> stream3 = Stream.of(1,2,3);
		
		
		// using Stream builder
		Stream.Builder<Integer> streamBuilder = Stream.builder();
		streamBuilder.add(1).add(2).add(3);
		Stream<Integer> stream4 = streamBuilder.build();
		
	}

}
