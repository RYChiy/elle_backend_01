package fra.uas.course.service;

import fra.uas.course.model.Course;
import fra.uas.course.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService implements ICourseService {

    CourseRepository courseRepository;


    @Override
    public void createCourse(Course course) {

    }


    @Override
    public Course getCourse(int courseID) {
        for (Course course : courseRepository.courseList
        ) {
            if (course.getCourseId() == courseID) {
                return course;
            }

        }
        return null;
    }

    @Override
    public List<Course> getAllCourses(int userID) {
        List<Course> userCourseList = new ArrayList<>();
        for (Course course : courseRepository.courseList
        ) {

            if (course.getUserList().contains(1)) {
                userCourseList.add(course);
            }
        }
        return userCourseList;
    }

    @Override
    public Course updateCourse(int courseId) {
        return null;
    }

    @Override
    public Course deleteCourse(int courseId) {
        return null;
    }

    @Override
    public Course addUser(int userId, int courseID) {

        for (Course course : courseRepository.courseList
        ) {
            if (course.getCourseId() == courseID) {
                course.getUserList().add(userId);
                return course;
            }

        }
        return null;
    }

    @Override
    public Course deleteUser(int userId, int courseID) {
        for (Course course : courseRepository.courseList
        ) {
            if (course.getUserList().contains(userId) && course.getCourseId() == courseID) {
                course.getUserList().remove(userId);
                return course;
            }


        }

        return null;


    }

    @Override
    public Course assignVM(int userID) {
        return null;
    }

    @Override
    public Course demoteVM(int userId, int courseId) {
        return null;
    }
}
