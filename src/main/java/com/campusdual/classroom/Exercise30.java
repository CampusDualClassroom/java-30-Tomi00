package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        return (int) ( dividend / divisor);
    }


    public static void main(String[] args) {
        try {
            System.out.println("Result: " + divisionWithCustomException(10, 0));
        } catch (DivisionByZeroException e) {
            System.out.println("Exception caught and handled: " + e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}
