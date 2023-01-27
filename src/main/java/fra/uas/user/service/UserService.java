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

    public User getUserWithToken(UUID token){
        for (User user : userRepository.userList
             ) {
            if (user.getToken()== token){
                return user;
            }

        }
        return null;
    }


    @Override
    public User loginUser(String email, String password) {
        for (User user : userRepository.userList) {

            if (user.getEmail().equals(email)&&user.getHashedPassword().equals(password)){
                user.setToken(UUID.randomUUID());
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

        User realUser = getUser(user.getUserId());
        if (user.getToken() ==realUser.getToken() ){
            return realUser;
        }
        return null;
    }
}
