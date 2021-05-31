package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Consumer - Represents an operation that accepts a single argument and returns no result
        // Normal approach
        Customer customer1Marin = new Customer("Marin1", "08781231231");
        greetCustomerV2(customer1Marin, true);
        greetCustomer(customer1Marin);
        // Consumer approach
        greetCustomerConsumer.accept(customer1Marin);
        greetCustomerConsumerV2.accept(customer1Marin, false);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName
                    + ", thanks for registered phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "*******") + " -> BiConsumer approach");

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName
                    + ", thanks for registered phone number "
                    + customer.customerPhoneNumber + " -> Consumer approach");

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registered phone number "
                + customer.customerPhoneNumber + " -> Normal function approach");
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registered phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "*******") + " -> Normal function approach");
    }


    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
