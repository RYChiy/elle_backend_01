package fra.uas.course.controller;

import fra.uas.course.service.CourseService;
import fra.uas.token.TokenRepository;
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
public class CourseController {

    @Autowired
    TokenService tokenService;


    @Autowired
    UserService userService;

    @Autowired
    CourseService courseService;
    //Logger log = new Logger(UserController.class);

    //get specific course
    @CrossOrigin
    @RequestMapping(value = "/course/{courseID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCourse(@PathVariable int courseID,@RequestHeader UUID userToken ) {

        if (tokenService.checkIfTokenExistsAndIsValid(userToken)){
            System.out.println("requested Course data: " + courseService.getCourse(courseID));
            return ResponseEntity.status(HttpStatus.OK).body(courseService.getCourse(courseID));
        }
        return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
    }
    //courses of a user
    @CrossOrigin
    @RequestMapping(value = "/course", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllUserCourse(@RequestHeader UUID token) {

        if (tokenService.checkIfTokenExistsAndIsValid(token)){
            //System.out.println(courseService.getAllUserCourses(tokenService.getUserID(token).getUserID()));
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getAllUserCourses(tokenService.getUserID(token).getUserID()));
        }
        return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
    }
    //see all courses that exist
    @CrossOrigin
    @RequestMapping(value = "/course/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllCourse(//@RequestHeader UUID userToken
                                           ) {

       // if (tokenService.checkIfTokenExistsAndIsValid(userToken)){

        return ResponseEntity.status(HttpStatus.OK).body(courseService.getAllCourses());//}
        //return new ResponseEntity<String>(HttpStatus.UNAUTHORIZED);
    }


  @CrossOrigin
    @RequestMapping(value = "/course/{courseID}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> joinCourse(@RequestHeader UUID token, @PathVariable int courseID) {

        courseService.addUser(tokenService.getUserID(token).getUserID(),courseID);

        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/course/{courseID}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> leaveCourse(@RequestHeader UUID token,@PathVariable int courseID) {

        courseService.deleteUser(tokenService.getUserID(token).getUserID(),courseID);
        // log.info("Created a new User: " + userService.getUser(userID).toString());
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
