package com.question.service.impl;

import com.question.dao.SelectionsDao;
import com.question.dao.TitleDao;
import com.question.model.TotalQuestion;
import com.question.service.TotalQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("TotalQuestionService")
public class TotalQuestionServiceImpl implements TotalQuestionService {

    @Autowired
    private TitleDao titleDao;
    @Autowired
    private SelectionsDao selectionsDao;

    @Override
    public TotalQuestion getTotalQuestion(int questionId) {
        TotalQuestion totalQuestion=new TotalQuestion(titleDao.getTitle(questionId),selectionsDao.getSelections(questionId));
        return totalQuestion;
    }
    @Override
    public int getQuestionLength(){
        return titleDao.getTitleNum();
    };
}
