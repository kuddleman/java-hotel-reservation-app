package model;

import java.util.regex.Pattern;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;

        if(!isEmailValid(email)) {
            throw new IllegalArgumentException("Must be valid email");
        } else {
            this.email = email;
        }
    }

    public boolean isEmailValid(String email) {
        String extendedRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern pattern = Pattern.compile(extendedRegex, Pattern.CASE_INSENSITIVE);
        return pattern.matcher(email).matches();
    }

    @Override
    public String toString() {
        return "Customer first name: " + firstName + "\n" +
                "last name: " + lastName + "\n" +
                "email: " + email;
    }
}
