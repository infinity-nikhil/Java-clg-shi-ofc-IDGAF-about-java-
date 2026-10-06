package part2;
import java.util.Scanner;

//mplement a program which calculates the factorial of a number given by the user.

/*
Basic logic --> same as the sum of series a mul var, a count and a num
while count <= num 
    mul *= count 
    count++;

for count = 1; count <= 1; count++
    mul *= count;
*/
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
            "Give the number: "
        );
        int num = sc.nextInt();
        int mul = 1;

        for (int count = 1; count <= num; count ++) {
            mul *= count;
        }

        System.out.println(mul);

    }
}
