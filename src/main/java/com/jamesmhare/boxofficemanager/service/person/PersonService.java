package com.jamesmhare.boxofficemanager.service.person;

import com.jamesmhare.boxofficemanager.model.person.Person;
import com.jamesmhare.boxofficemanager.repository.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person findByPersonAccountId(Long personAccountId) {
        return personRepository.findByPersonAccountId(personAccountId);
    }

    public Person findByFirstNameAndLastName(String firstName, String lastName) {
        return personRepository.findByFirstNameAndLastName(firstName, lastName);
    }

}
