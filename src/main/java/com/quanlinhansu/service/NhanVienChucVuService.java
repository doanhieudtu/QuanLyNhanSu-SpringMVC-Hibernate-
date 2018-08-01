package com.quanlinhansu.service;

import java.util.List;

import com.quanlinhansu.interfacedao.NhanVienChucVuDao;
import com.quanlinhansu.springmvc.dao.NhanVienChucVuImpl;
import com.quanlinhansu.springmvc.model.NhanVienChucVu;

public class NhanVienChucVuService {
	public List<NhanVienChucVu> ShowAll()
	{
		List<NhanVienChucVu> resuil= null;
			NhanVienChucVuDao dao=(NhanVienChucVuDao) new  NhanVienChucVuImpl();
		resuil= dao.FindAll();
		return resuil;
	}
	public int Update(NhanVienChucVu td)
	{
		int status=0;
		NhanVienChucVuDao dao=(NhanVienChucVuDao) new  NhanVienChucVuImpl();
		NhanVienChucVu a= new NhanVienChucVu();
		a.getnHanVien().setMaNV(td.getnHanVien().getMaNV());
		a.getnHanVien().setMaCV(td.getnHanVien().getMaCV());
		a.settHoiGianCongTac(td.gettHoiGianCongTac());
		status= dao.Update(a);
		return status;
	}
	public int Add(NhanVienChucVu td)
	{
		int status=0;
		NhanVienChucVuDao dao=(NhanVienChucVuDao) new  NhanVienChucVuImpl();
		NhanVienChucVu a= new NhanVienChucVu();
		a.getnHanVien().setMaNV(td.getnHanVien().getMaNV());
		a.getnHanVien().setMaCV(td.getnHanVien().getMaCV());
		a.settHoiGianCongTac(td.gettHoiGianCongTac());
		status= dao.Add(a);
		return status;
	}
	public int Remove(NhanVienChucVu td)
	{
		int status=0;
		NhanVienChucVuDao dao=(NhanVienChucVuDao) new  NhanVienChucVuImpl();
		status= dao.DeleteT(td);
		return status;
	}
	public Object[] FindbyProperty(String thuoctinh, Object giatri, String kieusapxep, String chieusapxep ) 
	{
		NhanVienChucVuDao dao=(NhanVienChucVuDao) new  NhanVienChucVuImpl();
		return dao.FindbyProperty(thuoctinh, giatri, kieusapxep, chieusapxep);
	}
}
