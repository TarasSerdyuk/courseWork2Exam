package com.example.courseWork2Exam.controllers;

import com.example.courseWork2Exam.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.courseWork2Exam.service.ExaminerService;
import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExaminerController {
    private final ExaminerService examinerService;

    public ExaminerController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping("/getAll/{amount}")
    public Collection<Question> getAllQuestions(@PathVariable Integer amount) {
        return examinerService.getQuestions(amount);
    }
}