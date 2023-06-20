import java.util.*;

class JavaDateAndTime {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Month is zero-based in Calendar, so subtract 1
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Mapping the dayOfWeek value to the corresponding day name
        String[] daysOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        return daysOfWeek[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(findDay(m, d, y));

        sc.close();
    }
}