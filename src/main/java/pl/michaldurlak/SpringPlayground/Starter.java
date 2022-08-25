package pl.michaldurlak.SpringPlayground;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import pl.michaldurlak.SpringPlayground.domain.Quest;
import pl.michaldurlak.SpringPlayground.domain.Student;
import pl.michaldurlak.SpringPlayground.domain.University;
import pl.michaldurlak.component.TestComponent;

@Component
//@ComponentScan({"pl.michaldurlak.SpringPlayground","pl.michaldurlak.component"})
@ComponentScan(basePackageClasses = {Starter.class, University.class, Quest.class, TestComponent.class})
public class Starter implements CommandLineRunner {

    @Autowired
    TestComponent testComponent;
    // aplikacja nie wystartuje bez dodania ComponentScan, ponieważ nie bedzie moglo wstrzyknac testComponent bo nie odnajdzie classy

    @Override
    public void run(String... args) throws Exception {
        // metoda ta zostanie uruchomiona zaraz po zaladowaniu konfiguracji przez springa


        Student student1 = new Student("Andrzej", 18);
        System.out.println(student1);

        Student student2 = new Student("Tomek", 20);

    }


}
