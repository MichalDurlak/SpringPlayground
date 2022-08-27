package pl.michaldurlak.SpringPlayground.lesson2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UniversityLesson2 {

    @Value("${my.university.name:WSB}")
    private String name;

    StudentLesson2 studentLesson2;

    @Autowired
    public UniversityLesson2(StudentLesson2 studentLesson2){
        this.studentLesson2 = studentLesson2;
    }


    public UniversityLesson2(StudentLesson2 studentLesson2,String name) {
        this.name = name;
        this.studentLesson2 = studentLesson2;
    }

    public void build(){
        System.out.println("Wybudowana szkołę");
    }

    public void destroy(){
        System.out.println("Wyburzono szkołę");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UniversityLesson2{" +
                "name='" + name + '\'' +
                ", studentLesson2=" + studentLesson2 +
                '}';
    }
}
