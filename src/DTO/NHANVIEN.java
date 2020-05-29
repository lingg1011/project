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
public class NHANVIEN {
    private String MaNhanVien;
    private String TenNhanVien;
    private boolean GioiTinh;
    private String ChucVu;
    private String DiaChi;
    private int sdt;
    
    public NHANVIEN(){};
    
    public NHANVIEN(String MaNV, String TenNV, boolean GT, String ChucVu, String DiaChi, int sdt){
        this.MaNhanVien = MaNV;
        this.TenNhanVien = TenNV;
        this.GioiTinh = GT;
        this.ChucVu = ChucVu;
        this.DiaChi = DiaChi;
        this.sdt = sdt;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
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
}
