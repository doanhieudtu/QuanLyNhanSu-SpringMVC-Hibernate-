package com.quanlinhansu.service;

import java.util.List;

import com.quanlinhansu.interfacedao.PhongBanDao;
import com.quanlinhansu.springmvc.dao.PhongBanImpl;
import com.quanlinhansu.springmvc.model.PhongBan;

public class PhongBanService {
	public List<PhongBan> ShowAll()
	{
		List<PhongBan> resuil= null;
			PhongBanDao dao=(PhongBanDao) new  PhongBanImpl();
		resuil= dao.FindAll();
		return resuil;
	}
	public int Update(PhongBan td)
	{
		int status=0;
		PhongBanDao dao=(PhongBanDao) new  PhongBanImpl();
		PhongBan a= new PhongBan();
		a.setMaPB(td.getMaPB());
		a.setDiaChi(td.getDiaChi());
		a.setsDt(td.getsDt());
		a.setTenPb(td.getDiaChi());
		status= dao.Update(a);
		return status;
	}
	public int Add(PhongBan td)
	{
		int status=0;
		PhongBanDao dao=(PhongBanDao) new  PhongBanImpl();
		PhongBan a= new PhongBan();
		a.setMaPB(td.getMaPB());
		a.setDiaChi(td.getDiaChi());
		a.setsDt(td.getsDt());
		a.setTenPb(td.getDiaChi());
		status= dao.Add(a);
		return status;
	}
	public int Remove(PhongBan td)
	{
		int status=0;
		PhongBanDao dao=(PhongBanDao) new  PhongBanImpl();
		status= dao.DeleteT(td);
		return status;
	}
	public Object[] FindbyProperty(String thuoctinh, Object giatri, String kieusapxep, String chieusapxep ) 
	{
		PhongBanDao dao=(PhongBanDao) new  PhongBanImpl();
		return dao.FindbyProperty(thuoctinh, giatri, kieusapxep, chieusapxep);
	}
}
