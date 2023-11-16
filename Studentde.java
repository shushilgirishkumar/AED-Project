/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import Courses.CourseDetails;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * @author shush
 */
public class Studentde {
     private String name;
    private int age;
    private String Campus;
    private String Specalization;
    private String email_Id;
    private int phoneno;
    private String Term;
    private String Acceptedyear;
    private String Gradyear;
    private String NEUID;
    private String Password;
    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Studentde() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getEmail_Id() {
        return email_Id;
    }

    public void setEmail_Id(String email_Id) {
        this.email_Id = email_Id;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
    
    
     
    
     public Studentde(String name, int age, String Campus, String Specalization, String email_Id, int phoneno,String Term, String Acceptedyear, String Gradyear, String NEUID, String Password,String picture){
        this.name = name;
        this.age = age;
        this.Campus = Campus;
        this.Acceptedyear = Acceptedyear;
        this.Term = Term;
        this.phoneno = phoneno;
        this.Specalization = Specalization;
        this.NEUID = NEUID;
        this.Password = (Password);
        this.email_Id = email_Id;
        this.Gradyear= Gradyear;
        this.picture = picture;
    }
    
     
    
}
