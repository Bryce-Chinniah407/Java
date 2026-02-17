import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int first_term = 0;
        int second_term = 1;

        System.out.println("Fibonacci series till the number "+n+"is: ");

        for(int i = 1; i <= n; i++) {
            System.out.println(first_term+",");
            int nextTerm = first_term + second_term;
            first_term = second_term;
            second_term = nextTerm;
        }
        scn.close();
    }
}
