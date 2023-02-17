//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.lang.Math;
public class FibFormula implements FindFib{

    @Override
    public int calculate_fib(int fib) {

        return (int)((Math.pow(((1+Math.sqrt(5))/2), fib)-(Math.pow(((1-Math.sqrt(5))/2), fib)))/Math.sqrt(5));
    }
}
