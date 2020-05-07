package com.jamesmhare.boxofficemanager.repository.person;

import com.jamesmhare.boxofficemanager.model.person.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository {

    Employee findByEmployeeId(Long employeeId);
    Employee findByPersonAccountId(Long personAccountId);
    Employee findByFirstNameAndLastName(String firstName, String lastName);

}
