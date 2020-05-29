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
public class PHIEUCHI {
    private int SoPhieuChi;
    private Timestamp NgayLapPhieuChi;
    private String LyDoChi;
    private int SoTienChi;
    
    public PHIEUCHI(){};
    
    public PHIEUCHI(int SoPC, Timestamp NgayLapPC, String LyDo, int SoTien){
        this.SoPhieuChi = SoPC;
        this.NgayLapPhieuChi = NgayLapPC;
        this.LyDoChi = LyDo;
        this.SoTienChi = SoTien;
    }

    public int getSoPhieuChi() {
        return SoPhieuChi;
    }

    public void setSoPhieuChi(int SoPhieuChi) {
        this.SoPhieuChi = SoPhieuChi;
    }

    public Timestamp getNgayLapPhieuChi() {
        return NgayLapPhieuChi;
    }

    public void setNgayLapPhieuChi(Timestamp NgayLapPhieuChi) {
        this.NgayLapPhieuChi = NgayLapPhieuChi;
    }

    public String getLyDoChi() {
        return LyDoChi;
    }

    public void setLyDoChi(String LyDoChi) {
        this.LyDoChi = LyDoChi;
    }

    public int getSoTienChi() {
        return SoTienChi;
    }

    public void setSoTienChi(int SoTienChi) {
        this.SoTienChi = SoTienChi;
    }
}
