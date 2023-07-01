import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // Clear the input buffer
        sc.nextLine();
        while (t != 0) {
            String str = sc.nextLine();
            try {
                Pattern.compile(str);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            t--;
        }
        sc.close();
    }
}
