/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uneti.project1.model;

/**
 *
 * @author ptuan
 */
public class HoaDon {
    private int MaHD;
    private String DateOder;
    private int Thanhtien;
    
    public HoaDon(){
        
    }

    public HoaDon(String DateOder, int Thanhtien) {
        this.DateOder = DateOder;
        this.Thanhtien = Thanhtien;
    }

    public HoaDon(int MaHD, String DateOder, int Thanhtien) {
        this.MaHD = MaHD;
        this.DateOder = DateOder;
        this.Thanhtien = Thanhtien;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getDateOder() {
        return DateOder;
    }

    public void setDateOder(String DateOder) {
        this.DateOder = DateOder;
    }

    public int getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(int Thanhtien) {
        this.Thanhtien = Thanhtien;
    }
    
}
