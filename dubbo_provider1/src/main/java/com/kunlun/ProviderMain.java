package com.kunlun;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ProviderMain {
	 public static void main(String[] args) throws IOException {
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
         System.out.println(context.getDisplayName() + ": here");
         context.start();
         System.out.println("�����Ѿ�����...");
         System.in.read();
     }
}
