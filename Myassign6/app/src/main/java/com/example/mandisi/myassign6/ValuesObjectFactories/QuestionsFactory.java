package com.example.mandisi.myassign6.ValuesObjectFactories;

import com.example.mandisi.myassign6.ValuesObjects.Questions;

/**
 * Created by 211014486 on 4/17/2016.
 */
public interface QuestionsFactory {
    Questions createQuestions(String questionID, String questionName, String questions, String corrects);
}