package com.example.courseWork2Exam.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionAlreadyAddedException extends RuntimeException {
    public QuestionAlreadyAddedException() {
    }

    public QuestionAlreadyAddedException(String message) {
        super(message);
    }

    public QuestionAlreadyAddedException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionAlreadyAddedException(Throwable cause) {
        super(cause);
    }
}