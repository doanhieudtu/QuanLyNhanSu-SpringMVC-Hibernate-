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
@Table(name="PhongBan")
public class PhongBan  implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@Column(name="MaPB", nullable=false)
private String MaPB;
@Column(name="TenPB")
private String tenPb;
@Column(name="DiaChi")
private String diaChi;
@Column(name="SDT")
private String sDt;
@OneToMany(mappedBy="maPb", fetch=FetchType.LAZY)
private List<NhanVien> listNv;
public String getMaPB() {
	return MaPB;
}
public List<NhanVien> getlistNv() {
	return listNv;
}
public void setMaPB(String maPB) {
	MaPB = maPB;
}
public String getTenPb() {
	return tenPb;
}
public void setTenPb(String tenPb) {
	this.tenPb = tenPb;
}
public String getDiaChi() {
	return diaChi;
}
public void setDiaChi(String diaChi) {
	this.diaChi = diaChi;
}
public String getsDt() {
	return sDt;
}
public void setsDt(String sDt) {
	this.sDt = sDt;
}

}
