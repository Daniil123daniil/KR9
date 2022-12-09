package com.company.Question;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private String question;
    private List<String> answers;
    private int number_answer;

    public Question(String question, List<String> answers, int number_answer) {
        this.question = question;
        this.answers = answers;
        this.number_answer = number_answer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public int getNumber_answer() {
        return number_answer;
    }
}
