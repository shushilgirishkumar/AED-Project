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
    private String course_professor_name;
    private String course_description;
    private String course_department;
    private String course_prerequisite;
    private int course_seats;
    private int no_ofstudentsreg;
    private String Coursename;
    private String Course_Type;
    private String startDateTime;
    private String endDateTime;
//    private String Course_grade;
    private double Course_rating;
    private double Course_credit_fees;
    private String Course_status;
    private int Course_credit;
//    public String getCourse_grade() {
//        return Course_grade;
//    }
//
//    public void setCourse_grade(String Course_grade) {
//        this.Course_grade = Course_grade;
//    }

    public double getCourse_rating() {
        return Course_rating;
    }

    public String getCourse_department() {
        return course_department;
    }

    public void setCourse_department(String course_department) {
        this.course_department = course_department;
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

    public String getCourse_professor_name() {
        return course_professor_name;
    }

    public void setCourse_professor_name(String course_professor_name) {
        this.course_professor_name = course_professor_name;
    }

    public int getCourse_seats() {
        return course_seats;
    }

    public void setCourse_seats(int course_seats) {
        this.course_seats = course_seats;
    }

    public void setCourse_code(String Course_code) {
        this.Course_code = Course_code;
    }

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }

    public String getCourse_prerequisite() {
        return course_prerequisite;
    }

    public void setCourse_prerequisite(String course_prerequisite) {
        this.course_prerequisite = course_prerequisite;
    }

    public int getNo_ofstudentsreg() {
        return no_ofstudentsreg;
    }

    public void setNo_ofstudentsreg(int no_ofstudentsreg) {
        this.no_ofstudentsreg = no_ofstudentsreg;
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

    public String getCourse_status() {
        return Course_status;
    }

    public void setCourse_status(String Course_status) {
        this.Course_status = Course_status;
    }

    public CourseDetails(String CRN, String Course_code, String Term_offered, String professor_name, String Coursename, String coursedepartment, String startDateTime, String endDateTime,String course_type,String course_description,int studentsregistered,String coursestatus) {
        this.CRN = CRN;
        this.Course_code = Course_code;
        this.Term_offered = Term_offered;
        this.course_professor_name = professor_name;
        this.Coursename = Coursename;
        this.course_department = coursedepartment;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.Course_Type = course_type;
        this.course_description = course_description;
//        this.Course_grade = grade;
        this.Course_rating = Double.NaN;
        this.Course_credit_fees = 1700;
        this.Course_credit = 4;
        this.course_seats = 20;
        this.no_ofstudentsreg = studentsregistered;
        this.Course_status = coursestatus;
    }
    
    public CourseDetails(String CRN, String Course_code, String Term_offered, String professor_name, String Coursename, String coursedepartment, String startDateTime, String endDateTime,String course_type,String course_description,int studentsregistered,int seats,int credits) {
        this.CRN = CRN;
        this.Course_code = Course_code;
        this.Term_offered = Term_offered;
        this.course_professor_name = professor_name;
        this.Coursename = Coursename;
        this.course_department = coursedepartment;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.Course_Type = course_type;
        this.course_description = course_description;
//        this.Course_grade = grade;
        this.Course_rating = Double.NaN;
        this.Course_credit_fees = 1700;
        this.Course_credit = credits;
        this.course_seats = seats;
        this.no_ofstudentsreg = studentsregistered;
    }
    
}
