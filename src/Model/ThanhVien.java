package Model;

import java.io.Serializable;

//maTv,tenTv,khóa,chuyenNganh,ngaySinh,gmail,sdt,gTinh,vaiTro,;
public class ThanhVien implements Serializable{

    private String maTV, tenTV, khoa, chuyenNghanh, ban, ngaySinh, gioiTinh, email, sdt, chucDanh;

    public ThanhVien() {
        maTV = tenTV = khoa = chuyenNghanh = ban = ngaySinh = gioiTinh = email = sdt = chucDanh = "";
    }

    public ThanhVien(String maTV, String tenTV, String khoa, String chuyenNghanh, String ban, String ngaySinh, String gioiTinh, String email, String sdt, String chucDanh) {
        this.maTV = maTV;
        this.tenTV = tenTV;
        this.khoa = khoa;
        this.chuyenNghanh = chuyenNghanh;
        this.ban = ban;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.sdt = sdt;
        this.chucDanh = chucDanh;
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

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
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
