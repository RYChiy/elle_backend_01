package fra.uas.course.controller;

import fra.uas.course.service.CourseService;
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
    UserService userService;

    @Autowired
    CourseService courseService;
    //Logger log = new Logger(UserController.class);


    @CrossOrigin
    @RequestMapping(value = "/course/{courseID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getCourse(@PathVariable int courseID) {

        System.out.println("requested Course data: " + courseService.getCourse(courseID));
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getCourse(courseID));
    }

    @CrossOrigin
    @RequestMapping(value = "/course", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllUserCourse(@RequestHeader UUID userToken) {

        System.out.println("requested Course data: " + courseService.getAllUserCourses(userService.getUserWithToken(userToken).getUserId()));
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getAllUserCourses(userService.getUserWithToken(userToken).getUserId()));
    }

    @CrossOrigin
    @RequestMapping(value = "/course/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllCourse(@RequestHeader UUID userToken) {

        System.out.println("requested Course data: " + courseService.getAllUserCourses(userService.getUserWithToken(userToken).getUserId()));
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getAllUserCourses(userService.getUserWithToken(userToken).getUserId()));
    }


    @CrossOrigin
    @RequestMapping(value = "/course/{courseID}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> joinCourse(@RequestHeader UUID userToken, @PathVariable int courseID) {

        courseService.addUser(userService.getUserWithToken(userToken).getUserId(), courseID);

        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/course/{courseID}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> leaveCourse(@RequestHeader UUID userToken,@PathVariable int courseID) {

        courseService.deleteUser(userService.getUserWithToken(userToken).getUserId(),courseID);
        // log.info("Created a new User: " + userService.getUser(userID).toString());
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
