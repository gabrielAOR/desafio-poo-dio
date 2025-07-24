import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Developer;
import br.com.dio.desafio.dominio.Mentorship;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Curso javascript", "Curso sobre as atualizações do ES6", 4);
        Course course2 = new Course("Curso GO", "Curso sobre as inovacoes em GO", 6);
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Bootcamp sobre a sintaxe de java");
        Mentorship mentorship = new Mentorship("Mentoria Java", "Mentoria desmitificando todos os conteudos em java");
        Developer gabriel = new Developer("Gabriel");
        Developer carlos = new Developer("Carlos");

        bootcamp.getContent().add(course1);
        bootcamp.getContent().add(course2);
        bootcamp.getContent().add(mentorship);

        gabriel.subscribeToBootcamp(bootcamp);
        carlos.subscribeToBootcamp(bootcamp);

    }
}