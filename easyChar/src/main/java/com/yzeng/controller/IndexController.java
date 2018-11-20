package com.yzeng.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yzeng.server.WebSocketServer;

@Controller
public class IndexController {
	
	@RequestMapping("index")
	public String show() {
		return "index";
	}
	
	@RequestMapping("send")
	@ResponseBody
	public void send(String msg) {
		try {
			WebSocketServer.sendInfo(msg, String.valueOf(1));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
