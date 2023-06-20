import java.util.Scanner;
import java.util.Arrays;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt();
        sc.close();
        try {
            String[] arr = new String[s.length() - a + 1];
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.substring(temp, temp + a);
                temp++;
            }
            Arrays.sort(arr);
            System.out.println(arr[0]+"\n"+arr[arr.length-1]);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
