package com.company.Months;

public enum Months {

    January("Январь", 1), February("Февраль", 2), March("Март", 3),
    April("Апрель", 4), May("Май", 5), June("Июнь", 6),
    July("Июль", 7), August("Август", 8), September("Сентябрь", 9),
    October("Октябрь", 10), November("Ноябрь", 11), December("Декабрь",12);

    private String translation;
    private int znachenie;

    Months(String translation, int znachenie) {
        this.translation = translation;
        this.znachenie = znachenie;
    }

    public String getTranslation() {
        return translation;
    }

    public int getZnachenie() {
        return znachenie;
    }
}
