package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        System.out.println("Please enter a number.");
        int userNumber;
        int numberOfTimesZeroNotEntered = 0;
        do
        {
            userNumber = userInput.nextInt();
            if (userNumber != 0)
            {
                System.out.println("Please enter a number again.");
                numberOfTimesZeroNotEntered++;
            }

        }while (userNumber != 0);

        System.out.println("You entered a number other than zero " + numberOfTimesZeroNotEntered + " times. Congrats!");

    }
}
