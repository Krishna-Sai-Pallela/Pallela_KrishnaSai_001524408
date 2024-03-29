/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.brewingUniversityModel.Persona.Faculty;

import info5100.university.brewingUniversityModel.Persona.*;
import info5100.university.brewingUniversityModel.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyDirectory {

    Department department;
    ArrayList<FacultyProfile> teacherlist;

    public FacultyDirectory(Department d) {

        department = d;
        teacherlist = new ArrayList();

    }

    public FacultyProfile newFacultyProfile(Person p) {

        FacultyProfile sp = new FacultyProfile(p);
        teacherlist.add(sp);
        return sp;
    }

    public FacultyProfile findFacultyByName(String name) {
        for (FacultyProfile sp : teacherlist) {

            if (sp.isMatch(name)) {
                return sp;
            }
        }
        return null;
    }
    
    public FacultyProfile findTeachingFaculty(int id) {

        for (FacultyProfile sp : teacherlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public ArrayList<FacultyProfile> getList() {
        return teacherlist;
    }
    
}
