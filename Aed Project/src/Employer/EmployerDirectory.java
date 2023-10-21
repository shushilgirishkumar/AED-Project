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
public class EmployerDirectory {
    private ArrayList<EmployerProfile> employerlists;

    public EmployerDirectory() {
        employerlists = new ArrayList<>();
    }
    public EmployerProfile AddEmployer(){
       EmployerProfile emp = new EmployerProfile();
       employerlists.add(emp);
       return emp;
    }

    public ArrayList<EmployerProfile> getEmployerlists() {
        return employerlists;
    }

    public void setEmployerlists(ArrayList<EmployerProfile> employerlists) {
        this.employerlists = employerlists;
    }
     public EmployerProfile SearchEmployerbyEmp_ID(String Employer_ID){
        for(EmployerProfile e: employerlists){
            if(e.Employer_id.equals(Employer_ID)){
                return e;
            }
        }
        return null;
    }
    
    
}
