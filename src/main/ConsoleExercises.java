package main;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f\n" ,pi);

        Scanner input = new Scanner(System.in);

//        int myInt = input.nextInt();
//        System.out.println("Did you type in something that can be an int? " + myInt);
//        input.close();

//        String userToken = input.next();
//        System.out.println("First Output: " + input.next());
//        input = new Scanner(System.in);
//        System.out.println("Second Output: " + input.next());
//        input = new Scanner(System.in);
//        System.out.println("Last Output: " + input.next());

        String usersSentence = input.nextLine();
        System.out.println("Sentence Written: " + usersSentence);
    }
}
