package com.mycompany.app.service;
 
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.mycompany.app.model.Employee;
import com.mycompany.app.repository.EmployeeRepository;
import com.mycompany.app.utility.EmployeeRegistrationRequest;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository; 

    public void registerEmployee(EmployeeRegistrationRequest request) {
        Employee employee = Employee.builder()
                .name(request.name())
                .department(request.department())
                .salary(request.salary())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        employeeRepository.saveAndFlush(employee);
 
    }
}
