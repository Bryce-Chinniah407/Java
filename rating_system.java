import java.util.Scanner;

public class rating_system {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rating = scn.nextInt();
        switch(rating){
            case 1:
                System.out.println("Not good movie");
                break;
            case 2:
                System.out.println("One-time watch movie");
                break;
            case 3:
                System.out.println("Average movie");
                break;
            case 4:
                System.out.println("Good movie to watch");
                break;
            case 5:
                System.out.println("Outstanding movie");
                break;
        }
        scn.close();
    }
}







