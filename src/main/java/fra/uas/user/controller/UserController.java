package fra.uas.user.controller;


import fra.uas.user.model.User;
import fra.uas.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class UserController {
    UserService userService;
    Logger log;

    @CrossOrigin
    // Mapping to create a new post
    @RequestMapping(value = "/user/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> loginUser() {

        // userService.loginUser(email,password);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @CrossOrigin
    // Mapping to create a new post
    @RequestMapping(value = "/user/{userID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUser(@PathVariable int userID) {
        System.out.printf("Hallooo");

        log.info("requested User data: " + userService.getUser(userID).toString());
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @CrossOrigin
    // Mapping to create a new post
    @RequestMapping(value = "/user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        userService.createUser(user);
        log.info("Created a new User: " + user.toString());
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @CrossOrigin
    // Mapping to create a new post
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteUser(@PathVariable int userID) {

        userService.deleteUser(userID);
        log.info("Created a new User: " + userService.getUser(userID).toString());
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
