package com.question.service.impl;

import com.question.dao.SelectionsDao;
import com.question.model.Selections;
import com.question.service.SelectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("SelectionsService")
public class SelectionsServiceImpl implements SelectionsService{
    @Autowired
    private SelectionsDao selectionDao;
    @Override
    public List<Selections> getSelections(int questionId) {
        return selectionDao.getSelections(questionId);
    }
}
