/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import Courses.CourseDetails;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author shush
 */
public class ProfessorCourses {
    private String prof_name;
    private String prof_id;
    private ArrayList<Courses.CourseDetails> courselists;

    public String getProf_name() {
        return prof_name;
    }

    public void setProf_name(String prof_name) {
        this.prof_name = prof_name;
    }

    public String getProf_id() {
        return prof_id;
    }

    public void setProf_id(String prof_id) {
        this.prof_id = prof_id;
    }

    public ProfessorCourses(String prof_firstname, String prof_lastname,String profid) {
        this.prof_name = prof_firstname + " " + prof_lastname;
        this.prof_id = profid;
        courselists = new ArrayList<>();
//        professor_lists = new ArrayList<>();
//        ProfessorProfile p1 = new ProfessorProfile("John", "Smith", " john.smith@northeastern.edu", "12345", "Computer Science",15, "United States", "professor123");
//        ProfessorProfile p2 = new ProfessorProfile("Emily", "Johnson", " emily.johnson@northeastern.edu", "67890", "Chemistry",12 , "Canada", "chemprof567");
//        ProfessorProfile p3 = new ProfessorProfile("David", "Wilson", " david.wilson@northeastern.edu", "13579", "History",20 , "United Kingdom", "historyprof246");
//        Courses.CourseDetails c1 = new Courses.CourseDetails("CRN01", "CS01", "FALL","John Smith", "Computer Science Introduction", "Computer Science", "2023-01-15 09:00", "2023-04-30 11:30",3);
//        Courses.CourseDetails c2 = new Courses.CourseDetails("CRN02", "CS02", "FALL","John Smith", "Data Structures and Algorithms", "Datas", "2023-01-20 08:30", "2023-04-25 10:00",3);
//        Courses.CourseDetails c3 = new Courses.CourseDetails("CRN03", "CS03", "SPRING","John Smith", "Advanced Machine Learning", "Machine Learning", "2023-02-05 10:30", "2023-05-20 01:00",3);
//        Courses.CourseDetails c4 = new Courses.CourseDetails("CRN04", "CS04", "SUMMER","John Smith", "Environmental Science", "Environmental Science", "2023-03-10 02:00", "2023-06-25 04:30",3);
//        Courses.CourseDetails c5 = new Courses.CourseDetails("CRN05", "CS05", "SPRING","John Smith", "Literary Analysis", "Literature", "2023-02-15 01:00", "2023-05-30 03:30",3);
//        
        
    }

    public ArrayList<CourseDetails> getCourselists() {
        return courselists;
    }

    public void setCourselists(ArrayList<CourseDetails> courselists) {
        this.courselists = courselists;
    }
    public void addCourse(CourseDetails course) {
        this.courselists.add(course);
    }
   

}
