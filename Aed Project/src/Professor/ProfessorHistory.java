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
        ProfessorProfile p1 = new ProfessorProfile("John", "Smith", " john.smith@northeastern.edu", "002817662", "Computer Science",15, "United States", "professor123","/UI_Images/Faculty1.jpeg.png");
        ProfessorProfile p2 = new ProfessorProfile("Emily", "Johnson", " emily.johnson@northeastern.edu", "002271578", "Biotechnology",12 , "Canada", "chemprof567","/UI_Images/Faculty2.jpeg.png");
        ProfessorProfile p3 = new ProfessorProfile("David", "Wilson", " david.wilson@northeastern.edu", "002816766", "Informatics",20 , "United Kingdom", "historyprof246","/UI_Images/Faculty3.jpeg.png");
        ProfessorProfile p4 = new ProfessorProfile("Shyam", "Bhaskar", " shyam.bhaskar@northeastern.edu", "002816767", "Project Management",20 , "United Kingdom", "shyam123","/UI_Images/Faculty4.jpeg.png");
        ProfessorProfile p5 = new ProfessorProfile("Deepak", "Bob", " deepak.bob@northeastern.edu", "002816764", "Project Management",20 , "Australia", "deepak123","/UI_Images/Faculty5.jpeg.png");
        history_professor.add(p1);
        history_professor.add(p2);
        history_professor.add(p3);
        history_professor.add(p4);
        history_professor.add(p5);
    }

    private void sample_professorandcourses() {
        this.coursehistory = new ArrayList<>();
        Courses.CourseDetails c1 = new Courses.CourseDetails("CRN01", "CS01", "FALL","John Smith", "Computer Science Introduction", "Computer Science", "2023-01-15 09:00", "2023-04-30 11:30","OFFLINE"," ",0,"REGISTERED");
        Courses.CourseDetails c2 = new Courses.CourseDetails("CRN02", "CS02", "FALL","John Smith", "Data Structures and Algorithms", "Computer Science", "2023-01-20 08:30", "2023-04-25 10:00","ONLINE"," ",0,"REGISTERED");
        Courses.CourseDetails c3 = new Courses.CourseDetails("CRN03", "CS03", "SPRING","John Smith", "Advanced Machine Learning", "Computer Science", "2023-02-05 10:30", "2023-05-20 01:00","OFFLINE"," ",0,"REGISTERED");
        Courses.CourseDetails c4 = new Courses.CourseDetails("CRN04", "CS04", "SUMMER","John Smith", "Theory and Practical Applications of AI Generative Modeling", "Computer Science", "2023-03-10 02:00", "2023-06-25 04:30","OFFLINE"," ",0,"REGISTERED");
        Courses.CourseDetails c5 = new Courses.CourseDetails("CRN05", "LA05", "SPRING","John Smith", "Advanced Game Analytics.", "Computer Science", "2023-02-15 01:00", "2023-05-30 03:30","ONLINE", " ",0,"UNREGISTERED");
        Courses.CourseDetails c6 = new Courses.CourseDetails("CRN06", "CH06", "SUMMER","Emily Johnson", "Molecular Cell Biology for Biotechnology", "Biotechnology", "2023-02-15 01:00", "2023-05-30 03:30","OFFLINE"," ",0,"UNREGISTERED");
        Courses.CourseDetails c7 = new Courses.CourseDetails("CRN07", "CH07", "FALL","Emily Johnson", "Foundations in Biotechnology", "Biotechnology", "2023-02-15 01:00", "2023-05-30 03:30","ONLINE", " ",0,"UNREGISTERED");
        Courses.CourseDetails c8 = new Courses.CourseDetails("CRN08", "CH08", "SPRING","Emily Johnson", "The Biotechnology Enterprise", "Biotechnology", "2023-02-15 01:00", "2023-05-30 03:30","OFFLINE", " ",0,"UNREGISTERED");
        Courses.CourseDetails c9 = new Courses.CourseDetails("CRN09", "PM01", "FALL","Shyam Bhaskar", "Foundations of Project Management", "Project Management", "2023-02-16 01:00", "2023-05-30 03:30","ONLINE"," ",0,"REGISTERED");
        Courses.CourseDetails c10 = new Courses.CourseDetails("CRN10", "PM02", "SUMMER","Shyam Bhaskar", "Project Evaluation and Assessment", "Project Management", "2023-02-15 01:00", "2023-05-30 03:30","OFFLINE"," ",0,"REGISTERED");
        Courses.CourseDetails c11 = new Courses.CourseDetails("CRN11", "PM02", "SPRING","Shyam Bhaskar", "Managing Troubled Projects", "Project Management", "2023-02-17 01:00", "2023-05-30 03:30","ONLINE", " ",0,"REGISTERED");
        Courses.CourseDetails c12 = new Courses.CourseDetails("CRN12", "INFO01", "SPRING","David Wilson", "Probability Theory and Introductory Statistics", "Informatics", "2023-02-17 01:00", "2023-05-30 03:30","ONLINE", " ",0,"UNREGISTERED");
        Courses.CourseDetails c13 = new Courses.CourseDetails("CRN13", "INFO02", "FALL","David Wilson", "Communication and Visualization for Data Analytics", "Informatics", "2023-02-17 01:00", "2023-05-30 03:30","ONLINE", " ",0,"UNREGISTERED");
        Courses.CourseDetails c14 = new Courses.CourseDetails("CRN14", "INFO03", "SUMMER","Deepak Bob", "Leading and Managing Technical Projects", "Project Management", "2023-02-17 01:00", "2023-05-30 03:30","ONLINE", " ",0,"REGISTERED");
        Courses.CourseDetails c15 = new Courses.CourseDetails("CRN15", "INFO03", "SUMMER","David Wilson", "Communication Skills for Project Managers", "Project Management", "2023-02-17 01:00", "2023-05-30 03:30","ONLINE", " ",0,"REGISTERED");
        Courses.CourseDetails c16 = new Courses.CourseDetails("CRN16", "INFO03", "SUMMER","David Wilson", "Leading Remote Project Teams", "Project Management", "2023-02-17 01:00", "2023-05-30 03:30","ONLINE", " ",0,"REGISTERED");
        coursehistory.add(c1);
        coursehistory.add(c2);
        coursehistory.add(c3);
        coursehistory.add(c4);
        coursehistory.add(c5);
        coursehistory.add(c6);
        coursehistory.add(c7);
        coursehistory.add(c8);
        coursehistory.add(c9);
        coursehistory.add(c10);
        coursehistory.add(c11);
        coursehistory.add(c12);
        coursehistory.add(c13);
        coursehistory.add(c14);
        coursehistory.add(c15);
        coursehistory.add(c16);
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
        ProfessorCourses pc4 = new ProfessorCourses("Shyam", "Bhaskar", "002816767");
        ProfessorCourses pc3 = new ProfessorCourses("David", "Wilson", "002816766");
        pc3.addCourse(c12);
        pc3.addCourse(c13);
        pc4.addCourse(c9);
        pc4.addCourse(c10);
        pc4.addCourse(c11);
        ProfessorCourses pc5 = new ProfessorCourses("Deepak", "Bob", "002816764");
         pc5.addCourse(c14);
         pc5.addCourse(c15);
         pc5.addCourse(c16);
        professor_courselist.add(pc1);
        professor_courselist.add(pc2);
        professor_courselist.add(pc3);
        professor_courselist.add(pc4);
        professor_courselist.add(pc5);
    }
     public ProfessorProfile SearchProfessorbyneuid(String neuid){
        for(ProfessorProfile p: history_professor){
            if(neuid.equals(p.getProf_id())){
                return p;
            }
            }
        return null;
    }
    
     public ProfessorCourses SearchProfessorCoursesbyneuid(String neuid){
         for(ProfessorCourses p: professor_courselist){
            if(neuid.equals(p.getProf_id())){
                return p;
            }
            }
        return null;
     }
      public void AddProfessor(ProfessorProfile e ){
        history_professor.add(e);
    }
    public void AddProfessor1(ProfessorCourses e ){
        professor_courselist.add(e);
    }
}
