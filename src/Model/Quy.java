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
    public double tongQuy;

    public Quy() {
    }

    public Quy(String maQuy, String tenHD, String thoiGian, double chiPhi, double tongQuy) {
        this.maQuy = maQuy;
        this.tenHD = tenHD;
        this.thoiGian = thoiGian;
        this.chiPhi = chiPhi;
        this.tongQuy = tongQuy;
    }

    

    public String getMaQuy() {
        return maQuy;
    }

    public void setMaQuy(String maQuy) throws Exception{
        if(maQuy.trim().length() == 0) throw new Exception("Mã quỹ không được để trống");
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

    public void setThoiGian(String thoiGian) throws Exception{
        if(thoiGian.trim().length() == 0) throw new Exception("Thời gian không được để trống");
        this.thoiGian = thoiGian;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public double getTongQuy() {
        return tongQuy;
    }

    public void setTongQuy(double tongQuy) throws Exception{
        if(tongQuy == 0) throw new Exception("Tổng quỹ không được bằng 0");
        this.tongQuy = tongQuy;
    }



    

    
}
