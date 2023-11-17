package CH7_Exercises;

public class Ch7Tester {
    public static void main(String[] args){
        Student daniela = new Student("Daniela", 900, 21, 3.45, 75);
        Student daniel = new Student("Daniel", 901, 22, 3.33, 80);
        Student william = new Student("William", 903, 20, 3.20, 50);
        Student tracy = new Student("Tracy", 904, 21, 3.15, 60);
        Student imposter = new Student("Imposter", 900, 21, 3.45, 75);

        School ggc = new School();
        ggc.addStudent(daniela);
        ggc.addStudent(daniel);
        ggc.addStudent(william);
        ggc.addStudent(tracy);
        ggc.addStudent(imposter);

        ggc.findYoungestStudent();
        ggc.findOldestStudent();
        daniela.toString();

        System.out.println(ggc);
        ggc.removeStudent(imposter);
        System.out.println(ggc);

    }
}
