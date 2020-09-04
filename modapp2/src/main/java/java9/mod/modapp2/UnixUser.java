package java9.mod.modapp2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
