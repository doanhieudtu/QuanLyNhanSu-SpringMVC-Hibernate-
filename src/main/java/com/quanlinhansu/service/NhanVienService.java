package com.quanlinhansu.service;

import java.util.List;

import com.quanlinhansu.interfacedao.NhanVienDao;
import com.quanlinhansu.springmvc.dao.NhanVienImpl;
import com.quanlinhansu.springmvc.model.NhanVien;

public class NhanVienService {
	public List<NhanVien> ShowAll()
	{
		List<NhanVien> resuil= null;
			NhanVienDao dao=(NhanVienDao) new  NhanVienImpl();
		resuil= dao.FindAll();
		return resuil;
	}
	public int Update(NhanVien td)
	{
		int status=0;
		NhanVienDao dao=(NhanVienDao) new  NhanVienImpl();
		NhanVien a= new NhanVien();
		a.setMaCV(td.getMaCV());
		a.setMaNV(td.getMaNV());
		a.setHoTen(td.getHoTen());
		a.setQueQuan( td.getQueQuan());
		a.getLuong().setMaLuong(td.getLuong().getMaLuong());
		a.getMaPb().setMaPB(td.getMaPb().getMaPB());
		a.setGioiTinh(td.getGioiTinh());
		a.setNgaySinh(td.getNgaySinh());
		a.setlInhkaNh(td.getlInhkaNh());
		a.getMaTDHV().setMaTDHV(td.getMaTDHV().getMaTDHV());
		a.setSoDt(td.getSoDt());
		status= dao.Update(a);
		return status;
	}
	public int Add(NhanVien td)
	{
		int status=0;
		NhanVienDao dao= new  NhanVienImpl();
		NhanVien a= new NhanVien();
		a.setMaCV(td.getMaCV());
		a.setMaNV(td.getMaNV());
		a.setHoTen(td.getHoTen());
		a.setQueQuan( td.getQueQuan());
		a.setLuong(td.getLuong());
		a.setMaPb(td.getMaPb());
		a.setGioiTinh(td.getGioiTinh());
		a.setNgaySinh(td.getNgaySinh());
		a.setlInhkaNh(td.getlInhkaNh());
		a.setMaTDHV(td.getMaTDHV());
		a.setSoDt(td.getSoDt());
		a.seteMail(td.geteMail());
		status= dao.Add(a);
		return status;
	}
	public int Remove(NhanVien td)
	{
		int status=0;
		NhanVienDao dao=(NhanVienDao) new  NhanVienImpl();
		status= dao.DeleteT(td);
		return status;
	}
	public Object[] FindbyProperty(String thuoctinh, Object giatri, String kieusapxep, String chieusapxep ) 
	{
		NhanVienDao dao=(NhanVienDao) new  NhanVienImpl();
		return dao.FindbyProperty(thuoctinh, giatri, kieusapxep, chieusapxep);
	}
}
