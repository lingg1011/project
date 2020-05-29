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
public class PHIEUNHAP {
    private int SoPhieuNhap;
    private Timestamp NgayLapPhieuNhap;
    private int Thue;
    private int TongGiaTri;
    
    public PHIEUNHAP(){};
    
    public PHIEUNHAP(int SoPN, Timestamp NgayLapPN, int Thue, int TongGTri){
        this.SoPhieuNhap = SoPN;
        this.NgayLapPhieuNhap = NgayLapPN;
        this.Thue = Thue;
        this.TongGiaTri = TongGTri;
    }

    public int getSoPhieuNhap() {
        return SoPhieuNhap;
    }

    public void setSoPhieuNhap(int SoPhieuNhap) {
        this.SoPhieuNhap = SoPhieuNhap;
    }

    public Timestamp getNgayLapPhieuNhap() {
        return NgayLapPhieuNhap;
    }

    public void setNgayLapPhieuNhap(Timestamp NgayLapPhieuNhap) {
        this.NgayLapPhieuNhap = NgayLapPhieuNhap;
    }

    public int getThue() {
        return Thue;
    }

    public void setThue(int Thue) {
        this.Thue = Thue;
    }

    public int getTongGiaTri() {
        return TongGiaTri;
    }

    public void setTongGiaTri(int TongGiaTri) {
        this.TongGiaTri = TongGiaTri;
    }
}
