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
public class EmployerJobRoles {
    private String Employer_id;
    private String Employer_name;
    private ArrayList<JobRoles> emp_rolelists; 

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

    public ArrayList<JobRoles> getEmp_rolelists() {
        return emp_rolelists;
    }

    public void setEmp_rolelists(ArrayList<JobRoles> emp_rolelists) {
        this.emp_rolelists = emp_rolelists;
    }
    
    public JobRoles AddRoles(String job_id, String role_name, String employername, int roleavailability, double employeeSalary){
        JobRoles j = new JobRoles();
        this.emp_rolelists.add(j);
        j.setJob_id(job_id);
        j.setEmployername(employername);
        j.setRole_name(role_name);
        j.setRoleavailability(roleavailability);
        j.setEmployeeSalary(employeeSalary);
        return j;
    }

    public EmployerJobRoles(String Employer_id, String Employer_name) {
        this.Employer_id = Employer_id;
        this.Employer_name = Employer_name;
        emp_rolelists = new ArrayList<>();
    }
}
