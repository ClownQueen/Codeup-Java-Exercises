package main;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f\n" ,pi);

        Scanner input = new Scanner(System.in);

        /* System.out.print("Enter an int: ");
        int myInt = input.nextInt(); **/


        /* System.out.print("Enter 3 words: ");
        String userToken1 = input.next();
        String userToken2 = input.next();
        String userToken3 = input.next();
        System.out.printf("word1: %s\n word2: %s\n word3: %s\n", userToken1, userToken2, userToken3); **/


        /* System.out.print("Enter a Sentence: ");
        String usersSentence = input.nextLine();
        System.out.printf("Sentence Written: %s\n", usersSentence); **/

        System.out.print("Enter room length: ");
        String roomLength = input.nextLine();
        System.out.print("Enter room width: ");
        String roomWidth = input.nextLine();
        int length = Integer.parseInt(roomLength);
        int width = Integer.parseInt(roomWidth);
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);
        System.out.printf("Area of room %d\n Perimeter of roo: %d\n", area, perimeter);
    }
}
