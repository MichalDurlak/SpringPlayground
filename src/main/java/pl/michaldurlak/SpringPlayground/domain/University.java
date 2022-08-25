package pl.michaldurlak.SpringPlayground.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class University {

    private String name = "WSB";

    public University() {
    }

    @PostConstruct
    public void startBeanUniversity(){
        System.out.println("Utworzono beana University o nazwie " + name);
    }

    @PreDestroy
    public void removeBeanUniversity(){
        System.out.println("Za chwilke usunie sie bean University o nazwie " + name);
    }
}
