 package com.quanlinhansu.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="NhanVien_ChucVu")
public class NhanVienChucVu {
	@Id
	private String pk;
	@ManyToOne
	@JoinColumn(name="MaNV", nullable=false, updatable=false)
	private NhanVien nHanVien;
	@JoinColumn(name="MaCV", nullable=false, updatable=false)
	@ManyToOne
	private ChucVu cHucVu;
	public String getPk() {
		return pk;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}
	@Column(name="ThoiGianCongTac")
	private float tHoiGianCongTac;
	public NhanVien getnHanVien() {
		return nHanVien;
	}
	public void setnHanVien(NhanVien nHanVien) {
		this.nHanVien = nHanVien;
	}
	public ChucVu getcHucVu() {
		return cHucVu;
	}
	public void setcHucVu(ChucVu cHucVu) {
		this.cHucVu = cHucVu;
	}
	public float gettHoiGianCongTac() {
		return tHoiGianCongTac;
	}
	public void settHoiGianCongTac(float tHoiGianCongTac) {
		this.tHoiGianCongTac = tHoiGianCongTac;
	}
	
	
}
