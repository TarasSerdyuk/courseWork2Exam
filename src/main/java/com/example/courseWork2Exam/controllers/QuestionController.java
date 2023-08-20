package com.example.courseWork2Exam.controllers;

import com.example.courseWork2Exam.service.QuestionService;
import com.example.courseWork2Exam.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class QuestionController {
    final private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.addQuestion(new Question(question, answer));
    }

    @GetMapping("/remove")
    public Question removeQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.removeQuestion(new Question(question, answer));
    }

    @GetMapping
    public Collection<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }
}