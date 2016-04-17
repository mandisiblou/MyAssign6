package com.example.mandisi.myassign6;

/**
 * Created by 211014486 on 4/17/2016.
 */

import com.example.mandisi.myassign6.Factories.AddrecTest;
import com.example.mandisi.myassign6.Factories.CodeTest;
import com.example.mandisi.myassign6.Factories.DepartmentTest;
import com.example.mandisi.myassign6.Factories.PersonTest;
import com.example.mandisi.myassign6.Factories.QuestionsTest;
import com.example.mandisi.myassign6.Factories.ResultsTest;
import com.example.mandisi.myassign6.Factories.StaffsTest;
import com.example.mandisi.myassign6.Factories.StudentTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
// Runs all unit tests.
@RunWith(Suite.class)
@Suite.SuiteClasses({
        StudentTest.class,
        PersonTest.class,
        ResultsTest.class,
        QuestionsTest.class,
        AddrecTest.class,
        DepartmentTest.class,
        CodeTest.class,
        StaffsTest.class})
public class AppUnitTestSuite {}
