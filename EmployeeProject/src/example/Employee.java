package example;

public class Employee {
	
	int empId;
	String empName;
	
	public Employee(){
		
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static void main(String[] args) {
		
		Employee employee=new Employee(1, "Sai");
		System.out.println(employee);
	}

}
