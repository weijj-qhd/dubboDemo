package com.kunlun.server;


import com.kunlun.server.api.Provider1ServerApi;

//@Service("provider1Server")
public class Provider2Server implements Provider1ServerApi{

	public String testProvider1(String a) {
		System.out.println("����testProvider2ϵͳ������testProvider1��������");
		return "Provider1Server--"+a;
	}

	public int testProvider1int(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
