package com.quanlinhansu.service;

import java.util.List;

import com.quanlinhansu.interfacedao.AdminDao;
import com.quanlinhansu.springmvc.dao.AdminImpl;
import com.quanlinhansu.springmvc.model.Admin;

public class AdminService {
	public List<Admin> ShowAll()
	{
		List<Admin> resuil= null;
			AdminDao dao=(AdminDao) new  AdminImpl();
		resuil= dao.FindAll();
		return resuil;
	}
	public int Update(Admin td)
	{
		int status=0;
		AdminDao dao=(AdminDao) new  AdminImpl();
		Admin a= new Admin();
		a.setId(td.getId());
		a.setName(td.getName());
		a.setEmail(td.getEmail());
		a.setLinkanh(td.getLinkanh());
		a.setPass(td.getPass());
		status= dao.Add(a);
		status= dao.Update(a);
		return status;
	}
	public int Add(Admin td)
	{
		int status=0;
		AdminDao dao=(AdminDao) new  AdminImpl();
		Admin a= new Admin();
		a.setId(td.getId());
		a.setName(td.getName());
		a.setEmail(td.getEmail());
		a.setLinkanh(td.getLinkanh());
		a.setPass(td.getPass());
		status= dao.Add(a);
		return status;
	}
	public int Remove(Admin td)
	{
		int status=0;
		AdminDao dao=(AdminDao) new  AdminImpl();
		status= dao.DeleteT(td);
		return status;
	}
	public Object[] FindbyProperty(String thuoctinh, Object giatri, String kieusapxep, String chieusapxep ) 
	{
		AdminDao dao=(AdminDao) new  AdminImpl();
		return dao.FindbyProperty(thuoctinh, giatri, kieusapxep, chieusapxep);
	}
}
