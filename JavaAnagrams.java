import java.util.Scanner;
import java.util.Arrays;

public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();
        char arr[] = a.toCharArray();
        Arrays.sort(arr);
        a = Arrays.toString(arr);
        char arr2[] = b.toCharArray();
        Arrays.sort(arr2);
        b = Arrays.toString(arr2);
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        sc.close();

    }

}
