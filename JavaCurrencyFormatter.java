import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val = sc.nextDouble();
        DecimalFormat IndianCurrencyFormat = new DecimalFormat("##,##,###.00");
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = nf.format(val);
        String india = "Rs." + IndianCurrencyFormat.format(val);
        String china = nf1.format(val);
        String france = nf2.format(val);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        sc.close();
    }
}
