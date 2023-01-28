package fra.uas.user.controller;


import fra.uas.token.TokenService;
import fra.uas.user.model.User;
import fra.uas.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class UserController {


    @Autowired
    UserService userService;
    //Logger log = new Logger(UserController.class);

    @Autowired
    TokenService tokenService;

    //if (tokenService.checkIfTokenExistsAndIsValid(userToken)){
    //return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);

    @CrossOrigin
    // Mapping to create a new post
    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> loginUser(@RequestBody User user) {

        System.out.println(user.getEmail() + user.getHashedPassword());
        User newUser = userService.loginUser(user.getEmail(), user.getHashedPassword());
        if (newUser != null) {
            return ResponseEntity.status(HttpStatus.OK).header("token", userService.getUserWithEmail(newUser.getEmail()).toString()).build();
        }

        return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
    }

    @CrossOrigin
    // Mapping to get a user
    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUser(@RequestHeader UUID token) {

        if (tokenService.checkIfTokenExistsAndIsValid(token)) {
            //System.out.println("requested User data: " + userService.getUser(userID).toString());
            return ResponseEntity.status(HttpStatus.OK).body(userService.getUserWithToken(token));
        }
        return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
    }

    @CrossOrigin
    // Mapping to get a user
    @RequestMapping(value = "/logout", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> logout(@RequestHeader UUID token) {

        if (tokenService.checkIfTokenExistsAndIsValid(token)) {
            tokenService.deleteToken(token);
            return ResponseEntity.status(HttpStatus.OK).body(userService.getUserWithToken(token));
        }
        return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
    }

   /* @CrossOrigin
    @RequestMapping(value = "/user", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateUser(@RequestBody User user, @RequestHeader UUID token) {

        userService.updateUser(user);
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/user", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> deleteUser(@RequestHeader UUID token) {

        userService.deleteUser(userService.getUserWithToken(token).getUserId());
        return new ResponseEntity<String>(HttpStatus.OK);
    }*/

}
