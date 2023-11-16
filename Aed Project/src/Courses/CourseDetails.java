/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author shush
 */
public class CourseDetails {
    private String CRN;
    private String Course_code;
    private String Term_offered;
    private String professor_name;
    private String Coursename;
    private String Course_Type;
    private String startDateTime;
    private String endDateTime;
    private String Course_grade;
    private double Course_rating;
    private double Course_credit_fees;
    private int Course_credit;
    private ArrayList<String> Course_Seats;
    public String getCourse_grade() {
        return Course_grade;
    }

    public void setCourse_grade(String Course_grade) {
        this.Course_grade = Course_grade;
    }

    public double getCourse_rating() {
        return Course_rating;
    }

    public void setCourse_rating(double Course_rating) {
        this.Course_rating = Course_rating;
    }

    public int getCourse_credit() {
        return Course_credit;
    }

    public void setCourse_credit(int Course_credit) {
        this.Course_credit = Course_credit;
    }

    public String getCRN() {
        return CRN;
    }

    public void setCRN(String CRN) {
        this.CRN = CRN;
    }
    public String getTerm_offered() {
        return Term_offered;
    }

    public void setTerm_offered(String Term_offered) {
        this.Term_offered = Term_offered;
    }
    public String getCourse_code() {
        return Course_code;
    }

    public void setCourse_code(String Course_code) {
        this.Course_code = Course_code;
    }

    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String Coursename) {
        this.Coursename = Coursename;
    }

  
    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getCourse_Type() {
        return Course_Type;
    }

    public void setCourse_Type(String Course_Type) {
        this.Course_Type = Course_Type;
    }

  public String getCourseDuration(Date startdate,Date enddate){
        try{
             
            long diff = enddate.getTime() - startdate.getTime();
            long weeks = diff / (7 * 24 * 60 * 60 * 1000);
             return String.valueOf(weeks);
        }
         catch (Exception e) {
            return "Invalid date format or calculation error.";
        }
    }

    public CourseDetails(String CRN, String Course_code, String Term_offered, String professor_name, String Coursename, String Course_Type, String startDateTime, String endDateTime, int Course_credit) {
        this.CRN = CRN;
        this.Course_code = Course_code;
        this.Term_offered = Term_offered;
        this.professor_name = professor_name;
        this.Coursename = Coursename;
        this.Course_Type = Course_Type;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
//        this.Course_grade = Course_grade;
//        this.Course_rating = Course_rating;
        this.Course_credit_fees = 1700;
        this.Course_credit = Course_credit;
    }
    
}
