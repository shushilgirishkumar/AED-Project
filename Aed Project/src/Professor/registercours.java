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
    
    
   
    
    public registercours(String name, String NEUID, String stautofdegree) //throws ParseException{
    {
        this.name = name;
        this.NEUID = NEUID;
        this.stautofdegree = stautofdegree;
        this.coursehistory = new ArrayList<>();
        
        
    }
    

    public void addCourse(CourseDetails course) {
        this.coursehistory.add(course);
    }
    
     
    public registercours()
    {}

 @Override
   public String toString(){
       return NEUID;
    }
    
}
