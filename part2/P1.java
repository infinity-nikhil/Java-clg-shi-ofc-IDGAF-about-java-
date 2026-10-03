package part2;
import java.util.Scanner;

//WAP that keeps asking the user for number 5...

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num = Integer.valueOf(sc.nextLine());

        //Now 2 ways to do it 
        //-> the condition becomes false itself 
        //->or we internally break the loop

        while(num != 5){
            System.out.println("Please try again: ");
            num = sc.nextInt();
        }

        while (true) { 
         if (num == 5) {
            break;
         }
         System.out.println("Please try again");
         num = Integer.valueOf(sc.nextLine());   
        }

    }

}

//On similar  pattern untill the user says "yes" to exit 
//there we use something    
/*
   if (input.equals("y")) {   this .equls for comparison ... js me for string comparision we had === not here 
        break;
    }
*/