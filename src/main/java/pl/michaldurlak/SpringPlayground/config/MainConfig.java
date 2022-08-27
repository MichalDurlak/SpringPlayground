package pl.michaldurlak.SpringPlayground.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import pl.michaldurlak.SpringPlayground.domain.Quest;
import pl.michaldurlak.SpringPlayground.domain.Student;
import pl.michaldurlak.SpringPlayground.domain.University;

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
