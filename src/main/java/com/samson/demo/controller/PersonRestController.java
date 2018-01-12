package com.samson.demo.controller;

import com.samson.demo.model.Person;
import com.samson.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonRestController {

    @Autowired
    PersonService personService;


    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public @ResponseBody List<Person> listPersons(){
        return personService.findAllUsers();
    }


    @RequestMapping(value = "/person/{name}", method = RequestMethod.GET)
    public @ResponseBody Person getPerson(@PathVariable String name){
        return personService.findByName(name);
    }

    @RequestMapping(value = "/person/add", method = RequestMethod.POST)
    public @ResponseBody String saveUser(@RequestBody Person person){
        personService.save(person);
        return "Successfully saved";
    }
}
