package com.question.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface ReturnDao {
    /**
     * 更新选项被选中的次数
     * @param selectionId
     */
    public void updateSelectionCount(int selectionId);
}
