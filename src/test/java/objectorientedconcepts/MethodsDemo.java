package objectorientedconcepts;

public class MethodsDemo {

    // Method
    // Reusable Piece of Code / Logic
    // Signature
    // <ACCESS SPECIFIER> <RETURN TYPE> <METHOD NAME> (...arguments / inputs) {
    // .... Logic
    // }

    public String greetUser(String userName) {
        return "Hello there "+userName+"!";
    }

    public static void main(String[] args) {
        MethodsDemo demo = new MethodsDemo();
        System.out.println(demo.greetUser("Sid"));
    }
}
