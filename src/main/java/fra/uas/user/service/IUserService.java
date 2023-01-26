package fra.uas.user.service;

import fra.uas.user.model.User;

public interface IUserService {

	public User loginUser(String email, String password);
	
	public void createUser(User user);
	
	public User deleteUser(int userId);
	
	public User updateUser(User user);
	
	public User getUser(int userId);
	
	public User assignRole(int UserId);
	

}
