package StreamsDemo;

import java.util.*;
import java.util.List;

public class StreamsVSParallelStreams {
	
	public static void main(String args[])
	{
		List<Integer> list = Arrays.asList(11,22,33,44,55,66,77,88,99);
		
		long t1= System.currentTimeMillis();
		
		list.stream().map(i->i*i).forEach(i->System.out.println(i));
		
		System.out.println("Time taken by stream: " + (System.currentTimeMillis()-t1));
		
		
		long t2 = System.currentTimeMillis();
		list.parallelStream().map(i->i*i).forEach(i->System.out.println(i));
		
		System.out.println("Time taken by parallel stream: " + (System.currentTimeMillis()-t2));
		
		
		// for smaller inputs parallel stream can take more time , but usually there are faster for larger inputs
		
		
	}

}
