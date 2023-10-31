/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import Courses.CourseDetails;
import java.util.ArrayList;

/**
 *
 * @author shush
 */
public class Student {
     private String name;
    private String age;
    private String Campus;
    private String Specalization;
    private String Term;
    private String NEUID;
    private String Password;
    private ArrayList<Courses.CourseDetails> regcourselist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

    public String getSpecalization() {
        return Specalization;
    }

    public void setSpecalization(String Specalization) {
        this.Specalization = Specalization;
    }

   
    public String getTerm() {
        return Term;
    }

    public void setTerm(String Term) {
        this.Term = Term;
    }
    
    public String getNEUID() {
        return NEUID;
    }

    public void setNEUID(String NEUID) {
        this.NEUID = NEUID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ArrayList<CourseDetails> getRegcourselist() {
        return regcourselist;
    }

    public void setRegcourselist(ArrayList<CourseDetails> regcourselist) {
        this.regcourselist = regcourselist;
    }

    public Student(String name, String age, String Campus, String Specalization, String Term, String NEUID, String Password) {
        this.name = name;
        this.age = age;
        this.Campus = Campus;
        this.Specalization = Specalization;
        this.Term = Term;
        this.NEUID = NEUID;
        this.Password = Password;
        this.regcourselist = new ArrayList<>();
    }
//    public CourseDetails SearchCourses(String deptname){
//        for(CourseDetails c : this.regcourselist){
//            if(deptname)
//        }
//    }
    
//    public void AddCourses(CourseDetails c){
//        AddC
//    }
     
}
