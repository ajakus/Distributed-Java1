package edu.wctc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "edu.wctc")
public class SDataConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SDataConfig.class);
        context.refresh();

        ((DataConfig) context.getBean("dataConfig")).processSalesData();

    }
    @Bean
    public FileReaderProvider fileReaderProvider(){
        return new FileReaderProvider();
    }

        @Bean
    public SDataFormatter sDataFormatter(){
        return new SDataFormatter();
        }
        @Bean ShippingPolicy shippingPolicy(){
        return new Shipping();
        }






}
