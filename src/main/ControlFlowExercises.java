package main;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.println("i is: " + i);
//            i++;
//        }

//        int j = 100;
//        do {
//            System.out.println(j);
//            j -= 5;
//        } while (j >= -(10));

//        long a = 2;
//        do {
//            System.out.println(a);
//            a *= a;
//        }while (a < 1000000);

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        for (int i = 1; i < 101; i++) {
//            if (i % 15 == 0){
//                System.out.print("FIZZ BUZZ\n");
//            } else if (i % 3 == 0){
//                System.out.print("FIZZ\n");
//            } else if (i % 5 == 0){
//                System.out.print("BUZZ\n");
//            } else {
//                System.out.print(i + "\n");
//            }
//        }

        Scanner input = new Scanner(System.in);
//
//        boolean continuing = true;
//        do {
//            System.out.print("Where would you like the table to end?: ");
//            int myInput = input.nextInt();
//
//            System.out.println();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | ------");
//            for (int i = 1; i < myInput; i++) {
//                System.out.format("%-6d", i);
//                System.out.print(" | ");
//                System.out.format("%-7d", i * i);
//                System.out.print(" | ");
//                System.out.println(i * i * i);
//            }
//            System.out.println();
//            System.out.println("Would you like another number? (y/n)");
//            String agreement = input.next();
//            if(!(agreement.equalsIgnoreCase("y"))){
//                continuing = false;
//            };
//        }while (continuing);

        System.out.println("Please enter a Grade");
        int numberGrade = input.nextInt();

        if (numberGrade >= 88){
            System.out.println("A");
        } else if (numberGrade >= 80){
            System.out.println("B");
        } else if (numberGrade >= 67){
            System.out.println("C");
        } else if (numberGrade >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
