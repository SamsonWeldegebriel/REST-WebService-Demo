package com.samson.demo.service;

import com.samson.demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {
    List<Person> findAllUsers();
    Person findByName(String name);
    void save(Person person);
}
