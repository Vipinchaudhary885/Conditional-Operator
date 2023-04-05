package ConditionalOperator;

// It is smaller version for the if-else statement.If the condition is true then the statement-1 is executed else the statement-2 is executed.

public class TernaryOperator {
    public static void main(String[] args) {
        int value = 11;
        String ans;
        ans = (value % 2) == 0 ? "Even" : "Odd";

        System.out.println(ans);

    }
}
