package com.example.courseWork2Exam.service;

import com.example.courseWork2Exam.exceptions.AmountBiggerThanQuestionsSet;
import com.example.courseWork2Exam.model.Question;

import java.util.Set;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }
    @Override
    public Set<Question> getQuestions(Integer amount) {
        if (amount > questionService.getAllQuestions().size()) {
            throw new AmountBiggerThanQuestionsSet();
        }
        Set<Question> questionSet = new HashSet<>();
        while (questionSet.size() < amount) {

            questionSet.add(questionService.getRandomQuestion());
        }
        return questionSet;
    }
}