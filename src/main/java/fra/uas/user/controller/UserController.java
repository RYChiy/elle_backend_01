package fra.uas.user.controller;


import fra.uas.user.model.User;
import fra.uas.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class UserController {



    @Autowired
    UserService userService;
    //Logger log = new Logger(UserController.class);

    @CrossOrigin
    // Mapping to create a new post
    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> loginUser(@RequestBody User user) {

        System.out.println(user.getEmail()+ user.getHashedPassword());
       User newUser = userService.loginUser(user.getEmail(),user.getHashedPassword());
       if(newUser != null){
           return ResponseEntity.status(HttpStatus.OK).header("token", userService.getUserWithEmail(newUser.getEmail()).toString()).build();
       }

        return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
    }

    @CrossOrigin
    // Mapping to get a user
    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUser(@RequestHeader UUID token) {
        System.out.println("Hallooo");
        //System.out.println(userService.getUserWithToken(token));

        //System.out.println("requested User data: " + userService.getUser(userID).toString());
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserWithToken(token));
    }

    @CrossOrigin
    // Mapping to create a new post
    @RequestMapping(value = "/user", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateUser(@RequestBody User user, @RequestHeader UUID uuid) {
        userService.updateUser(user);
        //log.info("Created a new User: " + user.toString());
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @CrossOrigin
    // Mapping to create a new post
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteUser(@PathVariable int userID) {

        userService.deleteUser(userID);
       // log.info("Created a new User: " + userService.getUser(userID).toString());
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
