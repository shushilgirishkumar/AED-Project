/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author devmi
 */
public class Adminlog {
    
    private String Username;
    private String password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     public Adminlog(String Username, String password){
         this.Username = Username;
        this.password = password;
     }




}