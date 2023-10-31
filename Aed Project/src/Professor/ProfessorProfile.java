/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import java.util.ArrayList;



/**
 *
 * @author shush
 */
public class ProfessorProfile {
    String Prof_first_name;
    String Prof_last_name;
    String Prof_neumail;
    String Prof_neuid;
    String Prof_speciality;
    private int Prof_experience; // in years;
    private String Prof_resident; // country
    private long Prof_monthlyincome;
    private String Prof_password;
    private String Prof_picture;
    private ArrayList<String> prof_oldPassword;

    public String getProf_picture() {
        return Prof_picture;
    }

    public void setProf_picture(String Prof_picture) {
        this.Prof_picture = Prof_picture;
    }

    public String getProf_password() {
        return Prof_password;
    }

    public void setProf_password(String Prof_password) {
        this.Prof_password = Prof_password;
    }

    public String getProf_resident() {
        return Prof_resident;
    }

    public void setProf_resident(String Prof_resident) {
        this.Prof_resident = Prof_resident;
    }

    public String getProf_first_name() {
        return Prof_first_name;
    }

    public void setProf_first_name(String Prof_first_name) {
        this.Prof_first_name = Prof_first_name;
    }

    public String getProf_last_name() {
        return Prof_last_name;
    }

    public void setProf_last_name(String Prof_last_name) {
        this.Prof_last_name = Prof_last_name;
    }

    public String getProf_mail() {
        return Prof_neumail;
    }

    public void setProf_mail(String Prof_mail) {
        this.Prof_neumail = Prof_mail;
    }

    public String getProf_id() {
        return Prof_neuid;
    }

    public void setProf_id(String Prof_id) {
        this.Prof_neuid = Prof_id;
    }

    public String getProf_speciality() {
        return Prof_speciality;
    }

    public void setProf_speciality(String Prof_speciality) {
        this.Prof_speciality = Prof_speciality;
    }

    public int getProf_experience() {
        return Prof_experience;
    }

    public void setProf_experience(int Prof_experience) {
        this.Prof_experience = Prof_experience;
    }
    public ArrayList<String> getProf_oldPassword() {
        return prof_oldPassword;
    }

    public void setProf_oldPassword(ArrayList<String> prof_oldPassword) {
        this.prof_oldPassword = prof_oldPassword;
    }

    public ProfessorProfile(String Prof_first_name, String Prof_last_name, String Prof_mail, String Prof_id, String Prof_speciality, int Prof_experience, String Prof_resident, String Prof_password,String picturepath) {
        this.Prof_first_name = Prof_first_name;
        this.Prof_last_name = Prof_last_name;
        this.Prof_neumail = Prof_mail;
        this.Prof_neuid = Prof_id;
        this.Prof_speciality = Prof_speciality;
        this.Prof_experience = Prof_experience;
        this.Prof_resident = Prof_resident;
        this.Prof_password = Prof_password;
        this.Prof_picture = picturepath;
        prof_oldPassword = new ArrayList();
        prof_oldPassword.add(Prof_password);
    }
     
}
