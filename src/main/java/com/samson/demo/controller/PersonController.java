package com.samson.demo.controller;

import com.samson.demo.model.Person;
import com.samson.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public @ResponseBody
    List<Person> listPersons(){
        return personService.findAllUsers();
    }

}
