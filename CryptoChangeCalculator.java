/*
 * CryptoChangeCalculator.java
 *
 * A simple Java application that calculates the change for a ticket purchase.
 * The ticket is assumed to cost up to 7500 Cryptom. The program computes the change 
 * by breaking it down into various cryptocurrency coin denominations: Bitom, Ditom, Zitom, and Cryptom.
 *
 * Algorithm:
 * 1. Ask the user for the ticket price.
 * 2. Calculate the change as 7500 - price.
 * 3. Compute:
 *    - Bitom = change / 500 
 *    - Ditom = (change % 500) / 200
 *    - Zitom = (change % 500 % 200) / 50
 *    - Cryptom = remaining change after extracting Bitom, Ditom, and Zitom.
 */

import java.util.Scanner;

public class CryptoChangeCalculator {
    public static void main(String[] args) {
        final int TOTAL = 7500; // Total cost in Cryptom for a ticket

        Scanner keyboard = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome to the Crypto Change Calculator!");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        // Prompt the user to enter the ticket price
        System.out.print("Enter the price of the ticket in Cryptom (at most " + TOTAL + "): ");
        int price = keyboard.nextInt();
        
        // Calculate the change to be returned
        int change = TOTAL - price;
        System.out.println("\nYou bought a ticket for " + price + " Cryptom. Your change is calculated as:");

        // Calculate the number of coins for each denomination
        int bitom = change / 500;
        int changeAfterBitom = change % 500;
        int ditom = changeAfterBitom / 200;
        int changeAfterDitom = changeAfterBitom % 200;
        int zitom = changeAfterDitom / 50;
        int cryptom = changeAfterDitom % 50;

        // Display the breakdown of change
        System.out.println(bitom + " Bitom,");
        System.out.println(ditom + " Ditom,");
        System.out.println(zitom + " Zitom, and");
        System.out.println(cryptom + " Cryptom.\n");

        // Closing message
        System.out.println("Thank you for using the Crypto Change Calculator!");
        System.out.println("Enjoy the Game!");

        keyboard.close();
    }
}


