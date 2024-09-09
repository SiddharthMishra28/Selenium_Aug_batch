package proceduralprogramming;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        // SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String user = sc.nextLine();
        System.out.println("Hello there! "+user);
        System.out.println("Enter your age!");
        int age = sc.nextInt();
        if(age > 18) {
            System.out.println("Elligible to vote!");
        }else {
            System.out.println("Age should be greater than 18 yrs");
        }
    }
}
