package proceduralprogramming;

public class Assignment {
    // DMART
    // STRING ITEMS
    // INT ITEMS_PRICE
    // customerType = "SILVER" - DISCOUNT 5%
    // customerType = "GOLD" - 10%
    // PRINT BILL POST DISCOUNT BASED ON CUSTOMER TYPE
    public static void main(String[] args) {
        String rice;
        String peanuts;
        String perfume;
        double rice_price = 78.0;
        double peanuts_price = 32.0;
        double perfume_price = 550.0;
        double total_price = 0;
        String customer_type = "SILVER";
        if(customer_type.equalsIgnoreCase("SILVER")) {
            total_price = rice_price + peanuts_price + perfume_price;
            System.out.println(total_price -= (0.05 * total_price)); // SHORTHAND EXPRSSION
        }
    }
}
