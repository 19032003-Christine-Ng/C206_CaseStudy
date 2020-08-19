import java.util.ArrayList;

//Christine
public class Account {
	
	private String username;
	private String password;
	private String userRole;
	

	//constructor
	public Account(String username, String password, String userRole) {
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUserRole() {
		return userRole;
	}


	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	public String toString() {
		String output = String.format("Username: %-10s", username);
		output += String.format("Password: ", password);
		output += String.format("userRole: ", userRole);
		return output;
		
	}
}
	

