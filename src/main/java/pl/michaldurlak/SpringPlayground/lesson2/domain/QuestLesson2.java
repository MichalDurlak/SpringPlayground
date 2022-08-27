package pl.michaldurlak.SpringPlayground.lesson2.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class QuestLesson2 {

    private String description;

    public QuestLesson2() {
        this.description = "Napisz kolosa";
    }

    @Override
    public String toString() {
        return description;
    }
}
