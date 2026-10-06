package part2.P3Questions;
import java.util.Scanner;

// Implement a program that asks the user for numbers (the program first prints "Write numbers: ") 
// until the user gives the number -1. When the user writes -1, the program prints "Thx! Bye!" and ends.

//Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.

//Extend the program so that it also prints the number of numbers (not including the -1) the user has written

//Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.


public class combo {
    public static void main(String[] args) {
        System.out.println("Give the num: ");
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;

        int num = sc.nextInt();

        while(true) {
            if(num == -1) {
                System.out.println("Thx bye");
                break;
            }

            if (num % 2 ==0) {
                even++;
            }else{
                odd++;
            }
            System.out.print("Try new one: ");
            num = sc.nextInt();
            sum += num;
            count ++;
        }

        System.out.println("The sum is " + sum);
        System.out.println("The number of nums: " + count);
        double avg = sum/count;
        System.out.println("The average of the num is: "+ avg);
        System.out.println("The even num is " + even + " The odd num is " + odd);
    }
}
