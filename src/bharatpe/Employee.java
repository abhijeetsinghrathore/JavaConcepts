package bharatpe;

public class Employee {
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

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
}


}
