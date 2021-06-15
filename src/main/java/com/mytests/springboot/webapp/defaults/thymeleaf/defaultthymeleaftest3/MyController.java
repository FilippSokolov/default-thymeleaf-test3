package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest3;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 8/14/2017.
 * Project: default-thymeleaf-test0
 * *******************************
 */
@Controller
public class MyController {

    @RequestMapping("/")
    public String Method(ModelMap model) {
        model.addAttribute("home_attr1", "test0");
        model.addAttribute("home_attr2", "this is default thymeleaf configuration test!");
        List<Person> persons = getPeople();
        model.addAttribute("persons", persons);
        return "home";
    }

    @ModelAttribute("pa1")
    public Person[] personsArray1(){
        return getPeople().toArray(new Person[0]);
    }
    private List<Person> getPeople() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1,"vasya",15,true)) ;
        persons.add(new Person(2,"masha",10,true)) ;
        persons.add(new Person(3,"sasha",40,false)) ;
        persons.add(new Person(4,"dasha",40,false)) ;
        persons.add(new Person(5,"petya",30,true)) ;
        persons.add(new Person(6,"ivan",75,true)) ;
        persons.add(new Person(7,"katya",20,true)) ;
        return persons;
    }
}
