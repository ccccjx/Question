package com.question.service;



import com.question.model.Title;



public interface TitleService {
    Title getTitle(int questionId);
    int getTitleNum();
}
