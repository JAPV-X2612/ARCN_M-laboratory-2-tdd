package edu.eci.arcn.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for FizzBuzz.java file following TDD (Red-Green-Refactor) cycle.
 *
 * Methodology: Tests are written BEFORE the implementation.
 * Each test drives the minimum necessary production code.
 *
 * @author Jesús Pinzón
 * @version 1.0
 * @since 2026-02-21
 */
class FizzBuzzTest {

    @BeforeEach
    void setUp() {
        FizzBuzz fizzBuzz = new FizzBuzz();
    }

    @Test
    void testFizzBuzzShouldReturnNumberFor1() {
        // Arrange
        int input = 1;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("1", result);
    }

    @Test
    void testFizzBuzzShouldReturnNumberFor2() {
        // Arrange
        int input = 2;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("2", result);
    }

    @Test
    void testFizzBuzzShouldReturnNumberFor7() {
        // Arrange
        int input = 7;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("7", result);
    }

    @Test
    void testFizzBuzzShouldReturnFizzForMultipleOf3() {
        // Arrange
        int input = 3;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Fizz", result);
    }

    @Test
    void testFizzBuzzShouldReturnFizzFor9() {
        // Arrange
        int input = 9;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Fizz", result);
    }

    @Test
    void testFizzBuzzShouldNotReturnFizzForNonMultipleOf3() {
        // Arrange
        int input = 4;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("4", result);
    }

    @Test
    void testFizzBuzzShouldReturnBuzzForMultipleOf5() {
        // Arrange
        int input = 5;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Buzz", result);
    }

    @Test
    void testFizzBuzzShouldReturnBuzzFor25() {
        // Arrange
        int input = 25;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Buzz", result);
    }

    @Test
    void testFizzBuzzShouldNotReturnBuzzForNonMultipleOf5() {
        // Arrange
        int input = 7;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("7", result);
    }

    @Test
    void testFizzBuzzShouldReturnFizzBuzzForMultipleOf15() {
        // Arrange
        int input = 15;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    void testFizzBuzzShouldReturnFizzBuzzFor30() {
        // Arrange
        int input = 30;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    void testFizzBuzzShouldReturnFizzBuzzFor0() {
        // Arrange
        int input = 0;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("FizzBuzz", result);
    }

    @Test
    void testFizzBuzzShouldReturnFizzForNegativeMultipleOf3() {
        // Arrange
        int input = -3;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Fizz", result);
    }

    @Test
    void testFizzBuzzShouldReturnBuzzForNegativeMultipleOf5() {
        // Arrange
        int input = -5;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Buzz", result);
    }

    @Test
    void testFizzBuzzShouldReturnBuzzFor1000() {
        // Arrange
        int input = 1000;

        // Act
        String result = FizzBuzz.fizzbuzz(input);

        // Assert
        assertEquals("Buzz", result);
    }
}