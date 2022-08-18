import java.util.ArrayList;

public class Class {
    private String subject;
    ArrayList <Student> students = new ArrayList<>();
    public Class (String subject, ArrayList<Student> student){
        this.subject = subject;
        this.students = student;
        
        
    }
    @Override
    public String toString() {
        return "Class [student=" + students + ", subject=" + subject + "]";
    }

    
 
    public void addStudent ( Student student){
        students.add(student);
    }
      /////Find student by ID
      public Student findByID(int num){
        Student studentWithID = null;
        for (Student temp : students) {
            if (temp.getId() == num ) {
                studentWithID = temp;
            }
        }
        return studentWithID;
    }

   
    public boolean compareByID(int num){
        boolean isBoolean = false;
        for (Student temp : students) {
            if (temp.getId() == num ) {
                isBoolean = true;
            }
        }
        return isBoolean;
    }
}
