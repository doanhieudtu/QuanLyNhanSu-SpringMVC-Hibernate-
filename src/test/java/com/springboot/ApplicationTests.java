package com.springboot;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.quanlinhansu.service.*;
import com.quanlinhansu.springmvc.model.*;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
	@Test
	public void contextLoads() {
		String Date="2017/05/05";
		Date date= new Date();
		 SimpleDateFormat formatter = new SimpleDateFormat("yyy/MM/dd");
		 try {
			date=formatter.parse(Date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		NhanVienService sv= new  NhanVienService();
		NhanVien a= new NhanVien();
		a.setMaCV("CV01");
		a.setMaNV("NV10");
		a.setHoTen("ABC");
		a.setQueQuan("ASDASD");
		
		PhongBan b= new PhongBan();
		b.setMaPB("PB01");
		b.setDiaChi("ádas");
		b.setsDt("2112121");
		b.setTenPb("ádasd");
		a.setMaPb(b);
		Luong l= new Luong();
		l.setMaLuong("ML01");
		l.setHeSoLuong((float) 1.5);
		l.setLuongCoBan(500);
		l.setPhuCap(6565);
		a.setLuong(l);
		a.setGioiTinh((byte) 1);
		a.setNgaySinh(date);
		a.setlInhkaNh("ADADAS");
		TrinhDoHocVan c= new TrinhDoHocVan();
		c.setMaTDHV("DHCS");
		c.setChuyenNganh("sâdas");
		c.setTenTD("Ádadas");
		a.setMaTDHV(c);
		a.setSoDt("121212121");
		a.seteMail("doanhieudtu@gmail.com");
		sv.Add(a);
	}
}
