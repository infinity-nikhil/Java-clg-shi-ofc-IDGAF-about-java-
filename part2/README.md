### Till now we know this much: 
```
// Making the scanner available in the program
import java.util.Scanner;

public class Program {
    public static void main(String[] main) {
        // Creating the scanner
        Scanner reader = new Scanner(System.in);

        // Examples of reading different types of user input
        String text = reader.nextLine();
        int number = Integer.valueOf(reader.nextLine());
        double numberWithDecimals = Double.valueOf(reader.nextLine());
        boolean trueOrFalse = Boolean.valueOf(reader.nextLine());

    }
}
```

And some conditional based question 

### For square root we use 
Math.sqrt(number) 
### For Pi we use 
Math.pi
### For power of a number we use 
Math.pow(number, the power we want)

## Loops
While true then keep executing 
2 ways to break out the condition becomes false itself or we internally break the loop by adding a break in a if statement  

### Here are some shit ideas: don't code but a map should be in mind ki how the code would work and you can code this easily 
Q1) Write a program that reads values from the user until they input a 0. After this, the program prints the total number of inputted values. The zero that's used to exit the loop should not be included in the total number count.

Q2)Write a program that reads values from the user until they input a 0. After this, the program prints the total number of inputted values that are negative. The zero that's used to exit the loop should not be included in the total number count.

Q3)Write a program that reads numbers from the user until the user inputs a number 0. After this the program outputs the sum of the numbers. The number zero does not need to be added to the sum, even if it does not change the results.
(just like the mapping we did in solidity)

Q4)Write a program that asks the user for input until the user inputs 0. After this the program prints the amount of numbers inputted and the sum of the numbers. The number zero does not need to be added to the sum, but adding it does not change the results

Q5)Write a program that asks the user for input until the user inputs 0. After this, the program prints the average of the numbers. The number zero does not need to be counted to the average. You may assume that the user inputs at least one number.

Q6)Write a program that asks the user for input until the user inputs 0. After this, the program prints the average of the positive numbers (numbers that are greater than zero).

If no positive number is inputted, the program prints "Cannot calculate the average"