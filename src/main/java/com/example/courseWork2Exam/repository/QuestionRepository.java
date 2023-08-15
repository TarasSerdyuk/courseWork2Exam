package com.example.courseWork2Exam.repository;

import com.example.courseWork2Exam.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question addQuestion(Question question);
    Question removeQuestion(Question question);
    Collection<Question> getAllQuestions();
}