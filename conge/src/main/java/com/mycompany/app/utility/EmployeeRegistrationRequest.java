package com.mycompany.app.utility;

public record EmployeeRegistrationRequest(
        String name,
        String department,
        Double salary) {
}
