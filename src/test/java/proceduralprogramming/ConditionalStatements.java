package proceduralprogramming;

public class ConditionalStatements {
    public static void main(String[] args) {
        // VOTERSLIST FORM
        // name, age, gender, aadhaar
//        String name = "sid";
//        int age = 45;
//        char gender = 'M';
//        long aadhaar = 102938472948L;
//        String aadhaar = "102938472948";
//        boolean isElligibleToVote = false;
//        // if, else else if
//        // if(<CONDITION>) {
//        // ....
//        // }
//        if(age > 18) {
//            isElligibleToVote = true;
//        }
//        System.out.println("Voter Details are :");
//        System.out.println("Name "+name);
//        System.out.println("Age "+age);
//        System.out.println("Gender "+gender);
//        System.out.println("Elligble To Vote "+isElligibleToVote);

        // EMPLOYEE MANAGEMENT
        // NIGHT SHIFT - GENDER M, AGE < 35
//        boolean isElligibleForNightShift = false;
//        // COMBINED CONDITIONAL CHECKS
//        if(gender == 'M' && age < 35) {
//            isElligibleForNightShift = true;
//        }else {
//            System.out.println("Not Elligible!");
//        }

        // MENU
        // 1. update mobile number
        // 2. update email
        // 3. update address
        int choice = 1;
        if(choice == 1) {
            System.out.println("Enter your updated mobile Number");
        }else if(choice == 2) {
            System.out.println("Enter updated email");
        }else if(choice == 3) {
            System.out.println("Enter updated address");
        }else {
            System.out.println("Thanks for visiting the portal!");
        }
    }
}
