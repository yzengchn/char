package com.yzeng.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yzeng.server.WebSocketServer;


@Controller
public class IndexController {

    /**
     * @author yzblog.xyz
     * @Description:
     * @date 2018/11/24 13:25
     * @param  * @param
     * @return java.lang.String
     */

	@RequestMapping("index")
	public String show() {
		return "index";
	}

	/**
	 * @author yzblog.xyz
	 * @Description: 后端发送消息推送的接口
	 * @date 2018/11/24 13:56
	 * @param
     * @param msg
	 * @return void
	 */

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
