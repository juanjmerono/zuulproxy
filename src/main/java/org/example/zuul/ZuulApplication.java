package org.example.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        /*java.util.SortedMap<String, java.nio.charset.Charset> map = java.nio.charset.Charset.availableCharsets();
        map.keySet().stream().forEach(System.out::println);*/
        System.out.println(java.nio.charset.Charset.forName("dec-mcs").name());
        SpringApplication.run(ZuulApplication.class, args);
    }
}