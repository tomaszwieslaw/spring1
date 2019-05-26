package pl.sda;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

@Getter @Setter
public class Student implements Serializable {

    private String firstName;

    @PostConstruct
    public void init() {
        System.out.println("Inicjalizacja");
    }

    @PreDestroy
    public void  destroy() {
        System.out.println("destrrrrr");
    }
}
