import java.util.Scanner;

public class Hello_User {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println("The String is "+str);
        int num = scn.nextInt();
        System.out.println("Number is "+num);
        float fnum = scn.nextFloat();
        System.out.println("The floating number is "+fnum);
        scn.close();
    }
}
