package CH7_Exercises;
import java.util.*;
public class School {
    //is this instance variable and constructor correct for the "School" class?
    ArrayList<Student> studentList; 

    //added
    public School (){
        studentList = new ArrayList<>()
    }
    public School(ArrayList<Student> studentList){   //revised
        this.studentList = studentList;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void removeStudent(Student student){
        studentList.remove(student);
    }
    //the findYoungestStudent method below: I am having trouble getting the integer value "age"
    // from the first element of my array list "studentList"
    public Student findYoungestStudent(ArrayList studentList){
        Student youngest = studentList.get(0);
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getAge() > Student.getAge()){
                youngest = (Student) studentList.get(i);
            }
        }
        return Arrays.toString(youngest);
    }

}
