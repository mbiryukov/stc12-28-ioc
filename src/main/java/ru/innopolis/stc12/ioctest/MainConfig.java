package ru.innopolis.stc12.ioctest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.innopolis.stc12.ioctest")
public class MainConfig {

    @Bean(name = "uploader")
    public FileUploader uploader() {
        return new FileUploader();
    }

    @Bean(name = "downloader")
    public DBDownloader downloader() {
        return new DBDownloader();
    }

    @Bean(name = "dataHandler")
    public DataHandler dataHandler() {
        DataHandler dataHandler = new DataHandler(downloader(), uploader());
        return dataHandler;
    }
}
