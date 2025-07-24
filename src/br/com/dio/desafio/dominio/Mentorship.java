package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public final class Mentorship extends Content{

    private final LocalDate date = LocalDate.now();

    public Mentorship(String title, String description) {
        super(title, description);
    }

    @Override
    public double getXp() {
        return DEFAULT_XP + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
