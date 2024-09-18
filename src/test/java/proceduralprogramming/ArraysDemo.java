package proceduralprogramming;

public class ArraysDemo {
    public static void main(String[] args) {
        // HOMOGENEOUS COLLECTION OF DATA
        int[] ages = {22,25,23,32,28};
        // INDEX -    0  1  2  3  4 // ALWAYS STARTS WITH 0
        String[] stars = {"Proxima", "Ageis", "Sun"};
        //                    0         1       2
        float[] indices = {1.34f, 3.24f, 3.45f};
        System.out.println(ages[2]);
        System.out.println(stars[2]);

        float[][] houses = {
            {21.345f, 34.567f}, // 0
            // 0        1
            {34.567f, 76.543f}, // 1
            // 0        1
        };
        System.out.println(houses[0][1]);
    }
}
