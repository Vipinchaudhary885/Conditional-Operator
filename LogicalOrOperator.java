package ConditionalOperator;

public class LogicalOrOperator {
    public static void main(String[] args) {
        int value = 15;

        // Print the number if the input value is greater than 10 or less than 5.
        // yha agar ek bhi condition satisfy hou jate hai tou result print hou jayega
        // aur agar yha ek condition shi hai tou dusri condition check krne ki need nhi
        // hoti.

        // if (value > 10 || value < 5) {
        // System.out.println("The value is " + value);

        // }
        if (value % 3 == 0 || value % 5 == 0) {
            System.out.println("The value is " + value);

        }

    }
}
