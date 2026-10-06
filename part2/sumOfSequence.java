package part2;
import java.util.Scanner;

//Implement a program, which calculates the sum 1+2+3+...+n 
// where n is given as user input.

/*
Basic logic ?? --> there will be a var sum, a count and a num 
while count <= num 
    sum += count 
    count ++

For loop 
for a = 0; a<=num; a++ 
    sum += a;
*/

public class sumOfSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the num: ");
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;

        //method 1 
        while(count <= num) {
            sum += count;
            count++;
        }

        //method 2
        for (int a =0; a <= num; a++) {
            sum += a;
        }
        System.out.println("The sum is: "+sum);
    }
}

//Implement a program which calculates the sum of a closed interval, and prints it. 
// Expect the user to write the smaller number first and then the larger number.

//Similar prob just count will not be 0 this time. 