import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   
        Student student = new Student(22, "nguyen kim công", 23, "kha");
        Student student1 = new Student(20, "nguyen kim b", 22, "tb");
        Student student2 = new Student(19, "nguyen kim a", 21, "gioi");
        Student student3 = new Student(18, "nguyen kim d", 20, "kha");
       
       
        
      
       
        ArrayList <Student> SudentList = new ArrayList<>();
        SudentList.add(student);
        SudentList.add(student1);
        SudentList.add(student2);
        SudentList.add(student3);
        
       

        
        Class classJava = new Class("JavaCode", SudentList);

        People lecturer = new People("Huong", "giang vien");
        People teacher = new People("Dat", "Thay giao");

        Teckmaster techMaster = new Teckmaster(lecturer, teacher, classJava);

        System.out.println(techMaster.toString());

       
        System.out.println("Them hoc vien");
        System.out.println("Hay nhap ten hoc vien: ");
        String nameOfNewStudent = scanner.nextLine();
        int IdOfNewStudent = 0;

        
         while (true) {
            System.out.println("Hay nhap ID: ");
            IdOfNewStudent = scanner.nextInt();
            if (techMaster.compareByID(IdOfNewStudent) == false) {
                break;
            }
        }
        System.out.println("Hay nhap tuoi: ");
        int ageOfNewStudent = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hay nhap xep hang: ");
        String classificationOfNewStudent = scanner.nextLine().toUpperCase();

        Student newStudent = new Student(IdOfNewStudent, nameOfNewStudent, ageOfNewStudent, classificationOfNewStudent);
        techMaster.addStudent(newStudent);
        System.out.println(techMaster.toString());

        
        System.out.println("Tim hoc vien theo ID: ");
        System.out.println("Hay nhap ID: ");
        int idFind = scanner.nextInt();
        scanner.nextLine();
        Student studentUpdateClassification = techMaster.findByID(idFind);
      


        System.out.println("Hay nhap thong tin hoc luc moi:");
        String newClassification = scanner.nextLine().toUpperCase();
        studentUpdateClassification.setClassification(newClassification);
        System.out.println(techMaster.toString());

      
        System.out.println("Xoa hoc vien theo ID");
        System.out.println("Hay nhap ID");
        int idDel = scanner.nextInt();
        scanner.nextLine();
        Student studentDelete = techMaster.findByID(idDel);
        SudentList.remove(studentDelete);
       
        System.out.println(techMaster.toString());

        scanner.close();

    }

  
}

