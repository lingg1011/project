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
public class NHOMLOAI {
    private String MaNhomLoai;
    private String TenNhomLoai;
    
    public NHOMLOAI (){};
    
    public NHOMLOAI (String MaNL, String TenNL){
        this.MaNhomLoai = MaNL;
        this.TenNhomLoai = TenNL;
    }

    public String getMaNhomLoai() {
        return MaNhomLoai;
    }

    public void setMaNhomLoai(String MaNhomLoai) {
        this.MaNhomLoai = MaNhomLoai;
    }

    public String getTenNhomLoai() {
        return TenNhomLoai;
    }

    public void setTenNhomLoai(String TenNhomLoai) {
        this.TenNhomLoai = TenNhomLoai;
    }
}
