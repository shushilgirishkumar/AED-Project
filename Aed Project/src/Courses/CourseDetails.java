/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    private String Core_requisite;
    private String pre_requisite;
    private String Coursename;
    private String Course_Type;
    private Date startDateTime;
    private Date endDateTime;

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

    public String getProfessor_name() {
        return professor_name;
    }

    public void setProfessor_name(String professor_name) {
        this.professor_name = professor_name;
    }

    public String getCore_requisite() {
        return Core_requisite;
    }

    public void setCore_requisite(String Core_requisite) {
        this.Core_requisite = Core_requisite;
    }

    public String getPre_requisite() {
        return pre_requisite;
    }

    public void setPre_requisite(String pre_requisite) {
        this.pre_requisite = pre_requisite;
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

  
    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getCourse_Type() {
        return Course_Type;
    }

    public void setCourse_Type(String Course_Type) {
        this.Course_Type = Course_Type;
    }

    public CourseDetails(String Coursename, String pre_requisite, String Core_requisite, String Course_code, String CRN, String professor_name, String Term_offered, String startDateTimeString, String endDateTimeString ,String type) throws ParseException{
        this.Coursename = Coursename;
        this.pre_requisite = pre_requisite;
        this.Core_requisite = Core_requisite;
        this.Course_code = Course_code;
        this.CRN = CRN;
        this.Course_Type = type;
        this.professor_name = professor_name;
        this.Term_offered = Term_offered;
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        this.startDateTime = dateTimeFormat.parse(startDateTimeString);
        this.endDateTime = dateTimeFormat.parse(endDateTimeString);
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
 
}
