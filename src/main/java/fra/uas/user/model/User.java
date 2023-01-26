package fra.uas.user.model;

public class User {


	private int userId;
	

	private String email;
	private String hashedPassword;
	private String firstName;
	private String lastName;
	
	private Role role;
	
	public User(String email, String hashedPassword, String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this.email=email;
		this.hashedPassword=hashedPassword;
		this.firstName=firstName;
		this.lastName=lastName;
		this.role = Role.STUDENT;
	}

	public User  (){

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}




}
