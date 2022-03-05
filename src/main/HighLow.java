package main;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highLow();
    }
    public static void highLow(){
        Scanner input = new Scanner(System.in);
        boolean guessing = true;
        int guesses = 0;
        int guessInput = 0;
        int num = (int) (Math.random()*100 + 1);
        System.out.println(num);
        do {
            System.out.print("Guess a number between 1-100: ");
            if (!input.hasNextInt()){
                System.out.println("Please put in a number");
                input.nextLine();
                continue;
            } else {
                guessInput = input.nextInt();
                input.nextLine();
                if (guessInput < num){
                    System.out.println("Higher");
                }
                if (guessInput < num){
                    System.out.println("Lower");
                }
                if (guessInput == num){
                    System.out.println("Impressive guess");
                    guessing = false;
                }
            }
            guesses += 1;
        }while(guessing);
        if (guesses == 1){
            System.out.print("Do you have telepathy!?!");
        } else {
            System.out.printf("It took you %d amount of guesses to guess right.", guesses);
        }
        input.close();
    }
}
