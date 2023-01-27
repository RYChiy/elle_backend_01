package fra.uas.course.repository;

import fra.uas.course.model.Course;
import fra.uas.user.model.Role;
import fra.uas.user.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
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
        course1.setUserList(new ArrayList<Integer>());
        course1.getUserList().add(1);
        course1.getUserList().add(2);
        course1.getUserList().add(3);
        course1.getUserList().add(4);

        Course course2 = new Course();
        course2.setCourseId(2);
        course2.setCourseName("WPM by Prof. Dr. Jürgen Schmidhuber");
        course2.setDescription("""
                Studierende lernen das Requirements Engineering / Anforderungsmanagement anhand von Fallstudien kennen.
                Inhalte:
                 - Rolle des Requirements Engineering bei der Erstellung betrieblicher Anwendungssoftware
                   Teildisziplinen des Requirements Management und Schnittstellen zum Projektmanagement
                   Roadmaps zur Anforderungsermittlung Vorgehensmodelle Arten von Anforderungen
                   Tools und Techniken / Modelle zur Anforderungsermittlung""");
        course2.setProfessor("Prof. Dr. Jürgen Schmidhuber");
        course2.setUserList(new ArrayList<Integer>());
        course2.getUserList().add(1);
        course2.getUserList().add(2);
        course2.getUserList().add(3);
        course2.getUserList().add(4);

        Course course3 = new Course();
        course3.setCourseId(3);
        course3.setCourseName("WPM by Prof. Dr. Jürgen Schmidhuber");
        course3.setDescription("""
                Studierende lernen das Requirements Engineering / Anforderungsmanagement anhand von Fallstudien kennen.
                Inhalte:
                 - Rolle des Requirements Engineering bei der Erstellung betrieblicher Anwendungssoftware
                   Teildisziplinen des Requirements Management und Schnittstellen zum Projektmanagement
                   Roadmaps zur Anforderungsermittlung Vorgehensmodelle Arten von Anforderungen
                   Tools und Techniken / Modelle zur Anforderungsermittlung""");
        course3.setProfessor("Prof. Dr. Jürgen Schmidhuber");
        course3.setUserList(new ArrayList<Integer>());
        course3.getUserList().add(1);
        course3.getUserList().add(2);
        course3.getUserList().add(3);
        course3.getUserList().add(4);


        Course course4 = new Course();
        course4.setCourseId(4);
        course4.setCourseName("WPM by Prof. Dr. Jürgen Schmidhuber");
        course4.setDescription("""
                Studierende lernen das Requirements Engineering / Anforderungsmanagement anhand von Fallstudien kennen.
                Inhalte:
                 - Rolle des Requirements Engineering bei der Erstellung betrieblicher Anwendungssoftware
                   Teildisziplinen des Requirements Management und Schnittstellen zum Projektmanagement
                   Roadmaps zur Anforderungsermittlung Vorgehensmodelle Arten von Anforderungen
                   Tools und Techniken / Modelle zur Anforderungsermittlung""");
        course4.setProfessor("Prof. Dr. Jürgen Schmidhuber");
        course4.setUserList(new ArrayList<Integer>());
        course4.getUserList().add(1);
        course4.getUserList().add(2);
        course4.getUserList().add(3);
        course4.getUserList().add(4);


        Course course5 = new Course();
        course5.setCourseId(5);
        course5.setCourseName("WPM by Prof. Dr. Jürgen Schmidhuber");
        course5.setDescription("""
                Studierende lernen das Requirements Engineering / Anforderungsmanagement anhand von Fallstudien kennen.
                Inhalte:
                 - Rolle des Requirements Engineering bei der Erstellung betrieblicher Anwendungssoftware
                   Teildisziplinen des Requirements Management und Schnittstellen zum Projektmanagement
                   Roadmaps zur Anforderungsermittlung Vorgehensmodelle Arten von Anforderungen
                   Tools und Techniken / Modelle zur Anforderungsermittlung""");
        course5.setProfessor("Prof. Dr. Jürgen Schmidhuber");
        course5.setUserList(new ArrayList<Integer>());
        course5.getUserList().add(1);
        course5.getUserList().add(2);
        course5.getUserList().add(3);
        course5.getUserList().add(4);


        Course course6 = new Course();
        course6.setCourseId(6);
        course6.setCourseName("WPM by Prof. Dr. Jürgen Schmidhuber");
        course6.setDescription("""
                Studierende lernen das Requirements Engineering / Anforderungsmanagement anhand von Fallstudien kennen.
                Inhalte:
                 - Rolle des Requirements Engineering bei der Erstellung betrieblicher Anwendungssoftware
                   Teildisziplinen des Requirements Management und Schnittstellen zum Projektmanagement
                   Roadmaps zur Anforderungsermittlung Vorgehensmodelle Arten von Anforderungen
                   Tools und Techniken / Modelle zur Anforderungsermittlung""");
        course6.setProfessor("Prof. Dr. Jürgen Schmidhuber");
        course6.setUserList(new ArrayList<Integer>());

        course6.getUserList().add(1);
        course6.getUserList().add(2);
        course6.getUserList().add(3);
        course6.getUserList().add(4);

        courseList.add(course6);


    }

}
