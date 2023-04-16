package com.mycompany.app.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.app.service.EmployeeService;
import com.mycompany.app.utility.EmployeeRegistrationRequest;

@Slf4j
@RestController
@RequestMapping("employee")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public void registerEmployee(@RequestBody EmployeeRegistrationRequest employeeRegistrationRequest) {
        log.info("new employee registration {}", employeeRegistrationRequest);
        employeeService.registerEmployee(employeeRegistrationRequest);
    }
}
