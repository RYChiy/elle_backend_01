package fra.uas.course.service;

import fra.uas.course.model.Course;
import fra.uas.course.repository.CourseRepository;

public class CourseService implements ICourseService {

	CourseRepository courseRepository;


	@Override
	public void createCourse(Course course) {

	}

	@Override
	public Course getCourse(int courseID) {
		return null;
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
	public Course addUser(int userId) {
		return null;
	}

	@Override
	public Course deleteUser(int userId) {
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
