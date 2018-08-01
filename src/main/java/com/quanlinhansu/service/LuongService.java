package com.quanlinhansu.service;

import java.util.List;

import com.quanlinhansu.interfacedao.LuongDao;
import com.quanlinhansu.springmvc.dao.LuongImpl;
import com.quanlinhansu.springmvc.model.Luong;

public class LuongService {
	public List<Luong> ShowAll()
	{
		List<Luong> resuil= null;
			LuongDao dao=(LuongDao) new  LuongImpl();
		resuil= dao.FindAll();
		return resuil;
	}
	public int Update(Luong td)
	{
		int status=0;
		LuongDao dao=(LuongDao) new  LuongImpl();
		Luong a= new Luong();
		a.setMaLuong(td.getMaLuong());
		a.setHeSoLuong(td.getHeSoLuong());
		a.setLuongCoBan(td.getLuongCoBan());
		a.setLuongCoBan(td.getLuongCoBan());
		status= dao.Update(a);
		return status;
	}
	public int Add(Luong td)
	{
		int status=0;
		LuongDao dao=(LuongDao) new  LuongImpl();
		Luong a= new Luong();
		a.setMaLuong(td.getMaLuong());
		a.setHeSoLuong(td.getHeSoLuong());
		a.setLuongCoBan(td.getLuongCoBan());
		a.setLuongCoBan(td.getLuongCoBan());
		status= dao.Add(a);
		return status;
	}
	public int Remove(Luong td)
	{
		int status=0;
		LuongDao dao=(LuongDao) new  LuongImpl();
		status= dao.DeleteT(td);
		return status;
	}
	public Object[] FindbyProperty(String thuoctinh, Object giatri, String kieusapxep, String chieusapxep ) 
	{
		LuongDao dao=(LuongDao) new  LuongImpl();
		return dao.FindbyProperty(thuoctinh, giatri, kieusapxep, chieusapxep);
	}
}
