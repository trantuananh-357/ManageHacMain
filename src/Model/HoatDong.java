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
public class HoatDong implements Serializable {
    private String maHD;
    private String tenHD;
    private String loaiHD;
    private String thoiGian;
    private int soThanhVien;
    private double kinhPhi;
    private String diaDiem;
    private String moTa;
    private String danhGia;
    private String maBan;
    private String tenBan;

    public HoatDong() {
    }

    public HoatDong(String maHD, String tenHD, String loaiHD, String thoiGian, int soThanhVien, double kinhPhi,
            String diaDiem, String moTa, String danhGia, String maBan, String tenBan) {
        this.maHD = maHD;
        this.tenHD = tenHD;
        this.loaiHD = loaiHD;
        this.thoiGian = thoiGian;
        this.soThanhVien = soThanhVien;
        this.kinhPhi = kinhPhi;
        this.diaDiem = diaDiem;
        this.moTa = moTa;
        this.danhGia = danhGia;
        this.maBan = maBan;
        this.tenBan = tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getTenHD() {
        return tenHD;
    }

    public String getLoaiHD() {
        return loaiHD;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public double getKinhPhi() {
        return kinhPhi;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public String getMoTa() {
        return moTa;
    }

    public String getDanhGia() {
        return danhGia;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setTenHD(String tenHD) throws Exception {
        if (tenHD.trim().length() == 0)
            throw new Exception("Tên hoạt động không được để trống");
        this.tenHD = tenHD;
    }

    public void setLoaiHD(String loaiHD) {
        this.loaiHD = loaiHD;
    }

    public void setThoiGian(String thoiGian) throws Exception {
        if (thoiGian.trim().length() == 0)
            throw new Exception("Thời gian không được để trống");
        this.thoiGian = thoiGian;
    }

    public void setSoThanhVien(int soThanhVien) throws Exception {
        if (soThanhVien <= 0)
            throw new Exception("Số thành viên phải lớn hơn 0");
        this.soThanhVien = soThanhVien;
    }

    public void setKinhPhi(double kinhPhi) throws Exception {
        if (kinhPhi < 0)
            throw new Exception("Kinh phí không nhỏ hơn 0");
        this.kinhPhi = kinhPhi;
    }

    public void setDiaDiem(String diaDiem) throws Exception {
        if (diaDiem.trim().length() == 0)
            throw new Exception("Địa điểm không được để trống");
        this.diaDiem = diaDiem;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) throws Exception {
        if (maBan.trim().length() == 0)
            throw new Exception("Mã ban không được để trống");
        this.maBan = maBan;
    }

}
