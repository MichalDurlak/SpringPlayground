package pl.michaldurlak.SpringPlayground.lesson2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class HomeworkLesson2 {

    @Autowired
//    @Qualifier(value = "tomeczekLesson2")
//    Set<StudentLesson2> studentsLesson2;
    List<StudentLesson2> studentsLesson2;
// set - unikalne
// list - wszystkie


    public HomeworkLesson2() {
    }

    public void doHomework(){
//        studentLesson2.setAge(studentLesson2.getAge()+1);
    }

    //SET
//    public void setStudentsLesson2(Set<StudentLesson2> studentsLesson2) {
//        this.studentsLesson2 = studentsLesson2;
//    }

    //LIST
    public void setStudentsLesson2(List<StudentLesson2> studentsLesson2) {
        this.studentsLesson2 = studentsLesson2;
    }

    @Override
    public String toString() {
//        return "HomeworkLesson2{" +
//                "studentLesson2=" + studentLesson2 +
//                '}';

        return ("biora udzial: " + studentsLesson2.stream().map(Objects::toString).collect(Collectors.joining(",")));
    }
}
