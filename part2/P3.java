package part2;
import java.util.Scanner;
//In this one will be covering for loops in detail and LOGIC BUILDING 
//Not to mention purane paap hai JS me skip kiya tha and aab yaha aagaye 

//While loop is pretty simple and easy to read tbh 
/*
It's like while (something is true) {
            keep doing this this 
            and a condition which has the capibility to change 
            the boolean state of the loop or simply add a codition to 
            break the loop internally 
        }

IDK For loop is a sirr ka dard for me (murjhaya hua gulab wala emoji)


int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
    How to achive this shi in for loop ?

for(int i = 0; i < 10; i++) {     //all in one khichdi isilye i hate it 
        do this shi 
    }

for("intialize the var"; "provide the check codition"; "the statement/logic to change that condition")

The problem is that in while loop we use to code the logic and change condtion together so it seemed east
but here has to think of codition upfront and the execution logic seperatly 
*/

//ENOUGH LETS DO SOME CODE 
public class P3 {
    public static void main(String[] args) {
        
        //Simple loop
        // for(int i = 0; i < 10; i++) {
        //     System.out.println("Hello there");
        // }


        //Take the num and keep looping
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the num dwag: ");
        int num = sc.nextInt();

        for (int a = 0; a <= num; a++ ) {
            System.out.println(a);
        }


    }
}
