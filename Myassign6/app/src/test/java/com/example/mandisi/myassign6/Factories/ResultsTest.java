package com.example.mandisi.myassign6.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */
import com.example.mandisi.myassign6.EventsObjectFactories.ResultsFactory;
import com.example.mandisi.myassign6.EventsObjectFactories.ResultsFatoryImp.ResultsFatoryImp;
import com.example.mandisi.myassign6.EventsObjects.Results;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
/**
 * Created by 211014486 on 4/17/2016.
 */
public class ResultsTest {
    private ResultsFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = ResultsFatoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Results results = factory.createQuestions("211","A","Question1", "Answer1");
        Assert.assertEquals(results.getResultsID(), "ADMIN");
    }


    @Test
    public void testResultsUpdate() throws Exception {
        Results results = factory.createQuestions("210","B","Question1", "Answer3");
        Assert.assertEquals(results.getResultsID(), results.getQuestionName(), results.getQuestions());

        // Updated Name
        Results updateResults = new Results.Builder()
                .copy(results)
                .resultsID("Ntobs")
                .build();

        Assert.assertEquals(updateResults.getResultsID(), "Ntobs");
        Assert.assertEquals(results.getQuestionName(), updateResults.getQuestionName());
        Assert.assertEquals(results.getQuestions(), updateResults.getQuestions());
    }
}

