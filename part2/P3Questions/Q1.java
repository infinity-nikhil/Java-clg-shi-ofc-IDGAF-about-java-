package part2.P3Questions;
import java.util.Scanner;

// Write a program, which reads an integer from the user. 
// Then the program prints numbers from that number to 100. 
// You can assume that the user always gives a number less than 100. 
// Below are some examples of the expected functionality.

public class Q1 {
    public static void main(String[] args) {
        Scanner reader =  new Scanner(System.in);
        System.out.println("Give the num under 100: ");
        int num = reader.nextInt();

        for (int a = num; a <= 100; a++) {
            System.out.println(a);
        }
    }
}
