package com.kunlun;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kunlun.server.api.Provider1ServerApi;

public class ConsumerMain {
	public static void main(String[] args){
        //²âÊÔ³£¹æ·þÎñ
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start...");
        Provider1ServerApi demoService = context.getBean(Provider1ServerApi.class);
        //Provider1ServerApi demoService = (Provider1ServerApi) context.getBean("fjds");
        System.out.println("consumer");
        System.out.println(demoService.testProvider1("³É¹¦ÁË"));
    }
}
