package com.example.mandisi.myassign6.EntityObjectsFactories;

import com.example.mandisi.myassign6.EntityObjects.Person;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface PersonFactory {
    Person createPerson(String id, String name, int yearOfBirth);
}
