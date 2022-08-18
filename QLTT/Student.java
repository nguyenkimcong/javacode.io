import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Student {
    private  int id;
    private String name;
    private int  age;
    private  String hocLuc;


 

    
    public Student(int id, String name, int age, String hocLuc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hocLuc = hocLuc;
    }

    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getHocLuc() {
        return hocLuc;
    }





  @Override
  public String toString() {
    return "People [age=" + age + ", hocLuc=" + hocLuc + ", id=" + id + ", name=" + name + "]";
  }
    
   
    


public void setClassification (String hocLuc){
  this.hocLuc = hocLuc ;

}
}