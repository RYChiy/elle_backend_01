package fra.uas.user.repository;

import fra.uas.user.model.Role;
import fra.uas.user.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UserRepository {


    public ArrayList<User> userList = new ArrayList<>();

    //Admin creation
    @PostConstruct
    public void init() {


        User issam = new User();
        issam.setRole(Role.STUDENT);
        issam.setEmail("issam.boutachdat@stud.fra-uas.de");
        issam.setFirstName("Issam");
        issam.setLastName("Boutachdat");
        issam.setHashedPassword("12345");
        issam.setUserId(1);


        User arvand = new User();
        arvand.setRole(Role.STUDENT);
        arvand.setEmail("arvand.hashemi@stud.fra-uas.de");
        arvand.setFirstName("Arvand");
        arvand.setLastName("Hashemi");
        arvand.setHashedPassword("12345");
        arvand.setUserId(1);

        User rachid = new User();
        rachid.setRole(Role.STUDENT);
        rachid.setEmail("rachid.yagubi@stud.fra-uas.de");
        rachid.setFirstName("Rachid");
        rachid.setLastName("Yagubi");
        rachid.setHashedPassword("12345");
        rachid.setUserId(1);

        User simon = new User();
        simon.setRole(Role.STUDENT);
        simon.setEmail("Simon.Carmesin@stud.fra-uas.de");
        simon.setFirstName("Simon");
        simon.setLastName("Carmesin");
        simon.setHashedPassword("12345");
        simon.setUserId(1);


        userList.add(simon);
        userList.add(rachid);
        userList.add(arvand);
        userList.add(issam);

    }

}
