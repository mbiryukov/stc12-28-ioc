package ru.innopolis.stc12.ioctest;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.innopolis.stc12.ioctest.DBDownloader;
import ru.innopolis.stc12.ioctest.DataHandler;
import ru.innopolis.stc12.ioctest.FileUploader;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        DataHandler dataHandler = (DataHandler) context.getBean("dataHandler");

        dataHandler.handleData("someUrl", "SomeOtherUrl");
    }
}
