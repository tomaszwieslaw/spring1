package pl.sda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Zad4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

        List<String> napisy = (List)context.getBean("mojaLista");
        napisy.stream().forEach(System.out::println);
    }
}
