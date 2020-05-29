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
public class CHUNGLOAI {
    private String MaChungLoai;
    private String TenChungLoai;
    private String DienGiai;
    
    public CHUNGLOAI (){};
    
    public CHUNGLOAI (String MaCL, String TenCL, String DGiai){
        this.MaChungLoai = MaCL;
        this.TenChungLoai = TenCL;
        this.DienGiai = DGiai;
    }

    public String getMaChungLoai() {
        return MaChungLoai;
    }

    public void setMaChungLoai(String MaChungLoai) {
        this.MaChungLoai = MaChungLoai;
    }

    public String getTenChungLoai() {
        return TenChungLoai;
    }

    public void setTenChungLoai(String TenChungLoai) {
        this.TenChungLoai = TenChungLoai;
    }

    public String getDienGiai() {
        return DienGiai;
    }

    public void setDienGiai(String DienGiai) {
        this.DienGiai = DienGiai;
    }
}
