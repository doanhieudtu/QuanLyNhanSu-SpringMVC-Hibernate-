package com.quanlinhansu.service;

import java.util.List;

import com.quanlinhansu.interfacedao.ChucVuDao;
import com.quanlinhansu.springmvc.dao.ChucVuImpl;
import com.quanlinhansu.springmvc.model.ChucVu;

public class ChucVuService {
	public List<ChucVu> ShowAll()
	{
		List<ChucVu> resuil= null;
			ChucVuDao dao=(ChucVuDao) new  ChucVuImpl();
		resuil= dao.FindAll();
		return resuil;
	}
	public int Update(ChucVu td)
	{
		int status=0;
		ChucVuDao dao=(ChucVuDao) new  ChucVuImpl();
		ChucVu a= new ChucVu();
		a.setMaCV(td.getMaCV());
		a.setTenCv(td.getTenCv());
		status= dao.Update(a);
		return status;
	}
	public int Add(ChucVu td)
	{
		int status=0;
		ChucVuDao dao=(ChucVuDao) new  ChucVuImpl();
		ChucVu a= new ChucVu();
		a.setMaCV(td.getMaCV());
		a.setTenCv(td.getTenCv());
		status= dao.Add(a);
		return status;
	}
	public int Remove(ChucVu td)
	{
		int status=0;
		ChucVuDao dao=(ChucVuDao) new  ChucVuImpl();
		status= dao.DeleteT(td);
		return status;
	}
	public Object[] FindbyProperty(String thuoctinh, Object giatri, String kieusapxep, String chieusapxep ) 
	{
		ChucVuDao dao=(ChucVuDao) new  ChucVuImpl();
		return dao.FindbyProperty(thuoctinh, giatri, kieusapxep, chieusapxep);
	}
}
