package com.quanlinhansu.springmvc.controller;


import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.quanlinhansu.springmvc.model.Luong;
import com.quanlinhansu.springmvc.model.NhanVien;
import com.quanlinhansu.springmvc.model.PhongBan;
@Controller
@RequestMapping("\nhanvien")
public class NhanVienController {
	@RequestMapping(params="btnthem")
	public String ThemNV(ModelMap model,NhanVien nv,@RequestParam("manv") String manv,@RequestParam("tennv") String tennv
			, @RequestParam("sdt") String sdt, @RequestParam("ngaysinh") Date ngaysinh, @RequestParam("quequan") String quequan,
			@RequestParam("mapb") PhongBan mapb, @RequestParam("matdhv") String matdhv, @RequestParam("luong") Luong maluong,
			@RequestParam("giotinh") byte gioitinh, @RequestParam("linkanh") String linkanh, @RequestParam("macv") String macv,
			@RequestParam("email") String email) {
		nv.setMaCV(macv);
		nv.setMaNV(manv);
		nv.setHoTen(tennv);
		nv.setQueQuan( quequan);
		nv.setLuong(maluong);
		nv.setMaPb(mapb);
		nv.setGioiTinh(gioitinh);
		nv.setNgaySinh(ngaysinh);
		nv.setlInhkaNh(linkanh);
		nv.setSoDt(sdt);
		return "addnhanvien";
	}
}
