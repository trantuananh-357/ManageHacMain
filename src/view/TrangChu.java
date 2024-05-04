package view;

import Model.CoSoVC;
import Model.HoatDong;
import Model.Quy;
import Model.ThanhVien;
import controller.Dao;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

public class TrangChu extends javax.swing.JFrame implements View {
    private int indexThanhVien;
    private int indexQuy;
    private ArrayList<ThanhVien> listTV;
    private ArrayList<ThanhVien> listTVTimKiem;
    private ArrayList<CoSoVC> listCSVC;
    private List<CoSoVC> listTK;
    private List<CoSoVC> listCSVCSort;
    private ArrayList<HoatDong> listHD;
    private List<HoatDong> listTKHD;
    private List<HoatDong> listHDTT;
    
    private List<Quy> listQuy;
    private List<Quy> listTKCT;
    
    private final DefaultTableModel modelTV;
    private final DefaultTableModel modelCSVC;
    private final DefaultTableModel modelHDDT;
    private final DefaultTableModel modelHDTT;
    private final DefaultTableModel modelQuy;
    

    DecimalFormat df = new DecimalFormat("#,###.000");

    public TrangChu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Trang chủ");
        listTV = new Dao().getUser();
        listCSVC = new Dao().getInfras();
        listCSVCSort = new ArrayList<>();
        listTK = new ArrayList<>();
        listTKHD = new ArrayList<>();//traning
        listHD = new Dao().getTraining(); ////Dao
        listHDTT = new Dao().getMedia();
        listQuy = new Dao().getSpend();
        listTKCT = new ArrayList<>();//media
        modelTV = (DefaultTableModel) tblThanhVien.getModel();
        modelCSVC = (DefaultTableModel) tblCSVC.getModel();
        modelHDDT = (DefaultTableModel) tblHDDT.getModel();
        modelHDTT = (DefaultTableModel) tblTT.getModel();
        modelQuy = (DefaultTableModel) tableQuanLyChiTieu.getModel();
        showDataThanhVien();
        showDataQuy();
        showDataCSVC();
        showDataHDTT();
        showDataHDDT();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane7 = new javax.swing.JScrollPane();
        frameView = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        User = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThanhVien = new javax.swing.JTable();
        btnThemTV = new javax.swing.JButton();
        btnSuaThanhVien = new javax.swing.JButton();
        btnXoaThanhVien = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTongThanhVien = new javax.swing.JTextField();
        txtTimKiemThanhVien = new javax.swing.JTextField();
        btnTimKiemThanhVien = new javax.swing.JButton();
        rbtnNam = new javax.swing.JRadioButton();
        rbtnTruongBan = new javax.swing.JRadioButton();
        rbtnNu = new javax.swing.JRadioButton();
        btnLocTheoTieuChi = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CSVC = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCSVC = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        themCSVC = new javax.swing.JButton();
        suaCSVC = new javax.swing.JButton();
        xoaCSVC = new javax.swing.JButton();
        bttimkiem = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txttim = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        rbtsoluong = new javax.swing.JRadioButton();
        rbtdongia = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        MEdia = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTongThanhVienTT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTongChiPhiTT = new javax.swing.JTextField();
        themTT = new javax.swing.JButton();
        suaTT = new javax.swing.JButton();
        xoaTT = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Traning = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHDDT = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtThanhVienHDDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtChiPhiHDDT = new javax.swing.JTextField();
        themDT = new javax.swing.JButton();
        suaDT = new javax.swing.JButton();
        xoaDT = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        Spend = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuanLyChiTieu = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtchiphicon = new javax.swing.JTextField();
        themchitieu = new javax.swing.JButton();
        suachitieu = new javax.swing.JButton();
        xoachitieu = new javax.swing.JButton();
        bttimkiemchitieu = new javax.swing.JButton();
        txttimkiemchitieu = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        home = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        infra = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        media = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        train = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        spend = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        user = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frameView.setBackground(new java.awt.Color(204, 204, 204));
        frameView.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                frameViewAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        frameView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frameViewMouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(102, 255, 255));

        jLabel20.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        jLabel20.setText("Welcome to HAC Club - Burn out your youth");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(408, 408, 408))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 255));
        jLabel11.setText("SỰ KIỆN SẮP TỚI");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/EVENT2.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/EVENT1.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/EVENT1.jpg"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/EVENT2.jpg"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(153, 153, 255));
        jLabel42.setText("BAN CHỦ NHIỆM");

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon_person.png"))); // NOI18N

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon_person.png"))); // NOI18N

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon_person.png"))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(153, 153, 255));
        jLabel46.setText("THÀNH VIÊN MỚI");

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon_person.png"))); // NOI18N

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon_person.png"))); // NOI18N

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon_person.png"))); // NOI18N

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(HomeLayout.createSequentialGroup()
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(228, 228, 228)
                                .addComponent(jLabel50)))
                        .addGap(32, 32, 32)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(HomeLayout.createSequentialGroup()
                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel12)))))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addGap(40, 40, 40)
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(HomeLayout.createSequentialGroup()
                                .addGap(335, 335, 335)
                                .addComponent(jLabel50))))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 452, Short.MAX_VALUE))
        );

        frameView.addTab("", Home);

        User.setBackground(new java.awt.Color(204, 204, 204));

        tblThanhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã TV", "Tên TV", "Khoá", "Chuyên Nghành", "Ban", "Ngày sinh", "Giới tính", "Email", "SĐT", "Chức vụ"
            }
        ));
        jScrollPane2.setViewportView(tblThanhVien);

        btnThemTV.setText("Thêm thành viên");
        btnThemTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTVActionPerformed(evt);
            }
        });

        btnSuaThanhVien.setText("Sửa thông tin thành viên");
        btnSuaThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThanhVienActionPerformed(evt);
            }
        });

        btnXoaThanhVien.setText("Xoá thông tin thành viên ");
        btnXoaThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaThanhVienActionPerformed(evt);
            }
        });

        jLabel18.setText("Tổng số lượng thành viên :");

        txtTongThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongThanhVienActionPerformed(evt);
            }
        });

        btnTimKiemThanhVien.setText("Tìm kiếm");
        btnTimKiemThanhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemThanhVienActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnNam);
        rbtnNam.setText("Nam");

        buttonGroup1.add(rbtnTruongBan);
        rbtnTruongBan.setText("Trưởng Ban");

        buttonGroup1.add(rbtnNu);
        rbtnNu.setText("Nữ");

        btnLocTheoTieuChi.setText("Lọc");
        btnLocTheoTieuChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocTheoTieuChiActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(102, 255, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel22.setText("QUẢN LÍ THÀNH VIÊN CLB HAC HaUI");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout UserLayout = new javax.swing.GroupLayout(User);
        User.setLayout(UserLayout);
        UserLayout.setHorizontalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLayout.createSequentialGroup()
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserLayout.createSequentialGroup()
                        .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(UserLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(UserLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTongThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(UserLayout.createSequentialGroup()
                                        .addComponent(btnThemTV)
                                        .addGap(66, 66, 66)
                                        .addComponent(btnSuaThanhVien)
                                        .addGap(90, 90, 90)
                                        .addComponent(btnXoaThanhVien)
                                        .addGap(73, 73, 73)
                                        .addComponent(rbtnNam)
                                        .addGap(29, 29, 29)
                                        .addComponent(rbtnNu)
                                        .addGap(34, 34, 34)
                                        .addComponent(rbtnTruongBan)
                                        .addGap(41, 41, 41)
                                        .addComponent(btnLocTheoTieuChi)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRefresh))))
                            .addGroup(UserLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8)))
                        .addGap(0, 428, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(UserLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTimKiemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnTimKiemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        UserLayout.setVerticalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimKiemThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiemThanhVien))
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtTongThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemTV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnNam)
                    .addComponent(rbtnNu)
                    .addComponent(rbtnTruongBan)
                    .addComponent(btnLocTheoTieuChi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(616, Short.MAX_VALUE))
        );

        frameView.addTab("", User);

        CSVC.setBackground(new java.awt.Color(204, 204, 204));

        tblCSVC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thiết bị", "Tên thiết bị", "Trạng thái", "Số lượng", "Chi Phí CSVC"
            }
        ));
        jScrollPane5.setViewportView(tblCSVC);

        jLabel5.setText("Tổng số lượng thiết bị:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tổng chi phí:");

        themCSVC.setText("Thêm");
        themCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themCSVCActionPerformed(evt);
            }
        });

        suaCSVC.setText("Sửa");
        suaCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaCSVCActionPerformed(evt);
            }
        });

        xoaCSVC.setText("Xoá");
        xoaCSVC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaCSVCActionPerformed(evt);
            }
        });

        bttimkiem.setText("Tìm kiếm");
        bttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimkiemActionPerformed(evt);
            }
        });

        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txttim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimActionPerformed(evt);
            }
        });

        jButton4.setText("Sắp xếp");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        rbtsoluong.setText("Số lương");

        rbtdongia.setText("Đơn giá");
        rbtdongia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtdongiaActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(102, 255, 255));

        jLabel34.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel34.setText("QUẢN LÝ CƠ SỞ VẬT CHẤT ");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout CSVCLayout = new javax.swing.GroupLayout(CSVC);
        CSVC.setLayout(CSVCLayout);
        CSVCLayout.setHorizontalGroup(
            CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CSVCLayout.createSequentialGroup()
                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(CSVCLayout.createSequentialGroup()
                        .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CSVCLayout.createSequentialGroup()
                                .addGap(709, 709, 709)
                                .addComponent(jLabel6))
                            .addGroup(CSVCLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CSVCLayout.createSequentialGroup()
                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CSVCLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(themCSVC)
                        .addGap(38, 38, 38)
                        .addComponent(suaCSVC)
                        .addGap(53, 53, 53)
                        .addComponent(xoaCSVC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtsoluong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtdongia)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(CSVCLayout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bttimkiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addGap(253, 253, 253))
            .addGroup(CSVCLayout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CSVCLayout.setVerticalGroup(
            CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CSVCLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttim, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CSVCLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suaCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoaCSVC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CSVCLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(CSVCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtdongia)
                            .addComponent(rbtsoluong)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(567, Short.MAX_VALUE))
        );

        frameView.addTab("", CSVC);

        MEdia.setBackground(new java.awt.Color(204, 204, 204));

        tblTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sự Kiện", "Tên sự kiện", "Đánh giá", "Mô tả", "Số lượng thành viên", "Địa điểm", "Thời gian ", "Chi Phí"
            }
        ));
        jScrollPane3.setViewportView(tblTT);

        jLabel1.setText("Tổng thành viên :");

        jLabel2.setText("Tổng chi phí :");

        themTT.setText("Thêm sự kiện");
        themTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themTTActionPerformed(evt);
            }
        });

        suaTT.setText("Sửa sự kiện");
        suaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaTTActionPerformed(evt);
            }
        });

        xoaTT.setText("Xoá sự kiện");
        xoaTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaTTActionPerformed(evt);
            }
        });

        jPanel14.setBackground(new java.awt.Color(102, 255, 255));

        jLabel36.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel36.setText("QUẢN LÝ HOẠT ĐỘNG TRUYỀN THÔNG VÀ SỰ KIỆN CLB");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout MEdiaLayout = new javax.swing.GroupLayout(MEdia);
        MEdia.setLayout(MEdiaLayout);
        MEdiaLayout.setHorizontalGroup(
            MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MEdiaLayout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(MEdiaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTongThanhVienTT, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTongChiPhiTT, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(MEdiaLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(themTT, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(suaTT)
                .addGap(132, 132, 132)
                .addComponent(xoaTT)
                .addGap(0, 665, Short.MAX_VALUE))
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MEdiaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {suaTT, themTT, xoaTT});

        MEdiaLayout.setVerticalGroup(
            MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MEdiaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTongThanhVienTT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTongChiPhiTT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(MEdiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themTT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaTT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaTT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(613, Short.MAX_VALUE))
        );

        frameView.addTab("", MEdia);

        Traning.setBackground(new java.awt.Color(204, 204, 204));

        tblHDDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hoạt Động", "Tên hoạt động", "Thời gian", "Địa điểm", "Mô tả ", "Số lượng thành viên", "Kinh Phí"
            }
        ));
        jScrollPane4.setViewportView(tblHDDT);

        jLabel3.setText("Tổng số lượng thành viên :");

        jLabel4.setText("Tổng chi phí:");

        themDT.setText("Thêm");
        themDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themDTActionPerformed(evt);
            }
        });

        suaDT.setText("Sửa");
        suaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaDTActionPerformed(evt);
            }
        });

        xoaDT.setText("Xoá");
        xoaDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaDTActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Tim");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Refesh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(102, 255, 255));

        jLabel38.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel38.setText("QUẢN LÝ HOẠT ĐỘNG ĐÀO TẠO");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TraningLayout = new javax.swing.GroupLayout(Traning);
        Traning.setLayout(TraningLayout);
        TraningLayout.setHorizontalGroup(
            TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TraningLayout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TraningLayout.createSequentialGroup()
                .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TraningLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtThanhVienHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TraningLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(themDT)
                        .addGap(94, 94, 94)
                        .addComponent(suaDT)
                        .addGap(82, 82, 82)
<<<<<<< HEAD
                        .addComponent(xoaDT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 603, Short.MAX_VALUE)
=======
                        .addComponent(xoaDT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(refreshBtn)))
                .addGap(18, 18, 18)
>>>>>>> ad6fb40485c0db7ddc92c159d352f9547669daf0
                .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(TraningLayout.createSequentialGroup()
                        .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jButton1))
                        .addGap(23, 23, 23)
                        .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtChiPhiHDDT, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addGap(50, 50, 50))
            .addGroup(TraningLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        TraningLayout.setVerticalGroup(
            TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TraningLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtThanhVienHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtChiPhiHDDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(TraningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaDT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 586, Short.MAX_VALUE)
=======
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 573, Short.MAX_VALUE)
>>>>>>> ad6fb40485c0db7ddc92c159d352f9547669daf0
                .addComponent(jButton3)
                .addGap(27, 27, 27))
        );

        frameView.addTab("", Traning);

        Spend.setBackground(new java.awt.Color(204, 204, 204));

        tableQuanLyChiTieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã chi tiêu", "Tên chi tiêu", "Thơi gian", "Thu/Chi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableQuanLyChiTieu);

        jLabel13.setText("Tổng Chi Phí");

        themchitieu.setText("Thêm");
        themchitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themchitieuActionPerformed(evt);
            }
        });

        suachitieu.setText("Sửa");
        suachitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suachitieuActionPerformed(evt);
            }
        });

        xoachitieu.setText("Xóa");
        xoachitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoachitieuActionPerformed(evt);
            }
        });

        bttimkiemchitieu.setText("Tìm kiếm");
        bttimkiemchitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttimkiemchitieuActionPerformed(evt);
            }
        });

        txttimkiemchitieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemchitieuActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(102, 255, 255));

        jLabel40.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel40.setText("Quản lý chi tiêu");

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/10904615_disco_ball_mirror_miscellaneous_dance_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout SpendLayout = new javax.swing.GroupLayout(Spend);
        Spend.setLayout(SpendLayout);
        SpendLayout.setHorizontalGroup(
            SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpendLayout.createSequentialGroup()
                .addGroup(SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SpendLayout.createSequentialGroup()
                .addGroup(SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SpendLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtchiphicon, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SpendLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(themchitieu)
                        .addGap(57, 57, 57)
                        .addComponent(suachitieu)
                        .addGap(58, 58, 58)
                        .addComponent(xoachitieu)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 548, Short.MAX_VALUE)
                        .addComponent(bttimkiemchitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttimkiemchitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        SpendLayout.setVerticalGroup(
            SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpendLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtchiphicon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SpendLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttimkiemchitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bttimkiemchitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SpendLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(SpendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themchitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suachitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xoachitieu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(594, Short.MAX_VALUE))
        );

        frameView.addTab("", Spend);

        jScrollPane7.setViewportView(frameView);

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));

        jLabel15.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel15.setText("HAC CLUB");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/2324150_club_dance_disco_fun_music_icon.png"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Home");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/house.png"))); // NOI18N

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        infra.setBackground(new java.awt.Color(204, 204, 204));
        infra.setPreferredSize(new java.awt.Dimension(238, 48));
        infra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infraMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Infrastructure");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/csvc.png"))); // NOI18N

        javax.swing.GroupLayout infraLayout = new javax.swing.GroupLayout(infra);
        infra.setLayout(infraLayout);
        infraLayout.setHorizontalGroup(
            infraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infraLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infraLayout.setVerticalGroup(
            infraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        media.setBackground(new java.awt.Color(204, 204, 204));
        media.setPreferredSize(new java.awt.Dimension(238, 48));
        media.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mediaMouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Media");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/8687858_ic_fluent_star_emphasis_regular_icon.png"))); // NOI18N

        javax.swing.GroupLayout mediaLayout = new javax.swing.GroupLayout(media);
        media.setLayout(mediaLayout);
        mediaLayout.setHorizontalGroup(
            mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mediaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mediaLayout.setVerticalGroup(
            mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        train.setBackground(new java.awt.Color(204, 204, 204));
        train.setPreferredSize(new java.awt.Dimension(238, 48));
        train.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trainMouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Training");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/daotao.png"))); // NOI18N

        javax.swing.GroupLayout trainLayout = new javax.swing.GroupLayout(train);
        train.setLayout(trainLayout);
        trainLayout.setHorizontalGroup(
            trainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        trainLayout.setVerticalGroup(
            trainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        spend.setBackground(new java.awt.Color(204, 204, 204));
        spend.setPreferredSize(new java.awt.Dimension(238, 48));
        spend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spendMouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Spend");

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/8687401_ic_fluent_money_regular_icon.png"))); // NOI18N

        javax.swing.GroupLayout spendLayout = new javax.swing.GroupLayout(spend);
        spend.setLayout(spendLayout);
        spendLayout.setHorizontalGroup(
            spendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(spendLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        spendLayout.setVerticalGroup(
            spendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        user.setBackground(new java.awt.Color(204, 204, 204));
        user.setPreferredSize(new java.awt.Dimension(238, 48));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Users");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon_person.png"))); // NOI18N
        jLabel19.setText("jLabel5");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(infra, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
            .addComponent(media, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
            .addComponent(train, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
            .addComponent(spend, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(infra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(train, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frameViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameViewMouseClicked

    }//GEN-LAST:event_frameViewMouseClicked

    private void frameViewAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_frameViewAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_frameViewAncestorAdded

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        showDataThanhVien();
        txtTimKiemThanhVien.setText("");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnLocTheoTieuChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocTheoTieuChiActionPerformed
        // TODO add your handling code here:

        if (!rbtnNam.isSelected() && !rbtnNu.isSelected() && !rbtnTruongBan.isSelected()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một tiêu chí!");
            return;
        }

        List<ThanhVien> filteredList = new ArrayList<>();
        for (ThanhVien x : listTV) {
            if (rbtnNam.isSelected() && x.getGioiTinh().equals("Nam")) {
                filteredList.add(x);
            } else if (rbtnNu.isSelected() && x.getGioiTinh().equals("Nữ")) {
                filteredList.add(x);
            } else if (rbtnTruongBan.isSelected() && x.getChucDanh().equals("Trưởng Ban")) {
                filteredList.add(x);
            }
        }
        showData(filteredList, modelTV);
        tongThanhVien(filteredList);
    }//GEN-LAST:event_btnLocTheoTieuChiActionPerformed

    private void btnTimKiemThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemThanhVienActionPerformed
        // TODO add your handling code here:
        String tim = txtTimKiemThanhVien.getText().toUpperCase();
        int ktra = 0;
        for (ThanhVien x : listTV) {
            if (x.getTenTV().toUpperCase().contains(tim)|| x.getMaTV().toUpperCase().equals(tim)) {
                ktra = 1;
                break;
            }
        }
        if (tim.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập tên hoặc mã thành viên cần tìm!");
        } else if (ktra == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không tồn tại tên hoặc mã thành viên này trong danh sách!");
        }else {
            TimKiemTv1 editTV = new TimKiemTv1(this, rootPaneCheckingEnabled);
            List<ThanhVien> listTVTimKiem1 = new ArrayList<>();
            for (ThanhVien x : listTV) {
                if (x.getTenTV().toUpperCase().contains(tim) || x.getMaTV().toUpperCase().equals(tim)) {
                    listTVTimKiem1.add(x);
                }
            }
            editTV.updateTable(listTVTimKiem1);
            editTV.setVisible(true);
        }
        this.showData(listTV, modelTV);
    }//GEN-LAST:event_btnTimKiemThanhVienActionPerformed

    private void txtTongThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongThanhVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongThanhVienActionPerformed

    private void btnXoaThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaThanhVienActionPerformed
        // TODO add your handling code here:
        int removeThanhVien = tblThanhVien.getSelectedRow();
        System.out.println(removeThanhVien);
        if (removeThanhVien == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        } else if (listTV.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xoá!");
        } else{
            if(new Dao().removeUser(tblThanhVien.getValueAt(removeThanhVien, 0).toString())){
                System.out.println(removeThanhVien);
                            listTV.remove(removeThanhVien);
            }
        }
        showDataThanhVien();
    }//GEN-LAST:event_btnXoaThanhVienActionPerformed

    private void btnSuaThanhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThanhVienActionPerformed
        // TODO add your handling code here:
        indexThanhVien = tblThanhVien.getSelectedRow();
        if (listTV.size() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                "Hãy nhập thêm thành viên");
        } else if (indexThanhVien == -1) {
            JOptionPane.showMessageDialog(rootPane,
                "Hãy chọn thành viên rồi chỉnh sửa !");
        } else {
            EditThanhVien editTV = new EditThanhVien(this, rootPaneCheckingEnabled);
            editTV.setEditData(listTV.get(indexThanhVien));
            editTV.setVisible(true);
        }
        showDataThanhVien();
    }//GEN-LAST:event_btnSuaThanhVienActionPerformed

    private void btnThemTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTVActionPerformed
        new AddThanhVien(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnThemTVActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        showDataQuy();
        txttimkiemchitieu.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txttimkiemchitieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemchitieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemchitieuActionPerformed

    private void bttimkiemchitieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttimkiemchitieuActionPerformed
        // TODO add your handling code here:
        listTKCT.removeAll(listTKCT);
        int flag = 0;
        if(txttimkiemchitieu.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập mã quỹ cần tìm!");
        }
        else{
            for(Quy item : listQuy){
            if (item.getTenHD().toLowerCase().contains(txttimkiemchitieu.getText().toLowerCase())
                ||(item.getMaQuy().toLowerCase().contains(txttimkiemchitieu.getText().toLowerCase()))
                ||(item.getThoiGian().toLowerCase().contains(txttimkiemchitieu.getText().toLowerCase()))
            ) {
                flag = 1;
                listTKCT.add(item);
            }
            }
            if(flag == 1){
                showDataQuySearch();
            }
            else{
                 JOptionPane.showMessageDialog(rootPane, "Không tồn tại mã quỹ như đã nhập!");
            }
        }
                
        
    }//GEN-LAST:event_bttimkiemchitieuActionPerformed

    private void xoachitieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoachitieuActionPerformed
        // TODO add your handling code here:
        int rmQuy = tableQuanLyChiTieu.getSelectedRow();
        if(rmQuy == -1){
            JOptionPane.showMessageDialog(rootPane, "Bạn chưac họn thông tin cần xóa");
        }
        else{
            if(new Dao().removeSpend(tableQuanLyChiTieu.getValueAt(rmQuy, 0).toString())){
                listQuy.remove(rmQuy);
            }
        }
        showDataQuy();
    }//GEN-LAST:event_xoachitieuActionPerformed

    private void suachitieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suachitieuActionPerformed
        // TODO add your handling code here:
        indexQuy  = tableQuanLyChiTieu.getSelectedRow();
        if (listQuy.size() == 0) {
            JOptionPane.showMessageDialog(rootPane,
                "Danh sach quy dang rỗng");
        } else if (indexQuy == -1) {
            JOptionPane.showMessageDialog(rootPane,
                "Chọn phần thông tin bạn muốn chỉnh sửa rồi chỉnh sửa !");
        } else {
            EditQuy editQuy = new EditQuy(this, rootPaneCheckingEnabled);
            editQuy.setDefaultData(listQuy.get(indexQuy));
            editQuy.setVisible(true);
        }
        showDataQuy();
    }//GEN-LAST:event_suachitieuActionPerformed

    private void themchitieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themchitieuActionPerformed
         new AddQuy(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themchitieuActionPerformed

    private void xoaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaTTActionPerformed
        // TODO add your handling code here:
        int vitri = tblTT.getSelectedRow();
        if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        } else if (listHDTT.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xoá!");
        } else {
            if(new Dao().removeMedia(tblTT.getValueAt(vitri, 0).toString())){
                listHDTT.remove(vitri);
            }
            showData(listHDTT, modelHDTT);
        }
        showDataHDTT();
    }//GEN-LAST:event_xoaTTActionPerformed

    private void suaTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaTTActionPerformed
        // TODO add your handling code here:
        int vitri = tblTT.getSelectedRow();
        if (listHDTT.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm sự kiện");
        } else if (vitri == -1) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 hàng rồi chỉnh sửa !");
        } else {
            new EditTruyenThong(this, rootPaneCheckingEnabled, vitri).setVisible(true);
        }
        showDataHDTT();
    }//GEN-LAST:event_suaTTActionPerformed

    private void themTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themTTActionPerformed
        // TODO add your handling code here:
        new AddTruyenThong(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themTTActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        showDataHDDT();
        jTextField1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        listTKHD.removeAll(listTKHD);
        for(HoatDong item : listHD){
            if (item.getTenHD().toLowerCase().contains(jTextField1.getText().toLowerCase())
                ||(item.getThoiGian().toLowerCase().contains(jTextField1.getText().toLowerCase()))
                ||(item.getDiaDiem().toLowerCase().contains(jTextField1.getText().toLowerCase()))
            ) {
                listTKHD.add(item);

            }
        }
        showDataDTSearch();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void xoaDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaDTActionPerformed
        int vitri = tblHDDT.getSelectedRow();
        if(vitri == -1){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        }
        else if(listHD.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xóa");
        }
        else{
//            int isCheckYesNo = JOptionPane.showConfirmDialog(null,
//                "Bạn có thật sự muốn xóa?", "Select an Option...", JOptionPane.YES_NO_CANCEL_OPTION);
//            if (isCheckYesNo == 0) {
                if(new Dao().removeTraining(tblHDDT.getValueAt(vitri, 0).toString())){
                    System.out.println(tblHDDT.getValueAt(vitri, 0).toString());
                    listHD.remove(vitri);
                }
                showData(listHD, modelHDDT);
                JOptionPane.showMessageDialog(rootPane, "Xóa thanh cong!");
//            }
        }
    }//GEN-LAST:event_xoaDTActionPerformed

    private void suaDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaDTActionPerformed
        int vitri = tblHDDT.getSelectedRow();
        if(listHD.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm hoạt động");
        }
        else if(vitri == -1){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 dòng trước");
        }
        else{
            new EditDaoTao(this, rootPaneCheckingEnabled, vitri).setVisible(true);
        }
        showDataHDDT();
    }//GEN-LAST:event_suaDTActionPerformed

    private void themDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themDTActionPerformed
        new AddDaoTao(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themDTActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        listCSVCSort.removeAll(listCSVCSort);
        listCSVCSort= new Dao().getInfras();
        if(rbtsoluong.isSelected() == true){
            Collections.sort(listCSVCSort , new sortByCountInCSVC()) ;
        }
        else if(rbtdongia.isSelected() == true){
            Collections.sort(listCSVCSort , new sortByGiainCSVC());
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn tiêu chí sắp xếp");
        }
        showDataCSVCSort();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        showDataCSVC();
        txttim.setText("");
        rbtsoluong.setSelected(false);
        rbtdongia.setSelected(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttimkiemActionPerformed
        // TODO add your handling code here:
        listTK.removeAll(listTK);
        int flag = 0;
        if(txttim.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập vào mã thiết bị hoặc tên thiết bị để tìm kiếm!");
        }
        else{
            for(CoSoVC item : listCSVC){
                if (item.getTenCSVC().toLowerCase().contains(txttim.getText().toLowerCase())
                    ||(item.getMaCSVC().toLowerCase().contains(txttim.getText().toLowerCase()))
                    ||(item.getTrangThai().toLowerCase().contains(txttim.getText().toLowerCase()))
                ) {
                    flag = 1;
                    listTK.add(item);
                }
            }
            if(flag == 0){
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy thiết bị cần tìm! Vui lòng nhập lại!");
            }
            else{
                showDataCSVCSearch();
            }
        }
    }//GEN-LAST:event_bttimkiemActionPerformed

    private void xoaCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaCSVCActionPerformed
        int vitri = tblCSVC.getSelectedRow();
        if(vitri == -1){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng rồi ấn nút xoá !");
        }
        else if(listCSVC.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Không có dữ liệu để xóa");
        }
        else{
            if(new Dao().removeInfras(tblCSVC.getValueAt(vitri, 0).toString())){
                            listCSVC.remove(vitri);
            }
            showData(listCSVC, modelCSVC);
        }
        showDataCSVC();
    }//GEN-LAST:event_xoaCSVCActionPerformed

    private void suaCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaCSVCActionPerformed
        int vitri = tblCSVC.getSelectedRow();
        if(listCSVC.size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Hãy nhập thêm thiết bị");
        }
        else if(vitri == -1){
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 dòng trước");
        }
        else{
            new EditCSVC(this, rootPaneCheckingEnabled, vitri).setVisible(true);
        }
        showDataCSVC();
    }//GEN-LAST:event_suaCSVCActionPerformed

    private void themCSVCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themCSVCActionPerformed
        new AddCSVC(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_themCSVCActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        frameView.setSelectedIndex(0);
        setColor(home);
        resetColor(user);

        resetColor(infra);

        resetColor(train);

        resetColor(spend);


        resetColor(media);

    }//GEN-LAST:event_homeMouseClicked

    private void infraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infraMouseClicked
        // TODO add your handling code here:
        frameView.setSelectedIndex(2);
        setColor(infra);
        resetColor(user);

        resetColor(home);

        resetColor(train);

        resetColor(spend);


        resetColor(media);

    }//GEN-LAST:event_infraMouseClicked

    private void mediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mediaMouseClicked
        // TODO add your handling code here:
        frameView.setSelectedIndex(3);
        setColor(media);
        resetColor(user);

        resetColor(infra);

        resetColor(train);

        resetColor(spend);

        resetColor(home);
    }//GEN-LAST:event_mediaMouseClicked

    private void trainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trainMouseClicked
        frameView.setSelectedIndex(4);
        setColor(train);
        resetColor(user);

        resetColor(infra);

        resetColor(home);

        resetColor(spend);

        resetColor(media);
    }//GEN-LAST:event_trainMouseClicked

    private void spendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spendMouseClicked
        frameView.setSelectedIndex(5);
        setColor(spend);
        resetColor(user);

        resetColor(infra);

        resetColor(train);

        resetColor(home);

        resetColor(media);
    }//GEN-LAST:event_spendMouseClicked

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        // TODO add your handling code here:
        frameView.setSelectedIndex(1);
        setColor(user);
        resetColor(home);

        resetColor(infra);

        resetColor(train);

        resetColor(spend);


        resetColor(media);
    }//GEN-LAST:event_userMouseClicked

    private void txttimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimActionPerformed

    private void rbtdongiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtdongiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtdongiaActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        showDataHDDT();
    }//GEN-LAST:event_refreshBtnActionPerformed
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(242, 242, 242));
    }
     void resetColor(JPanel panel){
        panel.setBackground(new Color(204, 204, 204));

    }
    public void tongThanhVien(List<ThanhVien> list){
        int tong = 0;
        for(ThanhVien x : list){
            tong += 1;
        }
        txtTongThanhVien.setText(String.valueOf(tong));
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CSVC;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel MEdia;
    private javax.swing.JPanel Spend;
    private javax.swing.JPanel Traning;
    private javax.swing.JPanel User;
    private javax.swing.JButton btnLocTheoTieuChi;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSuaThanhVien;
    private javax.swing.JButton btnThemTV;
    private javax.swing.JButton btnTimKiemThanhVien;
    private javax.swing.JButton btnXoaThanhVien;
    private javax.swing.JButton bttimkiem;
    private javax.swing.JButton bttimkiemchitieu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTabbedPane frameView;
    private javax.swing.JPanel home;
    private javax.swing.JPanel infra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel media;
    private javax.swing.JRadioButton rbtdongia;
    private javax.swing.JRadioButton rbtnNam;
    private javax.swing.JRadioButton rbtnNu;
    private javax.swing.JRadioButton rbtnTruongBan;
    private javax.swing.JRadioButton rbtsoluong;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JPanel spend;
    private javax.swing.JButton suaCSVC;
    private javax.swing.JButton suaDT;
    private javax.swing.JButton suaTT;
    private javax.swing.JButton suachitieu;
    private javax.swing.JTable tableQuanLyChiTieu;
    private javax.swing.JTable tblCSVC;
    private javax.swing.JTable tblHDDT;
    private javax.swing.JTable tblTT;
    private javax.swing.JTable tblThanhVien;
    private javax.swing.JButton themCSVC;
    private javax.swing.JButton themDT;
    private javax.swing.JButton themTT;
    private javax.swing.JButton themchitieu;
    private javax.swing.JPanel train;
    private javax.swing.JTextField txtChiPhiHDDT;
    private javax.swing.JTextField txtThanhVienHDDT;
    private javax.swing.JTextField txtTimKiemThanhVien;
    private javax.swing.JTextField txtTongChiPhiTT;
    private javax.swing.JTextField txtTongThanhVien;
    private javax.swing.JTextField txtTongThanhVienTT;
    private javax.swing.JTextField txtchiphicon;
    private javax.swing.JTextField txttim;
    private javax.swing.JTextField txttimkiemchitieu;
    private javax.swing.JPanel user;
    private javax.swing.JButton xoaCSVC;
    private javax.swing.JButton xoaDT;
    private javax.swing.JButton xoaTT;
    private javax.swing.JButton xoachitieu;
    // End of variables declaration//GEN-END:variables


    private void showDataThanhVien() {
            this.showData(listTV, modelTV);
            int tong = 0;
            for (ThanhVien x : listTV) {
                tong += 1;
            }
            txtTongThanhVien.setText(String.valueOf(tong));
    }
    
    public void addThanhVien(ThanhVien t) {
        if(new Dao().addUser(t)){
                    listTV.add(t);
        }
        this.showData(listTV, modelTV);
        showDataThanhVien();
    }
    private void showDataQuy(){
        this.showData(listQuy, modelQuy);
        double chiphicl = 0; 
        for(Quy x : listQuy){
            chiphicl += x.getChiPhi();
        }
        txtchiphicon.setText("" + chiphicl);
    }
    private void showDataQuySearch(){
        this.showData(listTKCT, modelQuy);
        double chiphicl = 0; 
        for(Quy x : listTKCT){
            chiphicl += x.getChiPhi();
        }
        txtchiphicon.setText("" + chiphicl);
    }
    public void addQuy(Quy q){
        if(new Dao().addSpend(q)){
             listQuy.add(q); 
        }
        this.showData(listQuy, modelQuy);
        showDataQuy();
    }
    private void showDataCSVC(){
        modelCSVC.setNumRows(0);
        this.showData(listCSVC, modelCSVC);
        int SoLuongCSVC = 0;
        double TongChiPhi = 0;
        for (var x : listCSVC) {
            SoLuongCSVC += x.getSoLuong();
            TongChiPhi += x.getChiPhi() * x.getSoLuong();
        }
        jTextField5.setText("" + SoLuongCSVC);
        jTextField6.setText("" + df.format(TongChiPhi));
    }
    private void showDataCSVCSearch(){
        modelCSVC.setNumRows(0);
        this.showData(listTK, modelCSVC);
        int SoLuongCSVC = 0;
        double TongChiPhi = 0;
        for (var x : listTK) {
            SoLuongCSVC += x.getSoLuong();
            TongChiPhi += x.getChiPhi() * x.getSoLuong();
        }
        jTextField5.setText("" + SoLuongCSVC);
        jTextField6.setText("" + df.format(TongChiPhi));
    }
    private void showDataCSVCSort(){
        modelCSVC.setNumRows(0);
        this.showData(listCSVCSort, modelCSVC);
        int SoLuongCSVC = 0;
        double TongChiPhi = 0;
        for (var x : listCSVC) {
            SoLuongCSVC += x.getSoLuong();
            TongChiPhi += x.getChiPhi() * x.getSoLuong();
        }
        jTextField5.setText("" + SoLuongCSVC);
        jTextField6.setText("" + df.format(TongChiPhi));
    }

    public void addCSVC(CoSoVC cs) {
        if(new Dao().addInfras(cs)){
             listCSVC.add(cs);
             
        }
        this.showData(listCSVC, modelCSVC);
        showDataCSVC(); 
    }

    
    private void showDataHDTT(){
        this.showData(listHDTT, modelHDTT);
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listHDTT) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong Truyen Thong")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtTongThanhVienTT.setText(String.valueOf(SoThanhVien));
        txtTongChiPhiTT.setText(String.valueOf(TongChiPhi));
    }
    private void showDataHDDT(){
        this.showData(listHD, modelHDDT);
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listHD) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtThanhVienHDDT.setText("" + SoThanhVien);
        txtChiPhiHDDT.setText("" + df.format(TongChiPhi));
    }
    private void showDataDTSearch() {
        this.showData(listTKHD, modelHDDT);
        int SoThanhVien = 0;
        double TongChiPhi = 0;
        for (var x : listTKHD) {
            if (x.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")) {
                SoThanhVien += x.getSoThanhVien();
                TongChiPhi += x.getKinhPhi();
            }
        }
        txtThanhVienHDDT.setText("" + SoThanhVien);
        txtChiPhiHDDT.setText("" + df.format(TongChiPhi));
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addHD(HoatDong a) {
        if(new Dao().addTraining(a)){
            listHD.add(a);
           JOptionPane.showMessageDialog(this, "Thêm thành công hoạt động đào tạo mới!");
        }
        showData(listHD, modelHDDT);
        showDataHDDT();
    }

    public void addTT(HoatDong tt) {
        if(new Dao().addMedia(tt)){
             listHDTT.add(tt);
        }
        showData(listHDTT, modelHDTT);
        showDataHDTT();
    }

    void updateThanhVien(ThanhVien tv) {
        ThanhVien thanhVienDaChon = listTV.get(indexThanhVien);
        thanhVienDaChon.setMaTV(tv.getMaTV());
        thanhVienDaChon.setTenTV(tv.getTenTV());
        thanhVienDaChon.setKhoa(tv.getKhoa());
        thanhVienDaChon.setChuyenNghanh(tv.getChuyenNghanh());
        thanhVienDaChon.setBan(tv.getBan());
        thanhVienDaChon.setNgaySinh(tv.getNgaySinh());
        thanhVienDaChon.setGioiTinh(tv.getGioiTinh());
        thanhVienDaChon.setEmail(tv.getEmail());
        thanhVienDaChon.setSdt(tv.getSdt());
        thanhVienDaChon.setChucDanh(tv.getChucDanh());
        if(new Dao().updateUser(tblThanhVien.getValueAt(indexThanhVien, 0).toString(), thanhVienDaChon)){
                    listTV.set(indexThanhVien, thanhVienDaChon);
        }
        showDataThanhVien();
    }
    public void updataQuy(Quy q){
        Quy qSelect = listQuy.get(indexQuy);
        qSelect.setMaQuy(q.getMaQuy());
        qSelect.setTenHD(q.getTenHD());
        qSelect.setThoiGian(q.getThoiGian());
        qSelect.setChiPhi(q.getChiPhi());
        if(new Dao().updateSpend(qSelect.getMaQuy(), q)){
                 listQuy.set(indexQuy, qSelect);
        }
        showDataQuy();
        
    }
    public void editCSVC(CoSoVC cs, int vt) {
        if(new Dao().updateInfras(cs.getMaCSVC(), cs)){
                    listCSVC.set(vt, cs);
        }
        showData(listCSVC, modelCSVC);
        showDataCSVC();
    }

    public void editHD(HoatDong a, int vt) {
        if(new Dao().updateTraining(a.getMaHD(), a)){
            listHD.set(vt, a);
        }
        showData(listHD, modelHDDT);
        showDataHDDT();
    }

    public void editHDTT(HoatDong tt, int vt) {
        if(new Dao().updateMedia(tt.getMaHD(), tt)){
            listHDTT.set(vt, tt);
        }
        showData(listHDTT, modelHDTT);
        showDataHDTT();
    }
    
    
    public <T> void showData(List<T> list, DefaultTableModel model){
        model.setRowCount(0);
        for(T t: list){
            if(t instanceof ThanhVien){
                ThanhVien tv = (ThanhVien)t;
                model.addRow(new Object[]{
                    tv.getMaTV(), tv.getTenTV(), tv.getKhoa(), tv.getChuyenNghanh(), tv.getBan(),
                    tv.getNgaySinh(), tv.getGioiTinh(), tv.getEmail(), tv.getSdt(), tv.getChucDanh()
                });
            }
            if(t instanceof Quy){
                Quy q = (Quy)t;
                model.addRow(new Object[]{
                    q.getMaQuy() , q.getTenHD() , q.getThoiGian() , q.getChiPhi()
                });
            }
            if (t instanceof HoatDong) {
                HoatDong z = (HoatDong) t;
                if (z.getLoaiHD().equalsIgnoreCase("Hoat dong dao tao")) {
                    model.addRow(new Object[]{
                       z.getMaHD(), z.getTenHD(), z.getThoiGian(), z.getDiaDiem(), z.getMoTa(), z.getSoThanhVien(), z.getKinhPhi()
                    });
                }
            }
            if (t instanceof HoatDong) {
                HoatDong a = (HoatDong) t;
                if (a.getLoaiHD().equalsIgnoreCase("Hoat dong Truyen Thong")) {
                    model.addRow(new Object[]{
                        a.getMaHD(), a.getTenHD(), a.getDanhGia(), a.getMoTa(), a.getSoThanhVien(), a.getDiaDiem(), a.getThoiGian(), a.getKinhPhi()
                    });
                }
            }
            if(t instanceof CoSoVC){
                CoSoVC csvc = (CoSoVC)t;
                model.addRow(new Object[]{
                    csvc.getMaCSVC(), csvc.getTenCSVC(), csvc.getTrangThai(), csvc.getSoLuong(), csvc.getChiPhi()
                });
            }
        }
    }
    
    
   

    
}
