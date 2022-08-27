package pl.michaldurlak.SpringPlayground.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.michaldurlak.SpringPlayground.lesson2.domain.HomeworkLesson2;
import pl.michaldurlak.SpringPlayground.lesson2.domain.StudentLesson2;
import pl.michaldurlak.SpringPlayground.lesson2.domain.UniversityLesson2;

@Component
public class StarterLesson2 implements CommandLineRunner {

    @Autowired
    UniversityLesson2 univeristyLesson2;

    @Autowired
    HomeworkLesson2 homeworkLesson2;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(univeristyLesson2);
        homeworkLesson2.doHomework();
        System.out.println(homeworkLesson2);
        System.out.println(univeristyLesson2);
    }
}
