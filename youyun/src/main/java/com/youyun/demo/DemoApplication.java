package com.youyun.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
       map.put(10,11);
        System.out.println("abc"+map.get(10));
        SpringApplication.run(DemoApplication.class, args);
    }

    }
