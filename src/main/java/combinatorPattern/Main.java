package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Marin1",
                "marin1abv.bg",
                "+1223123",
                LocalDate.of(1999, 1, 2)
        );

        // If valid we can store customer in db
//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        System.out.println(validatorService.isValid(customer));

        // Using combinator patern
        ValidationResult resultCustomer = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(resultCustomer);

        if (resultCustomer != ValidationResult.SUCCESS) {
            throw new IllegalStateException(resultCustomer.name());
        }
    }

}
