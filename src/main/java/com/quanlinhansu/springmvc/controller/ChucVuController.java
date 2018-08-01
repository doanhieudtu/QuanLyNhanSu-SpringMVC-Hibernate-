package com.quanlinhansu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quanlinhansu.service.ChucVuService;
import com.quanlinhansu.springmvc.model.ChucVu;
@Controller
@RequestMapping("/chucvu/")
public class ChucVuController {
	@RequestMapping(value="them")
public String Them(ModelMap model,@RequestParam("MaCV") String macv, @RequestParam("tenCV") String tencv) {
		ChucVu cv= new ChucVu();
		cv.setMaCV(macv);
		cv.setTenCv(tencv);
		ChucVuService sr= new ChucVuService();
		int s=sr.Add(cv);
		if(s==1)
		{
		model.addAttribute("message","Them thanh cong" );
		}
		else
		{
			model.addAttribute("message","Them thanh cong" );
		}
			return "themcv";
	}
}
