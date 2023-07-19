
public class main {

	public static void main(String[] args) {
		Employee emp = new Employee(4000);
		HRmanager mgr = new HRmanager(6000);
		emp.work();
		System.out.println("Employee salary:"+emp.getSalary());
		mgr.work();
		System.out.println("Manager salary:"+mgr.getSalary());
		mgr.addEmployee();

	}

}
