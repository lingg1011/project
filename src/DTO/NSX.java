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
public class NSX {
    private String MaNSX;
    private String TenNSX;
    private int sdt;
    private String DiaChi;
    
    public NSX (){};
    
    public NSX (String MaNSX, String TenNSX, int sdt, String DiaChi){
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.sdt = sdt;
        this.DiaChi = DiaChi;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String MaNSX) {
        this.MaNSX = MaNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String TenNSX) {
        this.TenNSX = TenNSX;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
}
