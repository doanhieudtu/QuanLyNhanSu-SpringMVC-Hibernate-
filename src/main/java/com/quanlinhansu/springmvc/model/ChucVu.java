package com.quanlinhansu.springmvc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
@Table(name="ChucVu")
public class ChucVu implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="MaCV",  nullable = false, length=10)
	private String MaCV;
	@Column(name="TenCV",  nullable = false, length=20)
	private String tenCv;
	public List<NhanVienChucVu> getListNVcungCV() {
		return listNVcungCV;
	}
	public void setListNVcungCV(List<NhanVienChucVu> listNVcungCV) {
		this.listNVcungCV = listNVcungCV;
	}
	public String getTenCv() {
		return tenCv;
	}
	public void setTenCv(String tenCv) {
		this.tenCv = tenCv;
	}
	@OneToMany(mappedBy="cHucVu", fetch=FetchType.LAZY)
	private List<NhanVienChucVu> listNVcungCV;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getMaCV() {
	return MaCV;
	}
	public void setMaCV(String maCV ) {
		MaCV = maCV;
	}
	
	

}
