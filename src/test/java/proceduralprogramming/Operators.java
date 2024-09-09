package proceduralprogramming;

public class Operators {

    public static void main(String[] args) {
        // MATHEMATICAL +, -, *, /, % // MODULUS / REMAINDER
        // LOGICAL &&, ||
        // TERNARY
        // SHIFT
        String password = "sad";
        int a = 4;
        int b = 6;
        System.out.println("Remainder is "+(b%a));
        boolean isFormValid = password.length() > 8 ? true : false;
        String color = isFormValid ? "GREEN" : "RED";
        System.out.println(isFormValid);
        System.out.println(color);

    }
}
