package com.example.courseWork2Exam.service;

import com.example.courseWork2Exam.exceptions.AmountBiggerThanQuestionsSet;
import com.example.courseWork2Exam.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class ExaminerServiceTest {
    private ExaminerService examinerService;
    private QuestionService questionService;

    @BeforeEach
    public void setUp() {
        questionService = Mockito.mock(QuestionService.class);
        Mockito.when(questionService.getAllQuestions()).thenReturn(questionList());
        Mockito.when(questionService.getRandomQuestion())
                .thenReturn(questionList().get(0))
                .thenReturn(questionList().get(2));

        examinerService = new ExaminerServiceImpl(questionService);
    }

    private List<Question> questionList() {
        return List.of(new Question("Question 1", "Answer 1"),
                new Question("Question 2", "Answer 2"),
                new Question("Question 3", "Answer 3"));
    }
    @Test
    void shouldReturn2QuestionsWhileAmountEquals2() {
        //Assertions.assertTrue(examinerService.getQuestions(2).size() == 2);
        Assertions.assertEquals(2, examinerService.getQuestions(2).size());
    }

    @Test
    void shouldThrowExceptionWhenAmountBiggerThanQuestionListSize() {
        Assertions.assertThrows(AmountBiggerThanQuestionsSet.class, () ->
                examinerService.getQuestions(4));
    }

}