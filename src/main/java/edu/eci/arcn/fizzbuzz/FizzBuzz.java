package edu.eci.arcn.fizzbuzz;


/**
 * FizzBuzz business logic.
 *
 * Rules:
 *
 *   Multiple of 3 AND 5 → "FizzBuzz"
 *   Multiple of 3 only  → "Fizz"
 *   Multiple of 5 only  → "Buzz"
 *   Otherwise           → number as string
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-21
 */
public class FizzBuzz {

    /**
     * Evaluates FizzBuzz rules for a given integer.
     *
     * @param n the integer to evaluate
     * @return "FizzBuzz", "Fizz", "Buzz", or the number as a String
     */
    public String fizzbuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
        if (n % 3 == 0)               return "Fizz";
        if (n % 5 == 0)               return "Buzz";
        return String.valueOf(n);
    }
}