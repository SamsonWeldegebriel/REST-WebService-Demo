package com.samson.demo.repository;

import com.samson.demo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{

    Person findByName(String name);


}
