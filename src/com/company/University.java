package com.company;
import java.util.HashSet;
import java.util.Objects;

public class University {
    private final String name;
    private final int studentsNumber;
    private final int tutorsNumber;
    private final float scoreUSE;

    public University(String name, int studentsNumber, int tutorsNumber, float scoreUSE) {
        this.name = name;
        this.studentsNumber = studentsNumber;
        this.tutorsNumber = tutorsNumber;
        this.scoreUSE = scoreUSE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return studentsNumber == that.studentsNumber && tutorsNumber == that.tutorsNumber && Float.compare(that.scoreUSE, scoreUSE) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentsNumber, tutorsNumber, scoreUSE);
    }

    @Override
    public String toString() {
        return "Университет {" +
                " Название = '" + name + '\'' +
                ", Количество студентов =" + studentsNumber +
                ", Количество учителей=" + tutorsNumber +
                ", балл ЕГЭ =" + scoreUSE +
                '}';
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public static void getInfo(HashSet<University> b){
        int stud = 0;
        float tutor = 0;
        float ege = 0;
        for (University a : b) {
            stud += a.studentsNumber;
            tutor += a.tutorsNumber;
            ege += a.scoreUSE;
        }
        System.out.println("Число студентов в множестве - " + stud + "\nСреднее количество преподавателей множества - " + tutor/b.size() + " \n Средний балл ЕГЭ во множестве - " + ege/b.size() + " \n");
    }
}