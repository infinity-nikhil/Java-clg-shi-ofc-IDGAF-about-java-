package part1;
import java.util.Scanner;

/*A year is a leap year if it is divisible by 4. However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
Write a program that reads a year from the user, and checks whether or not it is a leap year. */

//So it's IMP to understand which conditional statement where to use 
public class Q1 {
    public static void main(String[] args) {
        //scanner instance
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the year");
        int year = sc.nextInt();

        if (year % 100 == 0 && year % 400 ==0) {
            System.out.println("The year is a leap year");
        } else if( year % 4 == 0) {
            System.out.println("The year is a damn learp year");
        } else {
            System.out.println("The year is not a leap yar");
        }
    }
}

//Learning 
// Like if you have multiple condition to check is this than that or if this than that typa  shi 
// then this is used 
//Notice here 2000 stisfies both if and else if but it passes the if check so the else if block does 
//not gets executed even though it also satisfies the condition
//And yeah the order matters too.....if year % 4 == 0 is at top then code will be wrong ofc  

/* On similar logic a gift tax calclualtor will work based on the amount

And a grade ranker also ...But the thing is you can add multiple if block to make it work 
it will work but if you try to apply that logic here it will be wrong 
-> 2000 will print 2 times it's a leap year and while 1800 will print it is and it is not a leap year 
*/