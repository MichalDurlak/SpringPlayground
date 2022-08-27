package pl.michaldurlak.SpringPlayground.lesson2.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import pl.michaldurlak.SpringPlayground.lesson2.domain.QuestLesson2;
import pl.michaldurlak.SpringPlayground.lesson2.domain.StudentLesson2;

@Configuration
public class ConfigLesson2 {


    @Autowired
    QuestLesson2 questLesson2;

    @Bean(name="andrzejekLesson2")
//    @Primary
    @Profile("dev")
    public StudentLesson2 andrzejekLesson2(){
        StudentLesson2 andrzejekLesson2 = new StudentLesson2("Andrzejek",34);
        andrzejekLesson2.setQuestLesson2(questLesson2);
        return andrzejekLesson2;
    }

    @Bean(name="tomeczekLesson2")
    @Profile("prod")
    public StudentLesson2 tomeczekLesson2(){
        StudentLesson2 tomeczekLesson2 = new StudentLesson2("Tomeczek",50);
        tomeczekLesson2.setQuestLesson2(questLesson2);
        return tomeczekLesson2;
    }


}
