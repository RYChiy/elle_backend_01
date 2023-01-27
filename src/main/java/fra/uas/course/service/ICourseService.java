package fra.uas.course.service;

import fra.uas.course.model.Course;
import fra.uas.user.model.User;

import java.util.List;

public interface ICourseService {

	public void createCourse(Course course);
	
	public Course getCourse(int courseID);

	public List<Course> getAllCourses(int userID);

	
	public Course updateCourse(int courseId);
	
	public Course deleteCourse (int courseId);
	
	public Course addUser(int userId, int CourseID);
	
	public Course deleteUser(int userId, int CourseID);
	
	public Course assignVM(int userID);
	
	public Course demoteVM(int userId, int courseId);
	
	
	
	
	
	
}
