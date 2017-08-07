package com.question.dao;

import com.question.model.Title;
import org.springframework.stereotype.Repository;


@Repository
public interface TitleDao {
     /**
      * 获取对应问题id的题目
      * @param questionId
      * @return
      */
     Title getTitle(int questionId);

     /**
      * 获取题目总数
      * @return
      */
     int getTitleNum();
}
