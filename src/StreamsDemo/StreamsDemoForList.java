package StreamsDemo;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemoForList {
	
	public static void main(String[] args)
	{
		List<Integer> list= Arrays.asList(6,5,2,9,0,4,1,7,0,4,1,7);
		
		System.out.println("list: "+list);
		
		
		// filter function
		List<Integer> list1 = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println("list1: "+list1);
		
		
		// map function
		List<Integer> list2 = list1.stream().map(i-> i+10).collect(Collectors.toList());
		System.out.println("list2: "+list2);
		
		
		// sorted function 
		
		// 1: Sorting in default order i.e. increasing
		List<Integer> list3 = list2.stream().sorted().toList();
		System.out.println("list3: "+list3);

		
		// 2: Sorting in decreasing order
		// method 1
		List<Integer> list4 = list2.stream().sorted(Collections.reverseOrder()).toList();
		System.out.println("list4: "+list4);
		
		
		// method 2
		Comparator<Integer> comp= (a,b) -> { return b-a;};   // if I do a-b it is increasing sorting
		List<Integer> list5 = list2.stream().sorted(comp).toList();
		System.out.println("list5: " + list5);
		
		
		// count function
		int n = (int)list2.stream().count();
		System.out.println(n);
		
		// limit function
		List<Integer> list6 = list2.stream().sorted(comp).limit(2).toList();
		System.out.println("list6: " + list6);
		
		// skip function
		List<Integer> list7 = list2.stream().skip(2).toList();
		System.out.println("list7: " + list7);
		
		
		//distinct function
		List<Integer> list8 = list.stream().distinct().collect(Collectors.toList());
		System.out.println("list8: " + list8);
		
		
		// min : return first element of sorted list
		
		Comparator<Integer> compMin = (i,j)-> {
			return i-j;
		};
		Optional<Integer> min = list8.stream().min(compMin);
		
		System.out.println(min.get());
		
		// max : return last element of sorted list
		Optional<Integer> max = list8.stream().max(compMin);
		
		System.out.println(max.get());
		
		
	}

}
