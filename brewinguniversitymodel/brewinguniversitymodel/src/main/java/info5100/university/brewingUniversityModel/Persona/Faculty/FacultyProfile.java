/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.brewingUniversityModel.Persona.Faculty;

import info5100.university.brewingUniversityModel.Persona.*;
import info5100.university.brewingUniversityModel.CourseSchedule.CourseOffer;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyProfile {

    Person person;
    ArrayList <FacultyAssignment> facultyassignments; 

    public FacultyProfile(Person p) {

        person = p;
        facultyassignments = new ArrayList();
    }

    public FacultyAssignment AssignAsTeacher(CourseOffer co){
        
        FacultyAssignment fa = new FacultyAssignment(this, co);
        facultyassignments.add(fa);
        
        return fa;
    }
    
    public FacultyProfile getCourseOffer(String courseid){
        return null; //complete it later
    }

    public boolean isMatch(int id) {
        if (person.getPersonId() == id) {
            return true;
        }
        return false;
    }
    
    public boolean isMatch(String name) {
        if (person.getName().equals(name)) {
            return true;
        }
        return false;
    }
    
    public String getName() {
        return this.person.getName();
    }

    
    
}
