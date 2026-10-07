package part2;
import java.util.Scanner;

//WAP such that user gives the num and the statement gets printed that many times 
public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the num dwag");
        int num = sc.nextInt();

        for (int a = 0; a <= num; a++) {
            task();
        }

    }

    public static void task() {
        System.out.println("This is how we use a function ");
    }
}
