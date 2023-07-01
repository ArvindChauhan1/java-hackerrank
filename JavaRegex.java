import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})(\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]{1,2})){3}$";
        // System.out.println(ip);
        while (sc.hasNext()) {
            String ip = sc.nextLine();
            // System.out.println(ip);
            if (Pattern.matches(regex, ip))
                System.out.println("true");
            else
                System.out.println("false");
        }
        sc.close();
    }
}
