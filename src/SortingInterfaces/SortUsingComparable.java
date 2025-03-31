package SortingInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingComparable {

	public static void main(String args[])
	{
		Movie m1 = new Movie(1,1.0);
		Movie m2 = new Movie(2,2.0);
		Movie m3 = new Movie(3,3.0);
		Movie m4 = new Movie(4,4.0);
		Movie m5 = new Movie(5,5.0);
		
		List<Movie> movieList = new ArrayList<>();
		movieList.add(m5);
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m4);
		movieList.add(m3);
		
		System.out.println(movieList);
		
		Collections.sort(movieList);
		
		System.out.println(movieList);
	}

}
