package pl.sda;

import java.io.Serializable;
import java.sql.SQLSyntaxErrorException;

public class Message implements Serializable {

    private String text;

//    public Message() {
//        text = "Hello World!";
//    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message() {
        System.out.println("Creating object");
    }

    public void init(){
        System.out.println("Init method");
    }

    public void destroy() {
        System.out.println("Destroy!");
    }

}
