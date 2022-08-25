package pl.michaldurlak.SpringPlayground;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.michaldurlak.SpringPlayground.domain.Student;

@Component
public class Starter implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        // metoda ta zostanie uruchomiona zaraz po zaladowaniu konfiguracji przez springa


        Student student1 = new Student("Andrzej", 18);
        System.out.println(student1);

        Student student2 = new Student("Tomek", 20);

    }


}
