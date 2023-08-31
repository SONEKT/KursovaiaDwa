package com.example.KursovaiaDwa.service;

import com.example.KursovaiaDwa.dto.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
