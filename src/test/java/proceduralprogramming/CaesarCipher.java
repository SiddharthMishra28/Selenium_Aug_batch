package proceduralprogramming;

import java.util.Scanner;

public class CaesarCipher {
    // ENCRYPTION
    // User input
    // For each character in the user input - ASCII
    // Ask user for shift value
    // Add value to ASCII number
    // convert the number back to character
    // convert the characters back to string and display

    // DECRYPTION
    // Subtract the shift value instead of adding
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("###### WELCOME TO CIPHER #######");
        boolean isRunning = true;
        int option;
        String input;
        while(isRunning) {
            System.out.println("Select an option from below menu: ");
            System.out.println("1. Encrypt a String");
            System.out.println("2. Decrypt a String");
            System.out.println("3. Quit Program");
            option = sc.nextInt();
            sc.nextLine();
            char[] stringChars = null;
            int shift = 0;
            switch(option) {
                case 1:
                    System.out.println("Enter a string to encrypt : ");
                    input = sc.nextLine();
                    stringChars = input.toCharArray();
                    System.out.println("Enter the amount of Shift (0-25) : ");
                    shift = sc.nextInt();
                    sc.nextLine();
                    char[] output = new char[input.length()];
                    for(int i=0; i<stringChars.length; i++) {
                        char ch = stringChars[i];
                        output[i] = (char)(ch + shift);
                    }
                    System.out.println("Encrypted String is : "+new String(output));
                    break;
                case 2:
                    System.out.println("Decryption Logic");
                    break;
                case 3:
                    System.out.println("Bye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid Input. Please select a valid option");
                    break;
            }
        }
    }
}
