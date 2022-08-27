package pl.michaldurlak.SpringPlayground.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import pl.michaldurlak.SpringPlayground.lesson1.domain.Quest;
import pl.michaldurlak.SpringPlayground.lesson1.domain.Student;
import pl.michaldurlak.SpringPlayground.lesson1.domain.University;
import pl.michaldurlak.SpringPlayground.lesson1.component.TestComponent;

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


//ZAKOMENOTWANO Z POWODU URUCHOMIENIA LESSON2
//        Student student1 = new Student("Andrzej", 18);
//        System.out.println(student1);
//
//        Student student2 = new Student("Tomek", 20);

    }


}
