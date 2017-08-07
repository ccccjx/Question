package com.question.model;

import java.util.List;
import java.util.Map;

public class TotalQuestion {
    private Title title;
    private List<Selections> selections;

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public List<Selections> getSelections() {
        return selections;
    }

    public void setSelections(List<Selections> selections) {
        this.selections = selections;
    }

    public TotalQuestion(Title title, List<Selections> selections) {
        this.title = title;
        this.selections = selections;
    }

    @Override
    public String toString() {
        return "TotalQuestion{" +
                "title=" + title.toString() +
                ", selections=" + selections.toString() +
                '}';
    }
}
