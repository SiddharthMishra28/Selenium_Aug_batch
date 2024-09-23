package proceduralprogramming;

public class Assignment3 {
    // DECLARE A 2D STRING ARRAY OF EMPLOYEES
    // FIRST ROW HEADER
    // SECOND ROW ONWARDS DATA
    // FILTER AND PRINT HIGHEST PAID EMPLOYEES
    // FILTER AND PRINT EMPLOYEES WITH AGE < CERTAIN VALUE
    //    {
    //        {"name", "age", "salary"},
    //        {"sid", "32", "85000"},
    //        {"meenal", "28", "56000"}
    //    }
    public static void main(String[] args) {
        // 1. declare data in 2d array
        // 2. write loops / code to traverse the array
        // 3. mathematically avg ? filter ?
        // 4. Implement the logic

        String[][] employees = {
                {"name", "age", "salary"}, //0
                // 0
                {"sid", "32", "85000"},
                {"manali", "25", "66000"},
                {"akruti", "25", "66000"},
                {"vishal", "38", "125000"},
                {"arpit", "41", "225000"}
        };
//        int higestPaid = Integer.parseInt(employees[1][2]);
//        int ageFilter = 27;
//        for(int i=1; i<employees.length; i++) {
////            for(int j=0; j<employees[i].length; j++) {
////                System.out.println(employees[i][j]);
////            }
//            int temp = Integer.parseInt(employees[i][2]);
//            if(temp > higestPaid) {
//                higestPaid = temp;
//                System.out.println("Highest Paid Employee is : "+employees[i][0]);
//            }
//        }

//        int higestPaid = Integer.parseInt(employees[1][2]);
        int ageFilter = 33;
        for(int i=1; i<employees.length; i++) {
//            for(int j=0; j<employees[i].length; j++) {
//                System.out.println(employees[i][j]);
//            }
            int rowAge = Integer.parseInt(employees[i][1]);
            if(rowAge < ageFilter) {
                System.out.println("Employees with age less than "+ageFilter+" are : "+employees[i][0]);
            }
        }
    }
}
