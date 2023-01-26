package fra.uas.course.service;

import fra.uas.course.model.Course;
import fra.uas.user.model.User;

public interface ICourseService {

	public void createCourse(Course course);
	
	public Course getCourse(int courseID);
	
	public Course updateCourse(int courseId);
	
	public Course deleteCourse (int courseId);
	
	public Course addUser(int userId);
	
	public Course deleteUser(int userId);
	
	public Course assignVM(int userID);
	
	public Course demoteVM(int userId, int courseId);
	
	
	
	
	
	
}
