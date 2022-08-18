public class Teckmaster {
    
    People people;
    People people1;
    Class class1;
    Teckmaster techMaster;
    public Teckmaster(People people, People people1, Class class1) {
        this.people = people;
        this.people1 = people1;
        this.class1 = class1;

    }

    

    public Teckmaster addStudent(Student student) {
        class1.addStudent(student);
        return this.techMaster;
    }
    public Student findByID (int num) {
        Student studentFound = class1.findByID(num);
        if (studentFound == null) {
            System.out.println("Khong tim thay ID nay");
        }else{
            System.out.println(studentFound.toString());
        }
        return studentFound;
        
    }

    public boolean compareByID (int num) {
        boolean isBoolean = class1.compareByID(num);
        return isBoolean;
    }
}
