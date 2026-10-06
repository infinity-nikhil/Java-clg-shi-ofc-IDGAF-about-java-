package guessingGame;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = Math.random();

        int anum = (int)(num *10);

        System.out.print("Guess the number: ");
        int gnum = sc.nextInt();

        //While loop was wasy how do we code the logic in for loop 
        while (true) { 
            if ( anum == gnum)
                break;

            System.out.println("Wrong guess again");
            gnum = sc.nextInt();
        }
        //Think about it more hands on for loop it means
    }
}
