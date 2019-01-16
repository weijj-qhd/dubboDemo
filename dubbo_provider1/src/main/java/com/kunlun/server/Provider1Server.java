package com.kunlun.server;


import org.springframework.stereotype.Service;

import com.kunlun.server.api.Provider1ServerApi;


@Service("provider1Server")
public class Provider1Server implements Provider1ServerApi{

	public String testProvider1(String a) {
		System.out.println("进入dubbo_provider1系统，调用testProvider1（）方法");
		/*try {
			Thread.sleep(3600000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		System.out.println("结束dubbo_provider1系统调用");
		return "Provider1Server--"+a;
	}

	public int testProvider1int(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
