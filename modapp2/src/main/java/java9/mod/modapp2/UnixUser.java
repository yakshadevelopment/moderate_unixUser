package java9.mod.modapp2;




public class UnixUser {
	private String userId;
	private String employeeId;
	private String userName;
	private String userType;
	public UnixUser(String employeeId, String userName, String userType) {
		super();
		this.employeeId = employeeId;
		this.userName = userName;
		this.userType = userType;
	}
	
	public UnixUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
   
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public boolean equals(Object obj) {
		UnixUser other=(UnixUser) obj;
		 if (this.hashCode()==other.hashCode())
			return true;
		 else
		return false ;
	}
	@Override
	public int hashCode() {
		return Integer.parseInt(employeeId);
	}
	@Override
	public String toString() {
		String output=String.format("%-10s %-15s %-20s %-15s",userId,employeeId,userName,userType);
		return output;
	} 

}
