package part2;
//In this one we will declare how to declare a function and call the function 

public class P4 {
    public static void main(String[] args) {
        // program code
        System.out.println("Let`s try if we can travel to the method world:");
        greet();

        System.out.println("Looks like we can, let`s try again::");
        greet();
        greet();
        greet();
    }

    //declare the function 
    public static void greet() {
        System.out.println("Greetings from the method world!");
    }
}