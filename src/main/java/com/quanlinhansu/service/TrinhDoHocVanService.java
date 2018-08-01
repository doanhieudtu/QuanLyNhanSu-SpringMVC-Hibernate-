package com.quanlinhansu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quanlinhansu.interfacedao.TrinhDoHocVanDao;
import com.quanlinhansu.springmvc.dao.TrinhDoHocVanImpl;
import com.quanlinhansu.springmvc.model.*;
@Service
public class TrinhDoHocVanService {
	public List<TrinhDoHocVan> ShowAll()
	{
		List<TrinhDoHocVan> resuil= null;
			TrinhDoHocVanDao dao=(TrinhDoHocVanDao) new  TrinhDoHocVanImpl();
		resuil= dao.FindAll();
		return resuil;
	}
	public int Update(TrinhDoHocVan td)
	{
		int status=0;
		TrinhDoHocVanDao dao=(TrinhDoHocVanDao) new  TrinhDoHocVanImpl();
		TrinhDoHocVan a= new TrinhDoHocVan();
		a.setMaTDHV(td.getMaTDHV());
		a.setChuyenNganh(td.getChuyenNganh());
		a.setTenTD(td.getTenTD());
		status= dao.Update(a);
		return status;
	}
	public int Add(TrinhDoHocVan td)
	{
		int status=0;
		TrinhDoHocVanDao dao=(TrinhDoHocVanDao) new  TrinhDoHocVanImpl();
		TrinhDoHocVan a= new TrinhDoHocVan();
		a.setMaTDHV(td.getMaTDHV());
		a.setChuyenNganh(td.getChuyenNganh());
		a.setTenTD(td.getTenTD());
		status= dao.Add(a);
		return status;
	}
	public int Remove(TrinhDoHocVan td)
	{
		int status=0;
		TrinhDoHocVanDao dao=(TrinhDoHocVanDao) new  TrinhDoHocVanImpl();
		status= dao.DeleteT(td);
		return status;
	}
	public Object[] FindbyProperty(String thuoctinh, Object giatri, String kieusapxep, String chieusapxep ) 
	{
		TrinhDoHocVanDao dao=(TrinhDoHocVanDao) new  TrinhDoHocVanImpl();
		return dao.FindbyProperty(thuoctinh, giatri, kieusapxep, chieusapxep);
	}
}
