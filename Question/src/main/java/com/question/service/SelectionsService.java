package com.question.service;

import com.question.model.Selections;

import java.util.List;

public interface SelectionsService {
    List<Selections> getSelections(int questionId);
}
