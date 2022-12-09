package com.company.Main;

import com.company.Answer.Answer;
import com.company.Question.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<Answer> answers = new ArrayList<>();
        ArrayList<String> wrong_answer = new ArrayList<>();

        questions.add(0, new Question("Что такое конструктор у класса?",
                Arrays.asList("1. метод, который вызывается при создании экземпляра объекта",
                        "2. специальная переменная класса", "3. объект класса"), 1));

        questions.add(1, new Question("Если у класса в теле не объявлен конструктор тогда",
                Arrays.asList("1. у данного класса автоматически создается конструктор по умолчанию",
                        "2. нельзя создать объект этого класса", "3. код не скомпилируется"), 1));

        questions.add(2, new Question("Сколько конструкторов может быть у класса?",
                Arrays.asList("1. неограниченное количество",
                        "2. только один", "3. не более пяти"), 1));

        questions.add(3, new Question("Переменные в классе инициализируется",
                Arrays.asList("1. в порядке их объявления",
                        "2. все одновременно", "3. в случайном порядке"), 1));


        questions.add(4, new Question("Для каких целей служат методы get и set",
                Arrays.asList("1. чтобы другие классы могли корректно получать или менять данные внутри объектов вашего класса",
                        "2. это специальные конструкторы класса"), 1));

        System.out.println(questions.get(0).getQuestion());
        System.out.println(questions.get(0).getAnswers().get(0));
        System.out.println(questions.get(0).getAnswers().get(1));
        System.out.println(questions.get(0).getAnswers().get(2));

        int my_answer1 = scanner.nextInt();

        System.out.println(questions.get(1).getQuestion());
        System.out.println(questions.get(1).getAnswers().get(0));
        System.out.println(questions.get(1).getAnswers().get(1));
        System.out.println(questions.get(1).getAnswers().get(2));

        int my_answer2 = scanner.nextInt();

        System.out.println(questions.get(2).getQuestion());
        System.out.println(questions.get(2).getAnswers().get(0));
        System.out.println(questions.get(2).getAnswers().get(1));
        System.out.println(questions.get(2).getAnswers().get(2));

        int my_answer3 = scanner.nextInt();

        System.out.println(questions.get(3).getQuestion());
        System.out.println(questions.get(3).getAnswers().get(0));
        System.out.println(questions.get(3).getAnswers().get(1));
        System.out.println(questions.get(3).getAnswers().get(2));

        int my_answer4 = scanner.nextInt();

        System.out.println(questions.get(4).getQuestion());
        System.out.println(questions.get(4).getAnswers().get(0));
        System.out.println(questions.get(4).getAnswers().get(1));

        int my_answer5 = scanner.nextInt();

        answers.add(0, new Answer(questions.get(0), my_answer1));
        answers.add(1, new Answer(questions.get(1), my_answer2));
        answers.add(2, new Answer(questions.get(2), my_answer3));
        answers.add(3, new Answer(questions.get(3), my_answer4));
        answers.add(4, new Answer(questions.get(4), my_answer5));

        System.out.println(answers.get(0).toString());
        System.out.println(answers.get(1).toString());
        System.out.println(answers.get(2).toString());
        System.out.println(answers.get(3).toString());
        System.out.println(answers.get(4).toString());

        int n = 0;

        if (my_answer1 == questions.get(0).getNumber_answer()) {
            n += 1;
        }

        if (my_answer2 == questions.get(1).getNumber_answer()) {
            n += 1;
        }

        if (my_answer3 == questions.get(2).getNumber_answer()) {
            n += 1;
        }

        if (my_answer4 == questions.get(3).getNumber_answer()) {
            n += 1;
        }

        if (my_answer5 == questions.get(4).getNumber_answer()) {
            n += 1;
        }

        System.out.println("Вы ответили на " + n + " из 5 вопросов. Вы ошиблись в следующих вопросах: ");

        if (my_answer1 != questions.get(0).getNumber_answer()) {
            System.out.println("" + answers.get(0).a());
        }

        if (my_answer2 != questions.get(1).getNumber_answer()) {
            System.out.println("" + answers.get(1).a());
        }

        if (my_answer3 != questions.get(2).getNumber_answer()) {
            System.out.println("" + answers.get(2).a());
        }

        if (my_answer4 != questions.get(3).getNumber_answer()) {
            System.out.println("" + answers.get(3).a());
        }

        if (my_answer5 != questions.get(4).getNumber_answer()) {
            System.out.println("" + answers.get(4).a());
        }
    }

}
