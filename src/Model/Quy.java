/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Bravo 15
 */
public class Quy implements Serializable{
    private String maQuy;
    private String tenHD;
    private String thoiGian;
    private double chiPhi;
    static public double tongQuy;

    public Quy() {
    }

    public Quy(String maQuy, String tenHD, String thoiGian, double chiPhi) {
        this.maQuy = maQuy;
        this.tenHD = tenHD;
        this.thoiGian = thoiGian;
        this.chiPhi = chiPhi;
    }

    public String getMaQuy() {
        return maQuy;
    }

    public void setMaQuy(String maQuy) {
        this.maQuy = maQuy;
    }

    public String getTenHD() {
        return tenHD;
    }

    public void setTenHD(String tenHD) {
        this.tenHD = tenHD;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public static double getTongQuy() {
        return tongQuy;
    }

    public static void setTongQuy(double tongQuy) {
        Quy.tongQuy = tongQuy;
    }

    

    
}
