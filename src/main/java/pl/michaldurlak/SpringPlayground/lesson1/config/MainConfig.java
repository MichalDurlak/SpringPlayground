package pl.michaldurlak.SpringPlayground.lesson1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.michaldurlak.SpringPlayground.lesson1.domain.Quest;
import pl.michaldurlak.SpringPlayground.lesson1.domain.Student;

@Configuration
//@ImportResource("classpath:config/university-config.xml")
public class MainConfig {

//    @Value("${my.university.name:WSB}")
//    String universityName;

    @Bean
    public Quest createQuest(){
        return new Quest();
    }

    @Bean
    public Student student(){
        Student student = new Student("Andrzej",22);
        student.setQuest(createQuest());
        return student;
    }






}
