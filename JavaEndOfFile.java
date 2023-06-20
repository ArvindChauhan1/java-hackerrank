import java.util.*;

public class JavaEndOfFile {
    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        int c = 1;
        while (sc.hasNextLine()) {
            s = s + c + " " + sc.nextLine()+"\n";
            c++;
        }
        System.out.println(s);
        sc.close();
    }
}
