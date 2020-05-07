package com.jamesmhare.boxofficemanager.repository.person;

import com.jamesmhare.boxofficemanager.model.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findByPersonAccountId(Long personAccountId);
    Person findByFirstNameAndLastName(String firstName, String lastName);

}
