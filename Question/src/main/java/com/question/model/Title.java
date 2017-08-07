package com.question.model;


public class Title {
    int questionId;
    String titleContent;

    public int getTitleId() {
        return questionId;
    }

    public void setTitleId(int titleId) {
        this.questionId = titleId;
    }

    public String getTitleContent() {
        return titleContent;
    }

    public void setTitleContent(String titleContent) {
        this.titleContent = titleContent;
    }

    public Title(int titleId, String titleContent) {
        this.questionId = titleId;
        this.titleContent = titleContent;
    }

    /*
    Mapper 返回的类型，利用的是反射机制，需要无参构造器。
     */
    public Title() {
    }

    @Override
    public String toString() {
        return "Title{" +
                "questionId=" + questionId +
                ", titleContent='" + titleContent + '\'' +
                '}';
    }
}
