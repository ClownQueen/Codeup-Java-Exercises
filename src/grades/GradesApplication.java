package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student gemini = new Student("GeminiHomeEntertainment");
        gemini.addGrade(randomGrade());
        gemini.addGrade(randomGrade());
        gemini.addGrade(randomGrade());
        gemini.addGrade(randomGrade());

        Student smile = new Student("Smile");
        smile.addGrade(randomGrade());
        smile.addGrade(randomGrade());
        smile.addGrade(randomGrade());
        smile.addGrade(randomGrade());

        Student walten = new Student("WaltenFiles");
        walten.addGrade(randomGrade());
        walten.addGrade(randomGrade());
        walten.addGrade(randomGrade());
        walten.addGrade(randomGrade());

        students.put("replacingNeptune", gemini);
        students.put("ManicLaughterDisease", smile);
        students.put("Don'tForgetSophie", walten);

        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        cli(students, scanner, input);
    }

    public static int randomGrade(){
        return 50 + (int)(Math.random() * (100 - 50) + 1);
    }

    public static void cli(HashMap<String, Student> students, Scanner scan, Input input){
        System.out.println("Welcome!\nHere are the Github student usernames:");

        boolean anotherStudent = true;

        do {
            printKeys(students);

            System.out.println("Which student's information would you like to see?");
            String userInput = scan.nextLine();

            displayData(students, userInput);

            anotherStudent = input.yesNo("Would you like to see another student (y/n)");

            if (!anotherStudent){
                System.out.println("Thank you for your time.");
            }

        }while(anotherStudent);
    }

    public static void printKeys(HashMap<String, Student> students){
        for (String key: students.keySet()){
            System.out.print("|" + key + "| ");
        }
        System.out.println();
    }

    public static void displayData(HashMap<String, Student> students, String userInput){
        if (students.containsKey(userInput)){
            Student currentStudent = students.get(userInput);
            System.out.println("Name: " + currentStudent.getName() + " - Github username: " + userInput);
            System.out.println("Current Average: " + currentStudent.getGradeAverage());
        }else {
            System.out.println("I apologise, but, there are no student with the username " + userInput);
        }
    }

}
