package com.question.model;

public class Selections {
    private int selectionId;
    private int questionId;
    private String selectionsContent;
    private int count;

    public int getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getSelectionsContent() {
        return selectionsContent;
    }

    public void setSelectionsContent(String selectionsContent) {
        this.selectionsContent = selectionsContent;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Selections{" +
                "selectionId=" + selectionId +
                ", questionId=" + questionId +
                ", selectionsContent='" + selectionsContent + '\'' +
                ", count=" + count +
                '}';
    }
}
