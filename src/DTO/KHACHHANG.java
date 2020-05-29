/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Administrator
 */
public class KHACHHANG {
    private String MaKhachHang;
    private String TenKhachHang;
    private String DiaChi;
    private int sdt;
    private boolean GioiTinh;
    private String MaSoThue;
    
    public KHACHHANG(){};
    
    public KHACHHANG(String MaKH, String TenKH, String DiaChi, int sdt, boolean GT, String MaST){
        this.MaKhachHang = MaKH;
        this.TenKhachHang = TenKH;
        this.DiaChi = DiaChi;
        this.sdt = sdt;
        this.GioiTinh = GT;
        this.MaSoThue = MaST;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getMaSoThue() {
        return MaSoThue;
    }

    public void setMaSoThue(String MaSoThue) {
        this.MaSoThue = MaSoThue;
    }
}
