import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Num = scn.nextInt();

        if(Num == 1){
            System.out.println("Odd");
        } else if(Num == 2) {
            System.out.println("Even");
        } else if (Num == 3) {
            System.out.println("Odd");
        } else if(Num == 4) {
            System.out.println("Even");
        } else if (Num == 5) {
            System.out.println("Odd");
        } else if (Num == 6) {
            System.out.println("Even");
        } else if (Num == 7) {
            System.out.println("Odd");
        } else if (Num == 8) {
            System.out.println("Even");
        } else if (Num == 9) {
            System.out.println("Odd");
        } else if (Num == 10) {
            System.out.println("Even");
        } else {
            System.out.println("Number is too big");
        }
        scn.close();
    }
}
