package edu.eci.arcn.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for FizzBuzz following TDD (Red-Green-Refactor) cycle.
 *
 * @author Jesús Pinzón
 * @version 1.5
 * @since 2026-02-21
 */
class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void testFizzBuzzShouldReturnNumberAsStringForNonMultiples() {
        // Arrange
        List<Integer> inputs = List.of(1, 2, 4, 7, 11, 13);

        // Act & Assert
        for (int input : inputs) {
            assertEquals(String.valueOf(input), this.fizzBuzz.fizzbuzz(input));
        }
    }

    @Test
    void testFizzBuzzShouldReturnFizzForMultiplesOf3() {
        // Arrange
        List<Integer> inputs = List.of(3, 6, 9, -3);

        // Act & Assert
        for (int input : inputs) {
            assertEquals("Fizz", this.fizzBuzz.fizzbuzz(input));
        }
    }

    @Test
    void testFizzBuzzShouldReturnBuzzForMultiplesOf5() {
        // Arrange
        List<Integer> inputs = List.of(5, 25, 1000, -5);

        // Act & Assert
        for (int input : inputs) {
            assertEquals("Buzz", this.fizzBuzz.fizzbuzz(input));
        }
    }

    @Test
    void testFizzBuzzShouldReturnFizzBuzzForMultiplesOf3And5() {
        // Arrange
        List<Integer> inputs = List.of(0, 15, 30, 45, -15);

        // Act & Assert
        for (int input : inputs) {
            assertEquals("FizzBuzz", this.fizzBuzz.fizzbuzz(input));
        }
    }
}