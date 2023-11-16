package CH7_Exercises;

public class Student {
    private int id;
    private int age;
    private double gpa;
    private int creditHours;
    //constructor
    public Student(int id, int age, double gpa, int creditHours){
        this.id = id;
        this.age = age;
        this.gpa = gpa;
        this.creditHours = creditHours;
    }
    //getters
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }
    public int getCreditHours(){
        return creditHours;
    }
    //setters
    public void setId(int id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public void setCreditHours(int creditHours){
        this.creditHours = creditHours;
    }
    //equals method
    public boolean equals(Student student) {
        if(student.getId() == id){
            return true;
        }else{
            return false;
        }
    }
    //to String method
    @Override
    public String toString(){
        return "The student's name is: " + " and their id is: " + id; //how can I list the name of the Student type?
    }
}
