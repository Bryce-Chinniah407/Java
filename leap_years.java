import java.util.Scanner;

public class leap_years {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }
        scn.close();
    }
}
