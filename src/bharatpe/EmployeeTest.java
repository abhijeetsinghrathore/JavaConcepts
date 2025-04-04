package bharatpe;

import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
		new Employee(1L, "Bob", "SE", 10D),
		new Employee(2L, "John", "QA", 18D),
		new Employee(3L, "Jack", "BA", 12D),
		new Employee(4L, "Shawn", "SE", 15D),
		new Employee(4L, "Shawn", "SE", 15D),
		new Employee(3L, "Jack", "BA", 12D)
		);
		
		
		
		/*
		 * HashSet<Long> set = new HashSet<>(); List<Employee> dupesemployeeList = new
		 * ArrayList<>(); for(int i=0;i<employeeList.size();i++) {
		 * if(set.contains(employeeList.get(i).getId())) {
		 * dupesemployeeList.add(employeeList.get(i)); }
		 * 
		 * set.add(employeeList.get(i).getId()); }
		 * 
		 * System.out.println(dupesemployeeList);
		 * 
		 * 
		 * List<Employee> emp =
		 * employeeList.stream().filter(i->!set.add(i.getId())).collect(Collectors.
		 * toList());
		 * 
		 * System.out.println(emp);
		 * 
		 * 
		 * Map<String,Double> map = new TreeMap<>();
		 * 
		 * for(int i=0;i<employeeList.size();i++) {
		 * if(map.containsKey(employeeList.get(i).designation)) {
		 * map.put(employeeList.get(i).designation,map.get(employeeList.get(i).
		 * designation) + employeeList.get(i).salary); } else {
		 * map.put(employeeList.get(i).designation,employeeList.get(i).salary); } }
		 * 
		 * 
		 * 
		 * List<Double> sortedSalaries = new ArrayList<>();
		 * 
		 * sortedSalaries.addAll(map.values());
		 * 
		 * Collections.sort(sortedSalaries,Collections.reverseOrder());
		 * 
		 * System.out.println(sortedSalaries);
		 * 
		 * System.out.println(map);
		 * 
		 * 
		 * for(Map.Entry<String,Double> entry: map.entrySet()) {
		 * System.out.println(entry.getKey()); }
		 */
		
		
		Comparator<Employee> comp = (a,b) -> {return (int)(b.salary-a.salary);};
		List<Employee> sortedList = employeeList.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(sortedList);
		
		
		
	
	}
	
	//TODO: Use Stream API to find out the Duplicate Employee Entries by Employee ID
	
	

	//TODO: Use Stream API to find out the total salary of each designation sorted by total salary in descending order
	
}
