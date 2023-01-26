package fra.uas.user.service;


import fra.uas.user.model.User;
import fra.uas.user.repository.UserRepository;

public class UserService implements IUserService {

    UserRepository userRepository;


    @Override
    public User loginUser(String email, String password) {
        for (User user : userRepository.userList) {

            if (user.getEmail().equals(email)&&user.getHashedPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    @Override
    public void createUser(User user) {

    }

    @Override
    public User deleteUser(int userId) {
        return null;
    }

    @Override
    public User getUser(int userId) {
        for (User user : userRepository.userList) {

            if (user.getUserId() == userId){
                return user;
            }
        }
        return null;
    }

    @Override
    public User assignRole(int UserId) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
