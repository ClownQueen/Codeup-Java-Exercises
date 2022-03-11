package grades;

public class Student {
    private String name;
    private int grades;


    public Student(String name, int grades) {
        this.name = name;
        this.grades = grades;
    }

    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){

    }
    // returns the average of the students grades
    public double getGradeAverage(){
        return grades;
    }

    public static void main(String[] args) {

    }
}
