
package baitap;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Person {   
        float GPA;
        String major;

    public Student() {
    }

        
    public Student(float GPA, String major, String id, String fullName, Date dateOfBirth) {
        
        this.GPA = GPA;
        this.major = major;
    }

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getGPA() {
        return GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public void setMajor(String major) {
        this.major = major;
    }
        
    public void addStudent(float GPA, String major, String id, String fullName, Date dateOfBirth){
        this.id=id;
        this.fullName=fullName;
        this.dateOfBirth=dateOfBirth;
        this.GPA=GPA;
        this.major=major;
    }
    @Override
    public void displayInfo() {
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
              String formattedDate = dateFormat.format(dateOfBirth);
              System.out.println("id: "+id);
              System.out.println("name:"+fullName);
              System.out.println("dob"+formattedDate);
              System.out.println("gpa"+GPA);
              System.out.println("major"+major);
    
    
}

    Object getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setGpa(float newGpa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
