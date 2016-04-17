package com.example.mandisi.myassign6.Factories;

import com.example.mandisi.myassign6.EntityObjects.Person;
import com.example.mandisi.myassign6.EntityObjectsFactories.PersonFactory;
import com.example.mandisi.myassign6.EntityObjectsFactories.PersonFactoryImp.PersonFactoryImp;
import com.example.mandisi.myassign6.EntityObjectsFactories.StudentFactoryImp.StudentFactoryImp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by 211014486 on 4/17/2016.
 */
public class PersonTest {
    private PersonFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = PersonFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Person person = factory.createPerson("211", "mandisi", 32);
        Assert.assertEquals(person.getName(), "ADMIN");
    }


    @Test
    public void testStudentUpdate() throws Exception {
        Person person = factory.createPerson("213", "Blou", 24);
        Assert.assertEquals(person.getId(), person.getYearOfBirth(), person.getName());

        // Updated Name

        Person updatePerson = new Person.Builder()
                .copy(person)
                .name("Ntobs")
                .build();

        Assert.assertEquals(updatePerson.getId(), "Ntobs");
        Assert.assertEquals(person.getName(), updatePerson.getName());
        Assert.assertEquals(person.getYearOfBirth(), updatePerson.getYearOfBirth());
    }
}