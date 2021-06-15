package com.mytests.springboot.webapp.defaults.thymeleaf.defaultthymeleaftest3;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 11/25/2019.
 * Project: freemarker-2-3-29-test
 * *******************************
 */
public class Person {
    Integer id;
    String name;
    Integer age;
    boolean unemployed;

    public Person(Integer id, String name, Integer age, boolean unemployed) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.unemployed = unemployed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isUnemployed() {
        return unemployed;
    }

    public void setUnemployed(boolean unemployed) {
        this.unemployed = unemployed;
    }
}
