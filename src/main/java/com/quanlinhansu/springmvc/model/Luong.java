package com.quanlinhansu.springmvc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Luong")
public class Luong implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="MaLuong", nullable=false, length=10)
	private String maLuong;
	@Column(name="PhuCap")
	private float phuCap;
	@Column(name="LuongCoBan", nullable=false)
	private float luongCoBan;
	@Column(name="HeSoLuong", nullable=false)
	private float heSoLuong;
	@OneToMany(mappedBy="luong", fetch=FetchType.LAZY)
	private List<NhanVien> listNv;
	public List<NhanVien> getListNv() {
		return listNv;
	}
	public void setListNv(List<NhanVien> listNv) {
		this.listNv = listNv;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public String getMaLuong() {
		return maLuong;
	}
	public void setMaLuong(String maLuong) {
		this.maLuong = maLuong;
	}
	public float getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(float phuCap) {
		this.phuCap = phuCap;
	}
	public float getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public float getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	
}
