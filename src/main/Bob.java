package main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Talk to Bob: ");
        String talking = input.nextLine();
        if (talking.endsWith("?")) {
            System.out.println("Bob: Sure.");
        } else if (talking.endsWith("!")) {
            System.out.println("Bob: Whoa, chill out!");
        } else if (talking.equals("")) {
            System.out.println("Bob: Fine. Be that way!");
        } else {
            System.out.println("Bob: Whatever.");
        }
    }
}
