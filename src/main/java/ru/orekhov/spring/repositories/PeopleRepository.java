package ru.orekhov.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.orekhov.spring.models.Person;

import java.util.Optional;

public interface PeopleRepository extends JpaRepository<Person,Integer> {
    Optional<Person> findByFullName(String fullName);
}
