package com.example.KursovaiaDwa.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST,
        reason = "Недостаточно Вопросов в библиотеке")
public class NotEnoughQuestions extends RuntimeException {
}
