/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employer;

import java.util.ArrayList;

/**
 *
 * @author shush
 */
public class EmployerProfile {
    String Employer_id;
    String Employer_name;
    String Employer_HiringManager_name;
    private ArrayList<String>Employer_AvailabilityRole;
//    String Employer_feedback;    
    private String Employer_password;
    private String Employer_picture;
    private ArrayList<String> Employer_oldPassword;

 
    public String getEmployer_id() {
        return Employer_id;
    }

    public void setEmployer_id(String Employer_id) {
        this.Employer_id = Employer_id;
    }

    public String getEmployer_name() {
        return Employer_name;
    }

    public void setEmployer_name(String Employer_name) {
        this.Employer_name = Employer_name;
    }

    public String getEmployer_HiringManager_name() {
        return Employer_HiringManager_name;
    }

    public void setEmployer_HiringManager_name(String Employer_HiringManager_name) {
        this.Employer_HiringManager_name = Employer_HiringManager_name;
    }

    public ArrayList<String> getEmployer_AvailabilityRole() {
        return Employer_AvailabilityRole;
    }

    public void setEmployer_AvailabilityRole(ArrayList<String> Employer_AvailabilityRole) {
        this.Employer_AvailabilityRole = Employer_AvailabilityRole;
    }

   public String getEmployer_password() {
        return Employer_password;
    }

    public void setEmployer_password(String Employer_password) {
        this.Employer_password = Employer_password;
    }

    public String getEmployer_picture() {
        return Employer_picture;
    }

    public void setEmployer_picture(String Employer_picture) {
        this.Employer_picture = Employer_picture;
    }

    public ArrayList<String> getEmployer_oldPassword() {
        return Employer_oldPassword;
    }

    public void setEmployer_oldPassword(ArrayList<String> Employer_oldPassword) {
        this.Employer_oldPassword = Employer_oldPassword;
    }


    public EmployerProfile(String Employer_id, String Employer_name, String Employer_HiringManager_name,String Employer_password) {
        this.Employer_id = Employer_id;
        this.Employer_name = Employer_name;
        this.Employer_HiringManager_name = Employer_HiringManager_name;
        this.Employer_password = Employer_password;
        this.Employer_oldPassword =new ArrayList<>();
        this.Employer_oldPassword.add(Employer_password);
    }
    
}
