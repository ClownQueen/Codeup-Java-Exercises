package main;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Addition: " + add(1, 2));
//        System.out.println();
//        System.out.println("Subtraction: " + subtract(9, 6));
//        System.out.println();
//        System.out.println("Multiplication: " + Multiply(3, 1));
//        System.out.println();
//        System.out.println("Division: " + divide(15, 5));
//        System.out.println();
//        System.out.println(mod(15, 3));
//        System.out.println(multiplyWithoutSign(6, 2));
//        getInteger(1, 10);
//        System.out.println(getFactor());
//        diceRoll();



        }

    public static int add (int num1, int num2){
        return num1 + num2;
    }

    public static int subtract (int num1, int num2){
        return num1 - num2;
    }

    public static int Multiply (int num1, int num2){
        return num1 * num2;
    }

    public static int divide (int num1, int num2){
        return num1 / num2;
    }
    public static int mod(int num1, int num2){
        return num1 % num2;
    }

    public static int multiplyWithoutSign (int num1, int num2){
        if (num1 == 0 || num2 == 0){
            return 0;
        }
        return num1 + multiplyWithoutSign(num1, num2 - 1);
    }

    public static int getInteger(int min, int max){
        System.out.printf("Enter a number between %d and %d: ", min, max);
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number < min || number > max){
            return getInteger(min, max);
        }else {
            System.out.println("Number is within range");
            return number;
        }
    }

    public static long getFactor(){
        boolean repeat = true;

        System.out.print("Please enter a number between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int numInput = input.nextInt();
        long factor = 1;
        if (!(numInput >= 1 && numInput <= 10)){
            getFactor();
        } else {
            for (int i = 1; i < numInput; i++){
                factor*= i;
            }
            System.out.printf("%d! = %d\n", numInput, factor);
        }
        input.nextLine();
        System.out.println("Find more factors?: (y/n)");
        String agreement = input.nextLine();
        if (!agreement.equalsIgnoreCase("y")){
            return factor;
        }
        return getFactor();
    }

    public static void diceRoll(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many sides are on the dice?");
        int sides = input.nextInt();
        System.out.println("Would you like to roll? (y/n)");
        String agreement = input.nextLine().trim();
        if (!agreement.equalsIgnoreCase("y")){
            return;
        }
        boolean repeat = true;
        do {
            dice(sides);
            System.out.print("would you like to oll again? (y/n)");
            String repeatAgreement = input.nextLine();
            if (!repeatAgreement.equalsIgnoreCase("y")){
                repeat = false;
            }
        }while (repeat);
    }

    public static void dice(int n){
        int die1 = (int) (java.lang.Math.random()*n + 1);
        int die2 = (int) (java.lang.Math.random()*n + 1);
        System.out.printf("You rolled a %d and a %d", die1, die2);
    }
}
