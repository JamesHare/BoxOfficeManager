package com.jamesmhare.boxofficemanager.service.person;

import com.jamesmhare.boxofficemanager.model.person.Employee;
import com.jamesmhare.boxofficemanager.repository.person.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee findByEmployeeId(Long employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

    public Employee findByPersonAccountId(Long personAccountId) {
        return employeeRepository.findByPersonAccountId(personAccountId);
    }

    public Employee findByFirstNameAndLastName(String firstName, String lastName) {
        return employeeRepository.findByFirstNameAndLastName(firstName, lastName);
    }
}
