//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        int fib = Integer.parseInt(scan.nextLine());

        //call methods and print
        FibIteration iteration = new FibIteration();
        FibFormula formula = new FibFormula();
        System.out.println("Fib of " + fib + " by iteration is: " + iteration.calculate_fib(fib));
        System.out.println("Fib of " + fib + " by formula is: " + formula.calculate_fib(fib));
    }
}
