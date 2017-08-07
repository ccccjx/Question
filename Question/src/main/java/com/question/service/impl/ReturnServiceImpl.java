package com.question.service.impl;

import com.question.dao.ReturnDao;
import com.question.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ReturnService")
public class ReturnServiceImpl implements ReturnService {
    @Autowired
    private ReturnDao returnDao;
    @Override
    public void updateSelectionCount(int selectionId) {
         returnDao.updateSelectionCount(selectionId);
    }
}
