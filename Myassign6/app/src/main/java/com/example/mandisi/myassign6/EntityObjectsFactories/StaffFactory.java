package com.example.mandisi.myassign6.EntityObjectsFactories;

import com.example.mandisi.myassign6.EntityObjects.Staffs;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface StaffFactory {
    Staffs createStaff(String SID, int yearOfBirth, String name);
}
