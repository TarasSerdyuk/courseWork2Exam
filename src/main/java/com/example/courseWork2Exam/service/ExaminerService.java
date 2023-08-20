package com.example.courseWork2Exam.service;

import com.example.courseWork2Exam.model.Question;

import java.util.Set;

public interface ExaminerService {
    Set<Question> getQuestions(Integer amount);
}