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
public class EmployerHistory {
    private ArrayList<EmployerJobRoles> employerhistory;
    private ArrayList<EmployerProfile> emplists;
    private ArrayList<EmployerProfile> newemplists;
    private ArrayList<JobRoles> jobrolelists;

    public ArrayList<EmployerProfile> getNewemplists() {
        return newemplists;
    }

    public void setNewemplists(ArrayList<EmployerProfile> newemplists) {
        this.newemplists = newemplists;
    }
    

    public ArrayList<JobRoles> getJobrolelists() {
        return jobrolelists;
    }

    public void setJobrolelists(ArrayList<JobRoles> jobrolelists) {
        this.jobrolelists = jobrolelists;
    }
    
    

    public ArrayList<EmployerJobRoles> getEmployerhistory() {
        return employerhistory;
    }

    public void setEmployerhistory(ArrayList<EmployerJobRoles> employerhistory) {
        this.employerhistory = employerhistory;
    }

    public ArrayList<EmployerProfile> getEmplists() {
        return emplists;
    }

    public void setEmplists(ArrayList<EmployerProfile> emplists) {
        this.emplists = emplists;
    }

    public EmployerHistory() {
        this.employerhistory = new ArrayList<>();
        this.emplists = new ArrayList<>();
        this.jobrolelists = new ArrayList<>();
        EmployerProfile emp1 = new EmployerProfile("empid1", "Google", "Charles Mangnus", "charles123","/UI_Images/google.png");
        EmployerProfile emp2 = new EmployerProfile("empid2", "Amazon", "Sujitha Watson", "sujitha123","/UI_Images/amazon.png");
        EmployerProfile emp3 = new EmployerProfile("empid3", "Walmart", "James Cameeron", "james123","/UI_Images/walmart.png");
        EmployerProfile emp4 = new EmployerProfile("empid4", "RedHat", "Thamskun zhoglagi", "thamskun123","/UI_Images/redhat.png");
        emplists.add(emp1);
        emplists.add(emp2);
        emplists.add(emp3);
        emplists.add(emp4); 
         EmployerJobRoles empj1 = new EmployerJobRoles("empid1", "Google");
        EmployerJobRoles empj2 = new EmployerJobRoles("empid2", "Amazon");
        EmployerJobRoles empj3 = new EmployerJobRoles("empid3", "Walmart");
        EmployerJobRoles empj4 = new EmployerJobRoles("empid4", "RedHat");
        JobRoles j1 = empj1.AddRoles("r1", "Software Engineer", "Google", 3,80000.0);
        JobRoles j2 = empj1.AddRoles("r2", "Product Manager", "Google", 2,100000.0);
        JobRoles j3 = empj2.AddRoles("r3", "Data Analyst", "Amazon", 1, 75000.0);
        JobRoles j4 = empj3.AddRoles("r4", "Marketing Manager", "Walmart", 2, 90000.0);
        JobRoles j5 = empj4.AddRoles("r5", "Sales Representative", "RedHat",  1, 60000.0);
        employerhistory.add(empj1);
        employerhistory.add(empj2);
        employerhistory.add(empj3);
        employerhistory.add(empj4);
        jobrolelists.add(j1);
        jobrolelists.add(j2);
        jobrolelists.add(j3);
        jobrolelists.add(j4);
        jobrolelists.add(j5);
        }  
   public EmployerProfile SearchEmployerProfilebyid(String id){
        for(EmployerProfile e : emplists){
            if(id.equals(e.getEmployer_id())){
                return e;
            }
        }
        return null;
    }
    
    public EmployerJobRoles SearchEmployerJobRolesbyid(String id){
        for(EmployerJobRoles e : employerhistory){
            if(id.equals(e.getEmployer_id())){
                return e;
            }
        }
        return null;
    }
    public void Addemployee(EmployerProfile e ){
        emplists.add(e);
    }
    public void Addemployee1(EmployerJobRoles e ){
        employerhistory.add(e);
    }
}
