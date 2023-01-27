package fra.uas.course.repository;

import fra.uas.course.model.Course;
import fra.uas.user.model.Role;
import fra.uas.user.model.User;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;

public class CourseRepository {


    public ArrayList<Course> courseList = new ArrayList<>();

    //Admin creation
    @PostConstruct
    public void init() {


        Course course1 = new Course();
        course1.setCourseId(1);
        course1.setCourseName("WPM by Prof. Dr. Jürgen Schmidhuber");
        course1.setDescription("""
                Studierende lernen das Requirements Engineering / Anforderungsmanagement anhand von Fallstudien kennen.
                Inhalte:
                 - Rolle des Requirements Engineering bei der Erstellung betrieblicher Anwendungssoftware
                   Teildisziplinen des Requirements Management und Schnittstellen zum Projektmanagement
                   Roadmaps zur Anforderungsermittlung Vorgehensmodelle Arten von Anforderungen
                   Tools und Techniken / Modelle zur Anforderungsermittlung""");
        course1.setProfessor("Prof. Dr. Jürgen Schmidhuber");
        course1.getUserList().add(1);

        courseList.add(course1);


    }

}
