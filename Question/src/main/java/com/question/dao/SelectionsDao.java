package com.question.dao;

import com.question.model.Selections;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SelectionsDao {
     /**
      * 获取对应问题的选项
      * @param questionId
      * @return
      */
     List<Selections> getSelections(int questionId);
}
