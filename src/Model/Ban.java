package Model;

import java.io.Serializable;

public class Ban implements Serializable {

    private String maBan, tenBan, maQuy;
    private int soLuongTv;
    private double tongQuy;

    public Ban() {
    }

    public Ban(String maBan, String tenBan, String maQuy, int soLuongTv, float tongQuy) {
        this.maBan = maBan;
        this.tenBan = tenBan;
        this.maQuy = maQuy;
        this.soLuongTv = soLuongTv;
        this.tongQuy = tongQuy;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) throws Exception {
        if (maBan.trim().length() == 0)
            throw new Exception("Mã ban không được để trống");
        this.maBan = maBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) throws Exception {
        if (tenBan.trim().length() == 0)
            throw new Exception("Tên ban không được để trống");
        this.tenBan = tenBan;
    }

    public int getSoLuongTv() {
        return soLuongTv;
    }

    public void setSoLuongTv(int soLuongTv) {
        this.soLuongTv = soLuongTv;
    }

    public double getTongQuy() {
        return tongQuy;
    }

    public void setTongQuy(double tongQuy) {
        this.tongQuy = tongQuy;
    }

    public String getMaQuy() {
        return maQuy;
    }

    public void setMaQuy(String maQuy) throws Exception {
        if (maQuy.trim().length() == 0)
            throw new Exception("Mã quỹ không được để trống");
        this.maQuy = maQuy;
    }

    @Override
    public String toString() {
        return tenBan;
    }
}
