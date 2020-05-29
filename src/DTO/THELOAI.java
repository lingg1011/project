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
public class THELOAI {
    private String MaTheLoai;
    private String TenTheLoai;
    private String DienGiai;
    
    public THELOAI(){};
    
    public THELOAI(String MaTT,String TenTT, String DGiai){
        this.MaTheLoai = MaTT;
        this.TenTheLoai = TenTT;
        this.DienGiai = DGiai;
    }

    public String getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(String MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public String getTenTheLoai() {
        return TenTheLoai;
    }

    public void setTenTheLoai(String TenTheLoai) {
        this.TenTheLoai = TenTheLoai;
    }

    public String getDienGiai() {
        return DienGiai;
    }

    public void setDienGiai(String DienGiai) {
        this.DienGiai = DienGiai;
    }
}
