/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author shush
 */
public class CourseCatalog {
    private ArrayList<CourseDetails> courselists;

    public ArrayList<CourseDetails> getCourselists() {
        return courselists;
    }

    public void setCourselists(ArrayList<CourseDetails> courselists) {
        this.courselists = courselists;
    }

    public CourseCatalog() {
        courselists = new ArrayList<>();
    }
    public CourseDetails AddCourse(String Coursename, String pre_requisite, String Core_requisite, String Course_code, String CRN, String professor_name, String Term_offered, Date startDateTimeString, Date endDateTimeString, String type){
        try{
             CourseDetails cd = new CourseDetails(Coursename, pre_requisite, Core_requisite, Course_code, CRN, professor_name, Term_offered, Term_offered, Core_requisite, type);
            courselists.add(cd);
            return cd;
        }
       catch(Exception e){
           e.printStackTrace();
       }
        return null;
    }
    
    
    
 }
