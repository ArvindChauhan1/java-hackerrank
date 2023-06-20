import java.util.Scanner;

public class JavaInttoString {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= -100 && num <= 100)
            System.out.println("Good job");
        else
            System.out.println("Wrong answer");

        sc.close();
    }
}