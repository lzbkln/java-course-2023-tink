package edu.hw10.task2test;

public class FibCalculatorRealise implements FibCalculator {
    @Override
    public long fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
