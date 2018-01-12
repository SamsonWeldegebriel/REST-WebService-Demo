package com.samson.demo.service;

import com.samson.demo.model.Person;
import com.samson.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;
    @Override
    public List<Person> findAllUsers() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public Person findByName(String name) {
        return personRepository.findByName(name);
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }
}
