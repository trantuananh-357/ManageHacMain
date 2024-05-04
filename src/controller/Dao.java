/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Model.CoSoVC;
import Model.HoatDong;
import Model.Quy;
import Model.ThanhVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Dao {
    Connection conn;
    public Dao(){
         try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url= "jdbc:sqlserver://DESKTOP-35N6B48\\SQLEXPRESS:1433;databaseName=HacClub";
            String username = "sa";
            String password ="123456789";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Ket noi thanh cong");
            
        }
        catch(Exception e ){
            e.printStackTrace();
        }
    }
    public boolean addUser(ThanhVien s){
        
        String sql = "INSERT INTO tblThanhVien(maTV, tenTV, khoa, chuyenNghanh,ban, ngaySinh, gioiTinh, email, sdt, chucDanh) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMaTV());
            ps.setString(2, s.getTenTV());
            ps.setString(3, s.getKhoa());
            ps.setString(4, s.getChuyenNghanh());
            ps.setString(5, s.getBan());
            ps.setString(6, s.getNgaySinh());
            ps.setString(7, s.getGioiTinh());
            ps.setString(8, s.getEmail());
            ps.setString(9, s.getSdt());
            ps.setString(10, s.getChucDanh());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    public boolean removeUser(String maTV){
        String delete = "DELETE FROM tblThanhVien Where maTV = ?";
        try
        {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, maTV);
            int rowsDeleted = ps.executeUpdate();
             if (rowsDeleted > 0) {
            return true; // Trả về true nếu có ít nhất một hàng được xóa
            } else {
                return false; // Trả về false nếu không có hàng nào được xóa
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateUser(String maTV, ThanhVien newThanhVien){
        String update = "Update tblThanhVien SET tenTV = ?, khoa = ?, chuyenNghanh = ?, ban = ?, ngaySinh = ?, gioiTinh = ?, email = ?, sdt = ?, chucDanh = ? WHERE maTV = ?";
        try {
        PreparedStatement ps = conn.prepareStatement(update);
        ps.setString(1, newThanhVien.getTenTV());
        ps.setString(2, newThanhVien.getKhoa());
        ps.setString(3, newThanhVien.getChuyenNghanh());
        ps.setString(4, newThanhVien.getBan());
        ps.setString(5, newThanhVien.getNgaySinh());
        ps.setString(6, newThanhVien.getGioiTinh());
        ps.setString(7, newThanhVien.getEmail());
        ps.setString(8, newThanhVien.getSdt());
        ps.setString(9, newThanhVien.getChucDanh());
        ps.setString(10, maTV);
        
        return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<ThanhVien> getUser(){
        ArrayList<ThanhVien> list = new ArrayList<>();
        String sql = "SELECT * FROM tblThanhVien";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                ThanhVien s = new ThanhVien();
                s.setMaTV(rs.getString("maTV"));
                s.setTenTV(rs.getString("tenTV"));
                s.setKhoa(rs.getString("khoa"));
                s.setChuyenNghanh(rs.getString("chuyenNghanh"));
                s.setBan(rs.getString("ban"));
                s.setNgaySinh(rs.getString("ngaySinh"));
                s.setGioiTinh(rs.getString("gioiTinh"));
                s.setEmail(rs.getString("email"));
                s.setSdt(rs.getString("sdt"));
                s.setChucDanh(rs.getString("chucDanh"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    ////////////////////////////////////
    public boolean addInfras(CoSoVC a){
        String sql = "INSERT INTO tblCSVC(maCSVC, tenCSVC, trangThai, soLuong, Chiphi)" + "VALUES(?,?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, a.getMaCSVC());
            ps.setString(2, a.getTenCSVC());
            ps.setString(3, a.getTrangThai());
            ps.setInt(4, a.getSoLuong());
            ps.setDouble(5, a.getChiPhi());
            return ps.executeUpdate() > 0;
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return false;
    }
     public boolean removeInfras(String maCSVC){
        String delete = "DELETE FROM tblCSVC Where maCSVC = ?";
        try
        {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, maCSVC);
            int rowsDeleted = ps.executeUpdate();
             if (rowsDeleted > 0) {
            return true; // Trả về true nếu có ít nhất một hàng được xóa
            } else {
                return false; // Trả về false nếu không có hàng nào được xóa
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
     public ArrayList<CoSoVC> getInfras(){
        ArrayList<CoSoVC> list = new ArrayList<>();
        String sql = "SELECT * FROM tblCSVC";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CoSoVC s = new CoSoVC();
                s.setMaCSVC(rs.getString("maCSVC"));
                s.setTenCSVC(rs.getString("tenCSVC"));
                s.setTrangThai(rs.getString("trangThai"));
                s.setSoLuong(rs.getInt("soLuong"));
                s.setChiPhi(rs.getDouble("Chiphi"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
     public boolean updateInfras(String maCSVC, CoSoVC newCSVC){
        String update = "Update tblCSVC SET tenCSVC = ?, trangThai = ?, soLuong = ?, Chiphi = ? WHERE maCSVC = ?";
        try {
        PreparedStatement ps = conn.prepareStatement(update);
        ps.setString(5, newCSVC.getMaCSVC());
        ps.setString(1, newCSVC.getTenCSVC());
        ps.setString(2, newCSVC.getTrangThai());
        ps.setInt(3, newCSVC.getSoLuong());
        ps.setDouble(4, newCSVC.getChiPhi());
        return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     /////////////////////////////////Media
     public boolean addMedia(HoatDong a){
        String sql = "INSERT INTO tblHoatDong(maHD, tenHD, loaiHD, thoiGian, soThanhVien, kinhPhi, diaDiem, moTa, danhGia)" + "VALUES(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, a.getMaHD());
            ps.setString(2, a.getTenHD());
            ps.setString(3, a.getLoaiHD());
            ps.setString(4, a.getThoiGian());
            ps.setInt(5, a.getSoThanhVien());
            ps.setDouble(6, a.getKinhPhi());
            ps.setString(7, a.getDiaDiem());
            ps.setString(8, a.getMoTa());
            ps.setString(9, a.getDanhGia());

            return ps.executeUpdate() > 0;
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return false;
    }
     public boolean removeMedia(String maHD){
        String delete = "DELETE FROM tblHoatDong Where tenHD = ?";
        try
        {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, maHD);
            int rowsDeleted = ps.executeUpdate();
             if (rowsDeleted > 0) {
            return true; // Trả về true nếu có ít nhất một hàng được xóa
            } else {
                return false; // Trả về false nếu không có hàng nào được xóa
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
     }
     public ArrayList<HoatDong> getMedia(){
        ArrayList<HoatDong> list = new ArrayList<>();
        String sql = "SELECT * FROM tblHoatDong";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HoatDong s = new HoatDong();
                s.setMaHD(rs.getString("maHD"));
                s.setTenHD(rs.getString("tenHD"));
                s.setLoaiHD(rs.getString("loaiHD"));
                s.setThoiGian(rs.getString("thoiGian"));
                s.setSoThanhVien(rs.getInt("soThanhVien"));
                s.setKinhPhi(rs.getDouble("kinhPhi"));
                s.setDiaDiem(rs.getString("diaDiem"));
                s.setMoTa(rs.getString("moTa"));
                s.setDanhGia(rs.getString("danhGia"));

                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
     public boolean updateMedia(String maHD, HoatDong newHoatDong){
        String update = "Update tblHoatDong SET tenHD = ?, loaiHD = ?, thoiGian = ?, soThanhVien = ?,  kinhPhi = ?, diaDiem = ?, moTa = ?, danhGia = ?, WHERE maHD = ?";
        try {
        PreparedStatement ps = conn.prepareStatement(update);
        ps.setString(1, newHoatDong.getTenHD());
        ps.setString(2, newHoatDong.getLoaiHD());
        ps.setString(3, newHoatDong.getThoiGian());
        ps.setInt(4, newHoatDong.getSoThanhVien());
        ps.setDouble(5, newHoatDong.getKinhPhi());
        ps.setString(6, newHoatDong.getDiaDiem());
        ps.setString(7, newHoatDong.getMoTa());
        ps.setString(8, newHoatDong.getDanhGia());
        ps.setString(9, newHoatDong.getMaHD());
        
        return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    //////////////////////Traning
     
     public boolean addTraining(HoatDong a){
        String sql = "INSERT INTO tblHoatDongDaoTao(maHD, tenHD, loaiHD, thoiGian, soThanhVien, kinhPhi, diaDiem, moTa, danhGia)" + "VALUES(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, a.getMaHD());
            ps.setString(2, a.getTenHD());
            ps.setString(3, a.getLoaiHD());
            ps.setString(4, a.getThoiGian());
            ps.setInt(5, a.getSoThanhVien());
            ps.setDouble(6, a.getKinhPhi());
            ps.setString(7, a.getDiaDiem());
            ps.setString(8, a.getMoTa());
            ps.setString(9, a.getDanhGia());

            return ps.executeUpdate() > 0;
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return false;
    }
     public boolean removeTraining(String maHD){
        String delete = "DELETE FROM tblHoatDongDaoTao Where maHD = ?";
        try
        {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, maHD);
            int rowsDeleted = ps.executeUpdate();
             if (rowsDeleted > 0) {
            return true; // Trả về true nếu có ít nhất một hàng được xóa
            } else {
                return false; // Trả về false nếu không có hàng nào được xóa
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
     }
     public ArrayList<HoatDong> getTraining(){
        ArrayList<HoatDong> list = new ArrayList<>();
        String sql = "SELECT * FROM tblHoatDongDaoTao";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HoatDong s = new HoatDong();
                s.setMaHD(rs.getString("maHD"));
                s.setTenHD(rs.getString("tenHD"));
                s.setLoaiHD(rs.getString("loaiHD"));
                s.setThoiGian(rs.getString("thoiGian"));
                s.setSoThanhVien(rs.getInt("soThanhVien"));
                s.setKinhPhi(rs.getDouble("kinhPhi"));
                s.setDiaDiem(rs.getString("diaDiem"));
                s.setMoTa(rs.getString("moTa"));
                s.setDanhGia(rs.getString("danhGia"));

                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
     public boolean updateTraining(String maHD, HoatDong newHoatDong){
        String update = "Update tblHoatDongDaoTao SET tenHD = ?, loaiHD = ?, thoiGian = ?, soThanhVien = ?,  kinhPhi = ?, diaDiem = ?, moTa = ?, danhGia = ?, WHERE maHD = ?";
        try {
        PreparedStatement ps = conn.prepareStatement(update);
        ps.setString(1, newHoatDong.getTenHD());
        ps.setString(2, newHoatDong.getLoaiHD());
        ps.setString(3, newHoatDong.getThoiGian());
        ps.setInt(4, newHoatDong.getSoThanhVien());
        ps.setDouble(5, newHoatDong.getKinhPhi());
        ps.setString(6, newHoatDong.getDiaDiem());
        ps.setString(7, newHoatDong.getMoTa());
        ps.setString(8, newHoatDong.getDanhGia());
        ps.setString(9, newHoatDong.getMaHD());
        
        return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     //////////////Spend
     public boolean addSpend(Quy a){
        String sql = "INSERT INTO tblQuy(maQuy, tenHD, thoiGian, chiPhi, tongQuy)" + "VALUES(?,?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, a.getMaQuy());
            ps.setString(2, a.getTenHD());
            ps.setString(3, a.getThoiGian());
            ps.setDouble(4, a.getChiPhi());
            ps.setDouble(5, a.getTongQuy());

            return ps.executeUpdate() > 0;
        }
        catch(Exception e){
             e.printStackTrace();
        }
        return false;
    }
     public boolean removeSpend(String maQuy){
        String delete = "DELETE FROM tblQuy Where maQuy = ?";
        try
        {
            PreparedStatement ps = conn.prepareStatement(delete);
            ps.setString(1, maQuy);
            int rowsDeleted = ps.executeUpdate();
             if (rowsDeleted > 0) {
            return true; // Trả về true nếu có ít nhất một hàng được xóa
            } else {
                return false; // Trả về false nếu không có hàng nào được xóa
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
     }
     public ArrayList<Quy> getSpend(){
        ArrayList<Quy> list = new ArrayList<>();
        String sql = "SELECT * FROM tblQuy";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Quy s = new Quy();
                s.setMaQuy(rs.getString("maQuy"));
                s.setTenHD(rs.getString("tenHD"));
                s.setThoiGian(rs.getString("thoiGian"));
                s.setChiPhi(rs.getDouble("chiPhi"));
                s.setTongQuy(rs.getDouble("tongQuy"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
     public boolean updateSpend(String maQuy, Quy newQuy){
        String update = "Update tblQuy SET tenHD = ?, thoiGian = ?, chiPhi = ? WHERE maQuy = ?";
        try {
        PreparedStatement ps = conn.prepareStatement(update);
        ps.setString(1, newQuy.getTenHD());
        ps.setString(2, newQuy.getThoiGian());
        ps.setDouble(3, newQuy.getChiPhi());
        ps.setString(4, newQuy.getMaQuy());
        
        return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
     
     
     
     
    
}
