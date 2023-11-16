/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author shush
 */
public class Student {
     private String name;
    private String age;
    private String Campus;
    private String Specalization;
    private String Semester;
    private String Term;
    private String Acceptedyear;
    private String Gradyear;
    private String NEUID;
    private String Password;

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

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getTerm() {
        return Term;
    }

    public void setTerm(String Term) {
        this.Term = Term;
    }

    public String getAcceptedyear() {
        return Acceptedyear;
    }

    public void setAcceptedyear(String Acceptedyear) {
        this.Acceptedyear = Acceptedyear;
    }

    public String getGradyear() {
        return Gradyear;
    }

    public void setGradyear(String Gradyear) {
        this.Gradyear = Gradyear;
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
    
     public Student(String name, String age, String Campus, String Specalization, String Semester, String Term, String Acceptedyear, String Gradyear, String NEUID, String Password){
        this.name = name;
        this.age = age;
        this.Campus = Campus;
        this.Acceptedyear = Acceptedyear;
        this.Term = Term;
        this.Semester = Semester;
        this.Specalization = Specalization;
        this.NEUID = NEUID;
        this.Password = Password;
    }
}
