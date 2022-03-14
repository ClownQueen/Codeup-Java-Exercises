package grades;

import java.util.ArrayList;

public class Student {
    private final String name;
    private final ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (int grade: grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student rockwell = new Student("RockwellForest");
        rockwell.addGrade(78);
        rockwell.addGrade(60);
        rockwell.getGradeAverage();

        Student monument = new Student("MonumentMythos");
        monument.addGrade(85);
        monument.addGrade(35);
        monument.getGradeAverage();
    }
}
