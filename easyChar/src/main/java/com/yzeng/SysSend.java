package com.yzeng;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.yzeng.server.WebSocketServer;
import com.yzeng.utils.HttpSend;

public class SysSend {
	public static void main(String[] args) {
		while(true) {
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
			  //java.io.InputStreamReader继承了Reader类
			  String read = null;
			  System.out.print("输入数据：");
			  try {
			   read = br.readLine();
			   String str = "msg="+read;
			   HttpSend.sendPost("http://localhost:8080/send", str);
			  } catch (IOException e) {
			   e.printStackTrace();
			  }
			  System.out.println("输入数据："+read);
			  System.out.print("");
		}
	}
}
