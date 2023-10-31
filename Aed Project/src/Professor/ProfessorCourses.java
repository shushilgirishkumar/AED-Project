/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import Courses.CourseDetails;
import java.util.ArrayList;

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
