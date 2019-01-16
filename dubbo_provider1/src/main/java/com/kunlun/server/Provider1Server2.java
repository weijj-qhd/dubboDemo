package com.kunlun.server;

import org.springframework.stereotype.Service;

import com.kunlun.server.api.Provider1serverApiTwo;

@Service("provider1Server2")
public class Provider1Server2 implements Provider1serverApiTwo{

	public String testApiTwo(String a) {
		System.out.println("进入Provider1Server2类的，testApiTwo（）方法");
		return "testApiTwo..."+a;
	}

}
