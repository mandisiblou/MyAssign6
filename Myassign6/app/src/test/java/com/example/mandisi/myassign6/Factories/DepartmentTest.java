package com.example.mandisi.myassign6.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */
import com.example.mandisi.myassign6.ValuesObjectFactories.DepartmentFactory;
import com.example.mandisi.myassign6.ValuesObjectFactories.DepartmentFactoryImp.DepartmentFactoryImp;
import com.example.mandisi.myassign6.ValuesObjects.Department;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
/**
 * Created by 211014486 on 4/17/2016.
 */
public class DepartmentTest {
    private DepartmentFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = DepartmentFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Department department = factory.createDepartment("211", "A");
        Assert.assertEquals(department.getSID(), "ADMIN");
    }


    @Test
    public void testResultsUpdate() throws Exception {
        Department department = factory.createDepartment("210", "B");
        Assert.assertEquals(department.getSID(), department.getName());

        // Updated Name
        Department updateDepartment = new Department.Builder()
                .copy(department)
                .SID("Ntobs")
                .build();

        Assert.assertEquals(updateDepartment, "Ntobs");
        Assert.assertEquals(department.getName(), updateDepartment.getName());
    }
}
