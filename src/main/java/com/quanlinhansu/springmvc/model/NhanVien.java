package com.quanlinhansu.springmvc.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="NhanVien")
public class NhanVien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="MaNV", nullable=false, length=30)
	private String maNV;
	@Column(name="Email", length=20)
	private String eMail;
	@Column(name="QueQuan", length=30)
	private String queQuan;
	@Column(name="NgaySinh", nullable=false)
	private Date NgaySinh;
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	@Column(name="HoTen", length=30)
	private String hoTen;
	@Column(name="GioiTinh")
	private byte gioiTinh;
	@Column(name="SDT")
	private String soDt;
	@ManyToOne
	@JoinColumn(name="MaPB")
	private PhongBan maPb;
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	@ManyToOne
	@JoinColumn(name="MaTDHV")
	private TrinhDoHocVan MaTDHV;
	@ManyToOne
	@JoinColumn(name="MaLuong", nullable=false, updatable=false)
	private Luong luong;
	@Column(name="linkanh")
	private String lInhkaNh;
	@Column(name="MaCV")
	private String MaCV;
	public String getMaCV() {
		return MaCV;
	}
	public void setMaCV(String maCV) {
		MaCV = maCV;
	}
	@OneToMany(mappedBy="nHanVien", fetch=FetchType.LAZY)
	private List<NhanVienChucVu> listNVcungCV;
	public List<NhanVienChucVu> getListNVcungCV() {
		return listNVcungCV;
	}
	public void setListNVcungCV(List<NhanVienChucVu> listNVcungCV) {
		this.listNVcungCV = listNVcungCV;
	}
	public String getlInhkaNh() {
		return lInhkaNh;
	}
	public void setlInhkaNh(String lInhkaNh) {
		this.lInhkaNh = lInhkaNh;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public byte getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(byte gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoDt() {
		return soDt;
	}
	public void setSoDt(String soDt) {
		this.soDt = soDt;
	}
	public PhongBan getMaPb() {
		return maPb;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setMaPb(PhongBan maPb) {
		this.maPb = maPb;
	}
	public TrinhDoHocVan getMaTDHV() {
		return MaTDHV;
	}
	public void setMaTDHV(TrinhDoHocVan maTDHV) {
		MaTDHV = maTDHV;
	}
	@Override
	public String toString() {
		return this.maNV.toString()+this.hoTen.toString();
	}
	public Luong getLuong() {
		return luong;
	}
	public void setLuong(Luong maluong) {
		this.luong = maluong;
	}

}
