import jdbc.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println(new EmployeeDAO().insert(new Employee(1006, "Sachin", "Manager", 7369, new java.sql.Date(Calendar.getInstance().getTime().getTime()), 5000.00, 500.00, 20)));
			System.out.println(new EmployeeDAO().read(1004));
			System.out.println(new EmployeeDAO().delete(1006)+" row deleted successfully");
			System.out.println(new EmployeeDAO().update(1003,"revanth")+" row update successfully");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
