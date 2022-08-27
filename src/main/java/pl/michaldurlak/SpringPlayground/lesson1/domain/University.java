package pl.michaldurlak.SpringPlayground.lesson1.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@PropertySource("classpath:university.properties")
public class University {

//    @Value("${my.university.name}")
    private String name;
// gdy chcemy przypisac wartosc za pomoca "=" to przypisuje sie jako string nawet jak wykorzystamy '
// gdy w pliku application.properties nie bedzie wartosci "${my.university.name}" program nie wystartuje
    public University() {
    }

//    @PostConstruct
    public void startBeanUniversity(){
        System.out.println("Utworzono beana University o nazwie " + name);
    }

//    @PreDestroy
    public void removeBeanUniversity(){
        System.out.println("Za chwilke usunie sie bean University o nazwie " + name);
    }

    // potrzeba tej metody abli zadziałał plik xml, który wstrzykuje z pliku .properties nazwe university
    public void setName(String name){
        this.name = name;
    }
}
