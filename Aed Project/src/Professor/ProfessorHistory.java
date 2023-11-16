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
public class ProfessorHistory {
   private ArrayList<ProfessorCourses> professor_courselist;
   private ArrayList<ProfessorProfile> history_professor;
   private ArrayList<CourseDetails> coursehistory;

    public ArrayList<ProfessorCourses> getProfessor_courselist() {
        return professor_courselist;
    }

    public void setProfessor_courselist(ArrayList<ProfessorCourses> professor_courselist) {
        this.professor_courselist = professor_courselist;
    }

    public ArrayList<ProfessorProfile> getHistory_professor() {
        return history_professor;
    }

    public void setHistory_professor(ArrayList<ProfessorProfile> history_professor) {
        this.history_professor = history_professor;
    }

    public ArrayList<CourseDetails> getCoursehistory() {
        return coursehistory;
    }

    public void setCoursehistory(ArrayList<CourseDetails> coursehistory) {
        this.coursehistory = coursehistory;
    }

    public ProfessorHistory() {
        sample_professors();
        sample_professorandcourses();
        
    }
    
//    public CourseDetails addNewCourse(){
//        CourseDetails newcourse = new CourseDetails();
//        coursehistory.add(newcourse);
//        return newcourse;
//    }

    private void sample_professors() {
        this.history_professor = new ArrayList<>();
        ProfessorProfile p1 = new ProfessorProfile("John", "Smith", " john.smith@northeastern.edu", "002817662", "Computer Science",15, "United States", "professor123");
        ProfessorProfile p2 = new ProfessorProfile("Emily", "Johnson", " emily.johnson@northeastern.edu", "002271578", "Chemistry",12 , "Canada", "chemprof567");
        ProfessorProfile p3 = new ProfessorProfile("David", "Wilson", " david.wilson@northeastern.edu", "002816766", "History",20 , "United Kingdom", "historyprof246");
        history_professor.add(p1);
        history_professor.add(p2);
        history_professor.add(p3);
    }

    private void sample_professorandcourses() {
        this.coursehistory = new ArrayList<>();
        Courses.CourseDetails c1 = new Courses.CourseDetails("CRN01", "CS01", "FALL","John Smith", "Computer Science Introduction", "Computer Science", "2023-01-15 09:00", "2023-04-30 11:30",3);
        Courses.CourseDetails c2 = new Courses.CourseDetails("CRN02", "CS02", "FALL","John Smith", "Data Structures and Algorithms", "Datas", "2023-01-20 08:30", "2023-04-25 10:00",3);
        Courses.CourseDetails c3 = new Courses.CourseDetails("CRN03", "CS03", "SPRING","John Smith", "Advanced Machine Learning", "Machine Learning", "2023-02-05 10:30", "2023-05-20 01:00",3);
        Courses.CourseDetails c4 = new Courses.CourseDetails("CRN04", "CS04", "SUMMER","John Smith", "Environmental Science", "Environmental Science", "2023-03-10 02:00", "2023-06-25 04:30",3);
        Courses.CourseDetails c5 = new Courses.CourseDetails("CRN05", "CS05", "SPRING","John Smith", "Literary Analysis", "Literature", "2023-02-15 01:00", "2023-05-30 03:30",3);
        Courses.CourseDetails c6 = new Courses.CourseDetails("CRN06", "CS06", "SUMMER","Emily Johnson", "Organic Chemistry", "Chemistry", "2023-02-15 01:00", "2023-05-30 03:30",3);
        Courses.CourseDetails c7 = new Courses.CourseDetails("CRN07", "CS07", "FALL","Emily Johnson", "Chemical Thermodynamics", "Chemical Engineering", "2023-02-15 01:00", "2023-05-30 03:30",3);
        Courses.CourseDetails c8 = new Courses.CourseDetails("CRN08", "CS08", "SPRING","Emily Johnson", "Quantum Physics", "Physics", "2023-02-15 01:00", "2023-05-30 03:30",3);
        coursehistory.add(c1);
        coursehistory.add(c2);
        coursehistory.add(c3);
        coursehistory.add(c4);
        coursehistory.add(c5);
        coursehistory.add(c6);
        coursehistory.add(c7);
        coursehistory.add(c8);
        this.professor_courselist = new ArrayList<>();
        ProfessorCourses pc1 = new ProfessorCourses("John", "Smith","002817662");
        pc1.addCourse(c1);
        pc1.addCourse(c2);
        pc1.addCourse(c3);
        pc1.addCourse(c4);
        pc1.addCourse(c5);
        ProfessorCourses pc2 = new ProfessorCourses("Emily", "Johnson", "002271578");
        pc2.addCourse(c6);
        pc2.addCourse(c7);
        pc2.addCourse(c8);
        professor_courselist.add(pc1);
        professor_courselist.add(pc2);
    }

}
