package fra.uas.user.service;


import fra.uas.user.model.User;
import fra.uas.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;



    public User getUserWithEmail(String email){
        for (User user : userRepository.userList
        ) {
            if (user.getEmail().equals(email)){
                return user;
            }

        }
        return null;
    }


    @Override
    public Boolean loginUser(String email, String password) {
        for (User user : userRepository.userList) {

            if (user.getEmail().equals(email)&&user.getHashedPassword().equals(password)){

                return true;
            }
        }
        return false;
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


}
