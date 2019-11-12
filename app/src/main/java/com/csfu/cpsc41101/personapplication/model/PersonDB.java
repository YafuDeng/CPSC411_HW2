package com.csfu.cpsc41101.personapplication.model;

import java.util.ArrayList;

public class PersonDB {
    private static final PersonDB ourInstance = new PersonDB();

    protected ArrayList<Person> mPeople;

    static public PersonDB getInstance() {
        return ourInstance;
    }

    private PersonDB() {
        createPersonObjects();
    }

    public ArrayList<Person> getPeople() {
        return mPeople;
    }

    public void setPeople(ArrayList<Person> people) {
        mPeople = people;
    }


    protected void createPersonObjects() {
        // Create James Person object
        Person p = new Person("Tony", "Do", "82018321");
        ArrayList<Course> courses = new ArrayList<Course>();

        courses.add(new Course("CPSC 411", "A"));
        courses.add(new Course("CPSC 471", "B"));
        courses.add(new Course("CPSC 481", "A"));
        courses.add(new Course("CPSC 483", "C"));
        p.setCourses(courses);
        mPeople = new ArrayList<Person>();
        mPeople.add(p);
        // Create Another Person
        p = new Person("Joe", "Smith", "831231");
        courses = new ArrayList<Course>();
        courses.add(new Course("CPSC 353", "A"));
        p.setCourses(courses);
        mPeople.add(p);
        //
        //PersonDB.getInstance().setPeople(personList);
    }

}
