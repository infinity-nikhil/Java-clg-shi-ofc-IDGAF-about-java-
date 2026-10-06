package part2.P3Questions;
import java.util.Scanner;

// Implement a program, which calculates the sum 1+2+3+...+n 
// where n is given as user input

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a num: ");
        int num = sc.nextInt();
        int result = 0;

        for (int i = 0; i <= num; i++) {
            result += i;
        }
        System.out.println(result);

        //Lets look at the while loop 
        int i =0;
        while(i <= num) {
            result += i;
            i++;
        }
    }
}
