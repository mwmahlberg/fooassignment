package edu.cosca451.assignments;


public interface Calculator {

    /**
     * Adds two numbers together.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    int add(int a, int b);

    /**
     * Subtracts one number from another.
     *
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the result of a - b
     */
    int subtract(int a, int b);

    /**
     * Multiplies two numbers together.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    int multiply(int a, int b);

    /**
     * Divides one number by another.
     * A division by zero will throw an ArithmeticException.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a / b
     */
    double divide(int a, int b);
}