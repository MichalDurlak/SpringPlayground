package pl.michaldurlak.SpringPlayground.domain;

public class Student {

    private String name;
    private int age;
    private Quest quest;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
//        this.quest = new Quest("Zdaj matematyke");
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    //    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", quest=" + quest +
//                '}';
//    }

}
