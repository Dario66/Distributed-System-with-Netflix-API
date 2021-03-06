package com.example.VideoServer1;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class VideoServer1Application {

    private String name="server1";

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(VideoServer1Application.class);
        application.setAdditionalProfiles("server-1");
        application.run(args);
    }

    @RequestMapping("/name")
    public String text() {
        return name;
    }
    @RequestMapping("/name2")
    public ArrayList<String> text2() {
    	
    	ArrayList<String> lista=new ArrayList<String>();
    	lista.add("[S1]Articolo 1");
    	lista.add("[S1]Articolo 2");
    	lista.add("[S1]Articolo 3");
    	
        return lista;
    }
    
}