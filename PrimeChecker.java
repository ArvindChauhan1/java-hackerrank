import java.util.Scanner;

public class PrimeChecker {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void pCheck(int... n) {
        for (int i = 0; i < n.length; i++) {
            if (isPrime(n[i])) {
                System.out.print(n[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        pCheck(arr[0]);
        pCheck(arr[0], arr[1]);
        pCheck(arr[0], arr[1], arr[2]);
        pCheck(arr[0], arr[1], arr[2], arr[3], arr[4]);
    }
}
