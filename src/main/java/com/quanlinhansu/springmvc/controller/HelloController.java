package com.quanlinhansu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value="/taikhoan")
public class HelloController {
@RequestMapping("/taikhoan/say")
	public String say()
{
	return "hello";
	}
}
