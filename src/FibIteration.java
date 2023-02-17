//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.lang.Math;
public class FibIteration implements FindFib{

    @Override
    public int calculate_fib(int fib) {
        if (fib == 1 || fib == 2) {
            return 1;
        }
        else {
            int first = 1, second = 1, solution = 1;
            for (int i = 2; i < fib; i++) {
                first = second;
                second = solution;
                solution = (first + second);
            }
            return solution;
        }
    }
}
