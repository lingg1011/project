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
public class HOADON {
    private int SoHoaDon;
    private Timestamp NgayLapHoaDon;
    private int Thue;
    private int TongGiaTri;
    
    public HOADON (){};
    
    public HOADON(int SoHD, Timestamp NgayLapHD, int Thue, int TongGTri){
        this.SoHoaDon = SoHD;
        this.NgayLapHoaDon = NgayLapHD;
        this.Thue = Thue;
        this.TongGiaTri = TongGTri;
    }

    public int getSoHoaDon() {
        return SoHoaDon;
    }

    public void setSoHoaDon(int SoHoaDon) {
        this.SoHoaDon = SoHoaDon;
    }

    public Timestamp getNgayLapHoaDon() {
        return NgayLapHoaDon;
    }

    public void setNgayLapHoaDon(Timestamp NgayLapHoaDon) {
        this.NgayLapHoaDon = NgayLapHoaDon;
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
