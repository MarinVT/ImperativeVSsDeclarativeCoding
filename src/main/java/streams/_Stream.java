package streams;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Marin", Gender.MALE),
                new Person("Lisa Ann", Gender.FEMALE),
                new Person("Marin2", Gender.MALE),
                new Person("Brandi Love", Gender.FEMALE),
                new Person("Marin4", Gender.MALE),
                new Person("Marin4", Gender.PREFER_NOT_TO_SAY)
        );

//        people.stream()
//                .map(person -> person.name)
//                .collect(Collectors.toSet())
//                .forEach(gender -> System.out.println(gender));
        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

        boolean containsOnlyFemales = people.stream()
                .allMatch(personPredicate);

        System.out.println(containsOnlyFemales);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
