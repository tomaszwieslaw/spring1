package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("my-beans.xml");

//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String beanName : beanDefinitionNames) {
//            System.out.println(beanName);
//        }

        Message message = (Message) context.getBean("message");
        System.out.println(message.getText());
        message.setText("wubuch");

        Message messageCopy = (Message) context.getBean("message");
        System.out.println(messageCopy.getText());

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//
//        ExtraMessage extraMessage = (ExtraMessage) context.getBean("extramessage");
//        System.out.println(extraMessage.getValue());

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);



        context.close();
    }
}



