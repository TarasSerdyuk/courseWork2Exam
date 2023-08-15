package com.example.courseWork2Exam.service;

import com.example.courseWork2Exam.model.Question;

import java.util.Collection;

public interface QuestionService {

    Question addQuestion(Question question);

    Question removeQuestion(Question question);

    Collection<Question> getAllQuestions();

    Question getRandomQuestion();
}