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
public class ProfessorDirectory {
    private ArrayList<ProfessorProfile> professorlists;

    public ProfessorDirectory() {
        professorlists = new ArrayList<>();
    }

    public ArrayList<ProfessorProfile> getProfessorlists() {
        return professorlists;
    }

    public void setProfessorlists(ArrayList<ProfessorProfile> professorlists) {
        this.professorlists = professorlists;
    }
    public ProfessorProfile AddProfessor(String firstname,String lastname,String mail,String prof_id,String prof_speciality,int prof_exp){
        ProfessorProfile pr = new ProfessorProfile();
        pr.setProf_experience(prof_exp);
        pr.setProf_first_name(firstname);
        pr.setProf_last_name(lastname);
        pr.setProf_id(prof_id);
        pr.setProf_mail(prof_id);
        pr.setProf_speciality(prof_speciality);
        professorlists.add(pr);
        return pr;
    }
    public ProfessorProfile SearchProfessor(String Professor_ID){
        for(ProfessorProfile p: professorlists){
            if(p.Prof_id.equals(Professor_ID)){
                return p;
            }
        }
        return null;
    }
    
}
