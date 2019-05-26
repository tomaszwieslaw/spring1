package pl.sda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("my-beans.xml");

        Book book1 = (Book) context.getBean("book2");
        System.out.println(book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());


        Person person1 = (Person) context.getBean("person1");
        System.out.println(person1.getAddress().getCity());

        String napis = (String) context.getBean("person1");
        System.out.println(person1.getAddress().getCity());


    }
}
