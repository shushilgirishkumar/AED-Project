/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Courses;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author shush
 */
public class CourseCreation {
    private ArrayList<CourseDetails> courselists;

    public ArrayList<CourseDetails> getCourselists() {
        return courselists;
    }

    public void setCourselists(ArrayList<CourseDetails> courselists) {
        this.courselists = courselists;
    }

    public CourseCreation() {
        courselists = new ArrayList<>();
    }
}

