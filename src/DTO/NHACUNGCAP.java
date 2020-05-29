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
public class NHACUNGCAP {
    private String MaNhaCungCap;
    private String TenNhaCungCap;
    private String DiaChi;
    private int sdt;
    
    public NHACUNGCAP(){};
    
    public NHACUNGCAP(String MaNCC, String TenNCC, String DiaChi, int sdt){
        this.MaNhaCungCap = MaNCC;
        this.TenNhaCungCap = TenNCC;
        this.DiaChi = DiaChi;
        this.sdt = sdt;
    }

    public String getMaNhaCungCap() {
        return MaNhaCungCap;
    }

    public void setMaNhaCungCap(String MaNhaCungCap) {
        this.MaNhaCungCap = MaNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return TenNhaCungCap;
    }

    public void setTenNhaCungCap(String TenNhaCungCap) {
        this.TenNhaCungCap = TenNhaCungCap;
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
