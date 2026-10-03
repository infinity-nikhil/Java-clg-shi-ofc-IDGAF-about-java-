package part1;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //scanner instance
        Scanner sc = new Scanner(System.in);

        //printing
        System.out.println("Hellow this is how we print");

        //receving the input 
        System.out.println("Give some int: ");
        int num = sc.nextInt();

        System.out.println("Give a double: ");
        double dec =  sc.nextDouble();

        System.out.println("Give a String: ");
        //String str = sc.nextString(); nope nga can't do it like ts
        String str = sc.nextLine();

        //Mostly problems arround this one envlolves arround 
        System.out.println("the first num is: " + num + "The first dec is: " + dec + "And the string is: " + str);

        //Conditional statements 
        int number = 55;

        if (number != 0) {
            System.out.println("The number is not 0");
        } else {
            System.out.println("The number is 0");
        }

        if (number > 1000) {
            System.out.println("The number is greater than 1000");
        }
    }
}

//Alternet for nextInt(), nextDoubl() == Intger.valueOf(sc.nextLine()) & Double.valueOf(sc.nextLine())

//Cool ri8 everything looks nice and fine ri8....but yk what this will not work....to be continued 

/* Some question that are for basic practice 
-> A grade calculator 
-> Odd even calculator 
Then we have logical opperatiors and some question on them (basic ones tbh)
*/