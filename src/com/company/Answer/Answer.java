package com.company.Answer;

import com.company.Question.Question;

public class Answer {

    Question question;
    private int my_answer;

    public Answer(Question question, int my_answer) {
        this.question = question;
        this.my_answer = my_answer;
    }

    @Override
    public String toString() {
        return "Вопрос: " + question.getQuestion() + '\n' +
                "Ваш ответ: " + my_answer + '\n' +
                "Правильный ответ: " + question.getNumber_answer();
    }

    public String a() {
        return question.getQuestion();
    }
}
