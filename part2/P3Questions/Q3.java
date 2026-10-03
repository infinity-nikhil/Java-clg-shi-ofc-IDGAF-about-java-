package part2.P3Questions;
import java.util.Scanner;

//This time the user will tell from where to where
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("From where: ");
        int from = Integer.valueOf(sc.nextLine());
        System.out.print("To where: ");
        int to = sc.nextInt();

        for (int a = from; a <= to; a++) {
            System.out.println(a);
        }

        //How will we do this is while loop ? 
        while(from <= to) {
            System.out.println(from);
            from++;
        }

        while(true) {
            if (from == to)
                break;

            System.out.println(from);
            from++;
        }
    }
}

//Hell yeah all the logic works !!!
