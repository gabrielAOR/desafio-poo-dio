package br.com.dio.desafio.dominio;

public abstract sealed class Content permits Course, Mentorship{

    protected static final double DEFAULT_XP = 10d;

    private String title;
    private String description;


    public Content(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract double getXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
