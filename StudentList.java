
package baitap;

import java.util.ArrayList;


public class StudentList {
    ArrayList<Student> studentList = new ArrayList<>();
    public void addStudent(Student student)
   
    {
        studentList.add(student);
    }    
    public Student findStudentById(String id){
        for (Student student : studentList){
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }
    public void deleteStudentById(String id){
        studentList.removeIf(student ->student.getID().equals(id));
    }
    public void displayAllStudents(){
        for (Student student : studentList){
            student.displayInfo();
            
        }
    }
    public Student findTopStudent(){
        if (studentList.isEmpty()){
            return null;
    }
    Student topStudent = studentList.get(0);
    for (Student student : studentList){
    if (student.getGPA()>topStudent.getGPA()){
        topStudent = student;
    }
}
    return topStudent;
    }   
}
        