import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();

        System.out.println(s1.length() + s2.length());
        System.out.println(s1.toLowerCase().compareTo(s2.toLowerCase()) <= 0 ? "No" : "Yes");
        System.out.println(s1.substring(0, 1).toUpperCase() + s1.substring(1) + " " + s2.substring(0, 1).toUpperCase()
                + s2.substring(1));
        sc.close();
    }
}
