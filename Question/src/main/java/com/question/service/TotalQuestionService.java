package com.question.service;


import com.question.model.TotalQuestion;



public interface TotalQuestionService {
    TotalQuestion getTotalQuestion(int questionId);
    int getQuestionLength();

}
