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
@Table(name="TrinhDoHocVan")
public class TrinhDoHocVan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
@Column(name="MaTDHV", nullable=false, length=10)
private String maTDHV;
@Column(name="TenTD", length=10)
private String tenTD;
@Column(name="ChuyenNganh", length=10)
private String chuyenNganh;
@OneToMany(mappedBy="MaTDHV", fetch=FetchType.LAZY)
private List<NhanVien> listNv;
public String getMaTDHV() {
	return maTDHV;
}
public void setMaTDHV(String maTDHV) {
	this.maTDHV = maTDHV;
}
public String getTenTD() {
	return tenTD;
}
public void setTenTD(String tenTD) {
	this.tenTD = tenTD;
}
public String getChuyenNganh() {
	return chuyenNganh;
}
public void setChuyenNganh(String chuyenNganh) {
	this.chuyenNganh = chuyenNganh;
}

}
