package com.example.mandisi.myassign6.Factories;

import com.example.mandisi.myassign6.EntityObjects.Students;

import com.example.mandisi.myassign6.EntityObjectsFactories.StudentFactory;
import com.example.mandisi.myassign6.EntityObjectsFactories.StudentFactoryImp.StudentFactoryImp;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
/**
 * Created by 211014486 on 4/17/2016.
 */
public class StudentTest {
    private StudentFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = StudentFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Students student = factory.createStudents("ADMIN", 16, "mandisi");
        Assert.assertEquals(student.getName(), "ADMIN");
    }


    @Test
    public void testStudentUpdate() throws Exception {
        Students students = factory.createStudents("ADMIN", 12, "Blou");
        Assert.assertEquals(students.getSID(), "ADMIN");

        // Updated Name

        Students updateStudent = new Students.Builder()
                .copy(students)
                .name("Ntobs")
                .build();

        //Assert.assertEquals(updateStudent.getSID(), );
        Assert.assertEquals("Ntobs", updateStudent.getName());
        //Assert.assertEquals(students.getYearOfBirth(), updateStudent.getYearOfBirth());
    }
}
