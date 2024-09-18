package proceduralprogramming;

import java.util.Scanner;

public class Assignment2 {

    // DISPLAY BELOW MENU TO USER
    // ########## WELCOME TO INTERACTIVE CALCULATOR ###########
    // 1. Add two numbers
    // 2. subtract two numbers
    // 3. divide two numbers
    // 4. multiply two numbers
    // 5. quit

    // DECLARE FEW VARIABLES OF TYPE INT OR DOUBLE
    // TAKE INPUT FROM USER FOR VALUES
    // TAKE INPUT ON OPERATION FROM USER
    // DO CALCULATION AND SHOW RESULT
    // THE PROGRAM SHOULD DISPLAY A MENU WITH BELOW OPTIONS
    public static void main(String[] args) {
        int num1, num2;
        int option = 0;
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("########### WELCOME TO CALCULATOR ###########");
        while(isRunning) {
            System.out.println("Select an option from below menu:");
            System.out.println("Add two numbers");
            System.out.println("Subtract two numbers");
            System.out.println("Multiply two numbers");
            System.out.println("Divide two numbers");
            System.out.println("Quit Program");
            option = sc.nextInt();
            switch(option) {
                case 1: {
                    System.out.println("Enter first Number:");
                    num1 = sc.nextInt();
                    System.out.println("Enter second Number:");
                    num2 = sc.nextInt();
                    System.out.println("Sum is "+(num1 + num2));
                    break;
                }
                case 2: {

                }
                case 3: {

                }
                case 5: {
                    System.out.println("Bye!");
                    isRunning = false;
                }
                //...
                default: {
                    System.out.println("Invalid option selected!");
                    break;
                }
            }

        }
    }
}
