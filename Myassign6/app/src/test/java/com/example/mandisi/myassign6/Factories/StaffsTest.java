package com.example.mandisi.myassign6.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */
import com.example.mandisi.myassign6.EntityObjects.Staffs;
import com.example.mandisi.myassign6.EntityObjectsFactories.StaffFactory;
import com.example.mandisi.myassign6.EntityObjectsFactories.StaffFactoryImp.StaffFactoryImp;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
/**
 * Created by 211014486 on 4/17/2016.
 */
public class StaffsTest {
    private StaffFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = StaffFactoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Staffs staffs = factory.createStaff("ADMIN", 16, "mandisi");
        Assert.assertEquals(staffs.getName(), "ADMIN");
    }


    @Test
    public void testStudentUpdate() throws Exception {
        Staffs staffs = factory.createStaff("ADMIN", 12, "Blou");
        Assert.assertEquals(staffs.getSID(), "ADMIN");

        // Updated Name

        Staffs updateStaffs = new Staffs.Builder()
                .copy(staffs)
                .name("Ntobs")
                .build();

       // Assert.assertEquals(updateStaffs.getSID(), );
        Assert.assertEquals("Ntobs", updateStaffs.getName());
       // Assert.assertEquals(staffs.getYearOfBirth(), updateStaffs.getYearOfBirth());
    }
}
