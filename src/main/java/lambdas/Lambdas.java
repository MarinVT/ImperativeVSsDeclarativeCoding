package lambdas;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        // Example one with no extra logic
        Function<String, String> upperCaseName = String::toUpperCase;

        // Example one with extra logic
        Function<String, String> notBlankAndUpperCase = name -> {
            // Logic
            if (name.isBlank()) throw new IllegalStateException("");
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> notBlankAndUpperCaseVer2 = (name, age) -> {
            // First argument -> name; Second -> age; Third -> return type

            if (name.isBlank()) throw new IllegalStateException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        String resultUpperCaseNameAndAge = notBlankAndUpperCaseVer2.apply("Marin123", 100);
        System.out.println(resultUpperCaseNameAndAge);
    }
}
