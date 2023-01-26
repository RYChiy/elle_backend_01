package fra.uas.course.model;

import fra.uas.user.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public class Course {

    private int courseId;

    private ArrayList<String> vmList;

    private ArrayList<User> userList;
    ;
    private String courseName;
    private String professor;
    private String description;


    public Course(String courseName, String professor, String description) {
        super();
        this.courseName = courseName;
        this.professor = professor;
        this.description = description;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getVmList() {
        return vmList;
    }

    public void setVmList(ArrayList<String> vmList) {
        this.vmList = vmList;
    }


}
