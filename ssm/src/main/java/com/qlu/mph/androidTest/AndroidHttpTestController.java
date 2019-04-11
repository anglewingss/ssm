package com.qlu.mph.androidTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/request")
public class AndroidHttpTestController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		System.err.println("连接成功！！！");
		return "success";
	}
}
