import java.util.Scanner;
import java.lang.Exception;

public class JavaStaticInitializerBlock {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if (a <= 0 || b <= 0)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        else
            System.out.println((a * b));
    }
}
