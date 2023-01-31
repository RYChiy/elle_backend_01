package fra.uas.course.model;

import java.util.ArrayList;


public class Course {

    private int courseId;

    private ArrayList<String> vmList;

    private ArrayList<Integer> userList;
    ;
    private String courseName;
    private String professor;
    private String description;

    private String studyingDescription;

    private String link;


    public Course(String courseName, String professor, String description,String shortDescription, String link) {
        super();
        this.courseName = courseName;
        this.professor = professor;
        this.description = description;
        this.studyingDescription = shortDescription;
    }

    public Course(){

    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public ArrayList<Integer> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<Integer> userList) {
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

    public String getStudyingDescription() {
        return studyingDescription;
    }

    public void setStudyingDescription(String description) {
        this.studyingDescription = description;
    }


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
