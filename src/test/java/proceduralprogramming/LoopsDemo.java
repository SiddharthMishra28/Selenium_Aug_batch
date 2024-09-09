package proceduralprogramming;

public class LoopsDemo {
    public static void main(String[] args) {
        // FOR LOOP
        // WHILE LOOP
        // DO WHILE LOOP
        // FOREACH LOOP - OUT OF SCOPE

        // for(<INITIALIZE>; <CONDITION>; <INCREMENT / DECREMENT) {
        // ...
        // }
//        for(int i=0; i<100; i++) {
//            if(i%5 == 0) {
//                continue;
//            }
//            System.out.println("Loop running for "+i+"th time");
//        }

//        for(int i=10; i<20; i++) {
//            if(i%18 == 0) {
//                break;
//            }
//            System.out.println("Running for "+i+ "th time");
//        }

        // while(<CONDITION>) {
        // ....
        // }
//        int i=0;
//        while(i < 100) {
//            System.out.println("While loop running for "+i+"th time");
//            i++;
//        }

        // RUNS ATLEAST ONCE EVEN IF CONDITION IS FALSE
        // do {
        // ... LOGIC / CODE
        // }while(<CONDITION>)
        int i = 100;
        do {
            System.out.println("Loop running for "+i+"th time");
            i++;
        }while(i<100);
    }
}
