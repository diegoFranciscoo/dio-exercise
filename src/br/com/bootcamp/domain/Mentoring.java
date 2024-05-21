package br.com.bootcamp.domain;

import java.time.LocalDate;

public class Mentoring extends Content{
    private LocalDate date;

    @Override
    public double calculateXP() {
        return STANDART_XP + 20D;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }



}
