package Model;

import java.io.Serializable;

//maTv,tenTv,khóa,chuyenNganh,ngaySinh,gmail,sdt,gTinh,vaiTro,;
public class ThanhVien implements Serializable {

    private String maTV, tenTV, khoa, chuyenNghanh, tenBan, ngaySinh, gioiTinh, email, sdt, chucDanh, maBan;

    public ThanhVien() {
        maTV = tenTV = khoa = chuyenNghanh = tenBan = ngaySinh = gioiTinh = email = sdt = chucDanh = maBan = "";
    }

    public ThanhVien(String maTV, String tenTV, String khoa, String chuyenNghanh, String ngaySinh,
            String gioiTinh, String email, String sdt, String chucDanh, String maBan) {
        this.maTV = maTV;
        this.tenTV = tenTV;
        this.khoa = khoa;
        this.chuyenNghanh = chuyenNghanh;
        // this.tenBan = tenBan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.sdt = sdt;
        this.chucDanh = chucDanh;
        this.maBan = maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getMaBan() {
        return maBan;
    }

    public String getMaTV() {
        return maTV;
    }

    public void setMaTV(String maTV) {
        this.maTV = maTV;
    }

    public String getTenTV() {
        return tenTV;
    }

    public void setTenTV(String tenTV) {
        this.tenTV = tenTV;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String ban) {
        this.tenBan = ban;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }
}