package com.example.mandisi.myassign6.Factories;

/**
 * Created by 211014486 on 4/17/2016.
 */
import com.example.mandisi.myassign6.ValuesObjectFactories.QuestionsFactory;
import com.example.mandisi.myassign6.ValuesObjectFactories.QuestionsFatoryImp.QuestionsFatoryImp;
import com.example.mandisi.myassign6.ValuesObjects.Questions;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
/**
 * Created by 211014486 on 4/17/2016.
 */
public class QuestionsTest {
    private QuestionsFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = QuestionsFatoryImp.getInstance();
    }

    @Test
    public void studenttestRoleCreation() throws Exception {
        Questions questions = factory.createQuestions("ADMIN","A","Question1", "Answer1");
        Assert.assertEquals(questions.getQuestionID(), "ADMIN");
    }


    @Test
    public void testResultsUpdate() throws Exception {
        Questions questions = factory.createQuestions("ADMIN","B","Question1", "Answer3");
        Assert.assertEquals(questions.getQuestionID(), "ADMIN");

        // Updated Name
        Questions updateQuestions = new Questions.Builder()
                .copy(questions)
                .questionID("Ntobs")
                .build();

        Assert.assertEquals(updateQuestions.getQuestionID(), "Ntobs");
        //Assert.assertEquals(questions.getQuestionName(), updateQuestions.getQuestionName());
       // Assert.assertEquals(questions.getQuestions(), updateQuestions.getQuestions());
    }
}

