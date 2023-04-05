package ConditionalOperator;

public class LogicalAndOperator {
    public static void main(String[] args) {
        int value = 18;

        // print the number if the input value is greater than 5 and less than 10.
        // yha agar dono condition statisfy ho rhi hongi tbh hee result execute hoga
        // inside the if parenthesis/statement ka.
        // aur logical && operator multiple conditions kou evaluates krne ke kaam aata
        // hain.

        // if (value > 5 && value < 10) {

        // System.out.println("the value is " + value);
        // }
        if (value % 2 == 0 && value % 3 == 0) {
            System.out.println("The value is " + value);

        }
    }
}
