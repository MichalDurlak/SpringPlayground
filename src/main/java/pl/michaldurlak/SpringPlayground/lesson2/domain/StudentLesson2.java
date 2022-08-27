package pl.michaldurlak.SpringPlayground.lesson2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;


public class StudentLesson2 {


    private String name;
    private int age;
    private QuestLesson2 questLesson2;


    public StudentLesson2(){
        this.name = "Janusz";
        this.age = 22;
    }

    public StudentLesson2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Autowired
    public void setQuestLesson2(QuestLesson2 questLesson2) {
        System.out.println("Ustawianie zadania dla studenta");
        this.questLesson2 = questLesson2;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentLesson2 that = (StudentLesson2) o;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
    //

    @Override
    public String toString() {
        return "StudentLesson2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", questLesson2=" + questLesson2 +
                '}';
    }
}
