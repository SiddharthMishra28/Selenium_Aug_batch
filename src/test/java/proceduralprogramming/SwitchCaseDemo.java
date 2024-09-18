package proceduralprogramming;

public class SwitchCaseDemo {

    public static void main(String[] args) {
        // switch(<VARIABLE_TO_COMPARE>) {
        //   case <VALUE_TO_MATCH>: {
        //       .....
        //      break;
        //   }
        //   default: {
        //         .....
        //     break;
        //   }
        // }
        int dayOfWeek = 1;
        switch(dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
                //.....
            default:
                System.out.println("Not a valid weekday");
                break;
        }
    }
}
