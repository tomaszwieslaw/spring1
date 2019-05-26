package pl.sda;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private Double salary;
    private String position;
    private Address address;

    public Person() {

    }

    public Person (Address address) {
        this.address = address;
    }
}
