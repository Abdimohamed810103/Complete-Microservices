package org.example;

public record CustomerRegistrationRequest(
         String fname,
         String lname,
         long age
) {
}
