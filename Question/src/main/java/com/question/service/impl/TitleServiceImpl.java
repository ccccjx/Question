package com.question.service.impl;

import com.question.dao.TitleDao;
import com.question.model.Title;
import com.question.service.TitleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("TitleService")
public class TitleServiceImpl implements TitleService {

    private Logger logger= LoggerFactory.getLogger(TitleServiceImpl.class);
    @Autowired
    private TitleDao titleDao;

    @Override
    public Title getTitle(int questionId) {
        return titleDao.getTitle(questionId);
    }
    @Override
    public int getTitleNum(){
        return titleDao.getTitleNum();
    };
}
