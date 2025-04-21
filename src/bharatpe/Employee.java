package bharatpe;

public class Employee
 {
public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

Long id;
String name;
String designation;
Double salary;

public Employee(Long id, String name, String designation, Double salary) {
this.id = id;
this.name = name;
this.designation = designation;
this.salary = salary;
}

public Long getId() {
return id;
}

public void setId(Long id) {
this.id = id;
}

public String getName() {
return name;
}

public String getDesignation() {
return designation;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
}


}
