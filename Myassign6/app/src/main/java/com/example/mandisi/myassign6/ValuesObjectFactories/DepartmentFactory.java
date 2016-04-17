package com.example.mandisi.myassign6.ValuesObjectFactories;

import com.example.mandisi.myassign6.ValuesObjects.Department;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface DepartmentFactory {
    Department createDepartment(String SID, String name);
}
