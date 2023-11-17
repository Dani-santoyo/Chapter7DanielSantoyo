package CH7_Exercises;
import java.util.*;
public class School {
    ArrayList<Student> studentList;
    public School(){
        studentList = new ArrayList<>();
    }
    public School(ArrayList<Student> studentList){
        this.studentList = studentList;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void removeStudent(Student student){
        studentList.remove(student);
    }

    public void findYoungestStudent(){ //ArrayList Param must include <Type>
        Student youngest = studentList.get(0);
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getAge() < youngest.getAge()){
                youngest =  studentList.get(i);
            }
        }
        System.out.println(youngest.getName());
    }

    public void findOldestStudent(){
        Student oldest = studentList.get(0);
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getAge() > oldest.getAge()){
                oldest = studentList.get(i);
            }
        }
        System.out.println(oldest.getName());
    }

    @Override
    public String toString(){
        return String.valueOf(studentList);
    }

}
