package callbacks;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Marin", null, valueFirstName-> {
            System.out.println("last name is not provided for: " + valueFirstName);
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callbackExample) {
        System.out.println(firstName);

        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callbackExample.accept(firstName);
        }
    }
}
