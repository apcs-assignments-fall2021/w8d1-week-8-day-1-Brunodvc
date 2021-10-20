// import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {
    public static void main(String[] args) {
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

    }
}
