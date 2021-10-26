import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        return (int)(Math.random() *11) + 10;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        int x = randomTeen();
        int y = randomTeen();
        int z = randomTeen();
        System.out.println(Mathey.max(x,y,z));
        System.out.println(Math.min(x, Math.min(y,z)));

        System.out.println("max");
        System.out.println(Mathey.max(1, 2));   // should be 2
        System.out.println("max");
        System.out.println(Mathey.max(1.2, 4.0));   // should be 4.0
        System.out.println("max");
        System.out.println(Mathey.max(1, 4, 2));   // should be 4
        System.out.println("max");
        System.out.println(Mathey.max(1.0, 4.25, 1.3, 2.1));   // should be 4.25
        System.out.println("randomInteger");
        System.out.println(Mathey.randomInteger(1, 4));   // should be between 1 and 4
        System.out.println("randomInteger");
        System.out.println(Mathey.randomInteger(5));   // should be between 0 and 5
        System.out.println("pow");
        System.out.println(Mathey.pow(2, 5));   // should be 32
        System.out.println("abs");
        System.out.println(Mathey.abs(-2));   // should be 2
        System.out.println("round");
        System.out.println(Mathey.round(2.4));   // should be 2
        System.out.println("floor");
        System.out.println(Mathey.floor(2.8));   // should be 2
        System.out.println("ceil");
        System.out.println(Mathey.ceil(1.01));   // should be 2

        int a = 5;
        int b = 12;
        int c = Mathey.pow(a,2) + Mathey.pow(b,2);
        double result = Mathey.sqrt(c);
        result = (int) (result);
        System.out.println(result);
        // should be 13






//         // Uncomment this code later!
//         System.out.println("Mathey.max tests");
//         System.out.println(Mathey.max(1, 2)); // 2
//         System.out.println(Mathey.max(2, 1)); // 2
    }

}


