package part2;
import java.util.Scanner;

//WAP that takes your input and prints that number from 0 to num
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num = Integer.valueOf(sc.nextLine());
        int start = 1;

        //Again the two methods 

        //making the condition false 
        // while (start <= num) {
        //     System.out.println(start);
        //     start += 1;
        // }

        //isme bhi condition false but while loop always = true
        //we are just breaking the loop internally on the basis of conditon
        while(true) {
            if (start == num) 
                break;
            System.out.println(start);
            start++;
        }
        // Here is a conceptual catch the loop prints upto num -1. WHY ?
    }
    
}