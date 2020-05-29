/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Timestamp;

/**
 *
 * @author Administrator
 */
public class THIETBI {
    private String MaThietBi;
    private String TenThietBi;
    private String DonViTinh;
    private String DonViTinhKhac;
    private int GiaNhap;
    private int DonGiaBan;
    private int SoLuongTon;
    private Timestamp NgayCapNhat;
    
    public THIETBI(){};
    
    public THIETBI(String MaTB, String TenTB, String DVTinh, String DVTKhac, int GiaNhap, int DonGiaBan, int SLTon, Timestamp NgayCapNhat){
        this.MaThietBi = MaTB;
        this.TenThietBi = TenTB;
        this.DonViTinh = DVTinh;
        this.DonViTinhKhac = DVTKhac;
        this.GiaNhap = GiaNhap;
        this.DonGiaBan = DonGiaBan;
        this.SoLuongTon = SLTon;
        this.NgayCapNhat = NgayCapNhat;
    }

    public String getMaThietBi() {
        return MaThietBi;
    }

    public void setMaThietBi(String MaThietBi) {
        this.MaThietBi = MaThietBi;
    }

    public String getTenThietBi() {
        return TenThietBi;
    }

    public void setTenThietBi(String TenThietBi) {
        this.TenThietBi = TenThietBi;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public String getDonViTinhKhac() {
        return DonViTinhKhac;
    }

    public void setDonViTinhKhac(String DonViTinhKhac) {
        this.DonViTinhKhac = DonViTinhKhac;
    }

    public int getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(int GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public int getDonGiaBan() {
        return DonGiaBan;
    }

    public void setDonGiaBan(int DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    public Timestamp getNgayCapNhat() {
        return NgayCapNhat;
    }

    public void setNgayCapNhat(Timestamp NgayCapNhat) {
        this.NgayCapNhat = NgayCapNhat;
    }
}
