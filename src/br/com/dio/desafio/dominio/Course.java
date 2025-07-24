package br.com.dio.desafio.dominio;

public final class Course extends Content {

    private int courseLoad;

    public Course(String title, String description, int courseLoad) {
        super(title,description);
        this.courseLoad = courseLoad;
    }

    @Override
    public double getXp() {
        return DEFAULT_XP * courseLoad;
    }

    public int getCourseLoad() {
        return courseLoad;
    }

    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", courseLoad=" + courseLoad +
                '}';
    }
}
