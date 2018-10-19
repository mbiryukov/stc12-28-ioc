package ru.innopolis.stc12.ioctest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        DataHandler dataHandler = (DataHandler) context.getBean(DataHandler.class);
        DataHandler dataHandler2 =
                (DataHandler) new ClassPathXmlApplicationContext("appContext.xml").getBean(DataHandler.class);
        System.out.println("equals by ref: " + (dataHandler == dataHandler2));
        dataHandler.handleData("someUrl", "SomeOtherUrl");
    }
}
