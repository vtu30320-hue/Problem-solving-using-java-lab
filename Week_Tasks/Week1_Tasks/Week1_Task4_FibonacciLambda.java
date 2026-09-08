<<<<<<<< HEAD:Week_Tasks/Week1_Tasks/Week1_Task4_FibonacciLambda.java
import java.util.stream.Stream;
public class Week1_Task4_FibonacciLambda {
    public static void main(String[] args) {
        int n = 10; // Find the 10th Fibonacci number
        
        long nthFibonacci = Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(n + 1)                  // Limit stream size to target index
                .reduce((first, second) -> second) // Keep skipping to get the last element
                .map(f -> f[0])                // Extract the final value
                .orElse(0L);

        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);
    }
}
========
import java.util.stream.Stream;
public class FibonacciLambda {
    public static void main(String[] args) {
        int n = 10; // Find the 10th Fibonacci number
        
        long nthFibonacci = Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(n + 1)                  // Limit stream size to target index
                .reduce((first, second) -> second) // Keep skipping to get the last element
                .map(f -> f[0])                // Extract the final value
                .orElse(0L);

        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);
    }
}
>>>>>>>> origin/main:week1-codes/FibonacciLambda.java
