package entities;

public class Employee {
	private int employee_ID;
	private String fullName;
	private String roleTitle;
	private String departmentName;
	private String username;
	private String password;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(int employee_ID, String fullName, String roleTitle, String departmentName, String username,
			String password) {
		this.employee_ID = employee_ID;
		this.fullName = fullName;
		this.roleTitle = roleTitle;
		this.departmentName = departmentName;
		this.username = username;
		this.password = password;
	}



	public void setEmployeeID(int ID) {
		employee_ID = ID;
	}
	
	public void setName(String name) {
		fullName = name;
	}
	
	public void setTitle(String title) {
		roleTitle = title;
	}
	
	public void setDepartment(String department) {
		departmentName = department;
	}
	
	public void setUsername(String user) {
		username = user;
	}
	
	public void setPassword(String pw) {
		password = pw;
	}
	
	//getters
	
	public String getName() {
		return fullName;
	}
	
	public int getEmpID() {
		return employee_ID;
	}
	
	public String getRoleTitle() {
		return roleTitle;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}

}
