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
public class CoSoVC implements Serializable{
    private String maCSVC;
    private String tenCSVC;
    private String trangThai;
    private int soLuong;
    private double ChiPhi;

    public CoSoVC() {
    }

    public CoSoVC(String maCSVC, String tenCSVC, String trangThai, int soLuong, double ChiPhi) {
        this.maCSVC = maCSVC;
        this.tenCSVC = tenCSVC;
        this.trangThai = trangThai;
        this.soLuong = soLuong;
        this.ChiPhi = ChiPhi;
    }

    public String getMaCSVC() {
        return maCSVC;
    }

    public String getTenCSVC() {
        return tenCSVC;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getChiPhi() {
        return ChiPhi;
    }

    public void setMaCSVC(String maCSVC) throws Exception{
        if(maCSVC.trim().length() == 0) throw new Exception("Mã cơ sở vật chất không được để trống");
        this.maCSVC = maCSVC;
    }

    public void setTenCSVC(String tenCSVC) throws Exception{
        if(tenCSVC.trim().length() == 0) throw new Exception("Tên cơ sở vật chất không được để trống");
        this.tenCSVC = tenCSVC;
    }

    public void setTrangThai(String trangThai) throws Exception{
        if(trangThai.trim().length() == 0) throw new Exception("Tạng thái cơ sở vật chất không được để trống");
        this.trangThai = trangThai;
    }

    public void setSoLuong(int soLuong) throws Exception{
        if(soLuong <= 0) throw new Exception("Số lượng cơ sở vật chất phải là số dương");
        this.soLuong = soLuong;
    }

    public void setChiPhi(double ChiPhi) throws Exception{
        if(ChiPhi <= 0) throw new Exception("Giá cơ sở vật chất phải là số dương");
        this.ChiPhi = ChiPhi;
    }
    
    
}
