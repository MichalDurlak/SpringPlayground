package pl.michaldurlak.SpringPlayground.lesson2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeworkLesson2 {

    @Autowired
    StudentLesson2 studentLesson2;

    public HomeworkLesson2() {
    }

    public void doHomework(){
        studentLesson2.setAge(studentLesson2.getAge()+1);
    }


    @Override
    public String toString() {
        return "HomeworkLesson2{" +
                "studentLesson2=" + studentLesson2 +
                '}';
    }
}
