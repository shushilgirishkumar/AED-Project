/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import Courses.CourseDetails;
import Student.Studentde;
import Courses.Suggestion;

/**
 *
 * @author devmi
 */
public class registercours {
    
    private String name;
    private String NEUID;
    private String stautofdegree;
    private String stautofjob;
    private String jobname;
    private String employername;

    public String getEmployername() {
        return employername;
    }

    public void setEmployername(String employername) {
        this.employername = employername;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getStautofjob() {
        return stautofjob;
    }

    public void setStautofjob(String stautofjob) {
        this.stautofjob = stautofjob;
    }
    public String getStautofdegree() {
        return stautofdegree;
    }

    public void setStautofdegree(String stautofdegree) {
        this.stautofdegree = stautofdegree;
    }
    private ArrayList<CourseDetails> coursehistory;

    public ArrayList<CourseDetails> getCoursehistory() {
        return coursehistory;
    }

    public void setCoursehistory(ArrayList<CourseDetails> coursehistory) {
        this.coursehistory = coursehistory;
    }

 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNEUID() {
        return NEUID;
    }

    public void setNEUID(String NEUID) {
        this.NEUID = NEUID;
    }

    public registercours() {
    }
    
    
   
    
    public registercours(String name, String NEUID, String stautofdegree, String stautofjob, String jobname,String companyname) //throws ParseException{
    {
        this.name = name;
        this.NEUID = NEUID;
        this.stautofdegree = stautofdegree;
        this.stautofjob = stautofjob; 
        this.jobname = jobname;
        this.employername = companyname;
        this.coursehistory = new ArrayList<>();
    }
    

    public void addCourse(CourseDetails course) {
        this.coursehistory.add(course);
    }
    
     
    public CourseDetails RegCinProfCoursebycode(String code){
        for(CourseDetails c : this.coursehistory){
            if(c.getCourse_code().equals(code)){
                return c;
            }
            
        }
        return null;
    }

 
    
}
