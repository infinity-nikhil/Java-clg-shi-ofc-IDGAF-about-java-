package part1;
import java.util.Scanner;

public class Demo2 {
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
    }
}

//Cool ri8 everything looks nice and fine ri8....but yk what this will not work....to be continued 