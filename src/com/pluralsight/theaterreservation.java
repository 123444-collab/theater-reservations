package com.pluralsight;

import java.util.Scanner;

public class theaterreservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = input.nextLine();

        System.out.print("How many tickets would you like? ");
        int tickets = input.nextInt();

        String[] parts = name.split(" ");
        String firstName = parts[0];
        String lastName = parts[parts.length - 1];

        String word = "tickets";
        if (tickets == 1) {
            word = "ticket";
        }

        System.out.println(tickets + " " + word + " reserved for " + date + " under " + lastName + ", " + firstName);
    }
}
