package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        // Takes one 1 argument and produces 1 result
        int incrementResult = increment(1);
        System.out.println(incrementResult);

        // apply takes the argument
        int incremet2 = incrementByOneFunction.apply(1);
        System.out.println(incremet2);

        int multiplyFunctionBy10 = multipleBy10Function.apply(incrementResult);
        System.out.println(multiplyFunctionBy10);

        Function<Integer, Integer> addBy1ThenMultipleBy10 =incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(addBy1ThenMultipleBy10.apply(4));

        // BiFunction takes 2 arguments and produces 1 result
        // Normal function
        System.out.println(incrementByOneAndMultiple(4, 100));
        // Uses BifFunction
        System.out.println(incrementByOneAndMultipleBiFunction.apply(4, 100));

    }

    // The same as the example below
    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;

    static Function<Integer, Integer> multipleBy10Function = number -> number*10;

    static int increment(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultipleBiFunction =
        (numberToIncrementByOne, multipleNumberBy) -> (numberToIncrementByOne + 1) * multipleNumberBy;

    static int incrementByOneAndMultiple(int number, int multiplicationNumber) {
        return (number + 1) * multiplicationNumber;
    }

}
