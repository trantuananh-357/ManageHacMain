package view;

import Model.ComboBoxItemBan;
import Model.HoatDong;
import Model.Quy;
import controller.Dao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AddTruyenThong extends javax.swing.JDialog {

    private TrangChu home;

    ArrayList<HoatDong> dsHDTT = new Dao().getMedia();
    Quy z;

    public AddTruyenThong(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        home = (TrangChu) parent;
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ThemBtn = new javax.swing.JButton();
        HuyBobtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txttenSK = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        txtdiaDiem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtmoTa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDG = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtchiPhi = new javax.swing.JTextField();
        txtthoiGian = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txttenSK1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbBan = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SỬA SỰ KIỆN _ TRUYỀN THÔNG");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÊM HOẠT ĐỘNG SỰ KIỆN - TRUYỀN THÔNG");

        ThemBtn.setText("Thêm");
        ThemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemBtnActionPerformed(evt);
            }
        });

        HuyBobtn.setText("Huỷ bỏ");
        HuyBobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyBobtnActionPerformed(evt);
            }
        });
        try {
            List<ComboBoxItemBan> items = new Dao().getBan();
            DefaultComboBoxModel<ComboBoxItemBan> comboBoxModel = new DefaultComboBoxModel<>(
                    items.toArray(new ComboBoxItemBan[0]));
            cmbBan.setModel(comboBoxModel);

        } catch (Exception e) {
            e.printStackTrace();
        }
        jLabel1.setText("Tên sự kiện");

        jLabel6.setText("Số lượng thành viên: ");

        jLabel8.setText("Địa điểm :");

        jLabel3.setText("Mô tả:");

        jLabel4.setText("Đánh giá");

        jLabel10.setText("Chi phí:");

        jLabel9.setText("Thời gian:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("THÊM SỰ KIỆN - TRUYỀN THÔNG");

        jLabel2.setText("Loại sự kiện");

        cmbBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBanActionPerformed(evt);
            }
        });

        jLabel7.setText("Ban");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(HuyBobtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(179, 179, 179))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(169, 169, 169)
                                                                .addComponent(ThemBtn))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                                .addComponent(txtDG,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        201,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel3)
                                                                                        .addGap(46, 46, 46)
                                                                                        .addComponent(txtmoTa,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                201,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel2)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(txttenSK1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                194,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(40, 40, 40)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel7,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        70,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(cmbBan,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        246,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jLabel6))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txttenSK, javax.swing.GroupLayout.PREFERRED_SIZE, 201,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171,
                                                Short.MAX_VALUE)
                                        .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtchiPhi, javax.swing.GroupLayout.DEFAULT_SIZE, 435,
                                                        Short.MAX_VALUE)
                                                .addComponent(txtthoiGian, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtdiaDiem, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtSL, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addContainerGap())));

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] { HuyBobtn, ThemBtn });

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(84, 84, 84)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txttenSK1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(43, 43, 43)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtmoTa, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabel6)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel8)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel9)
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtDG, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ThemBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(HuyBobtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cmbBan, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7)))
                                .addGap(26, 26, 26))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1)
                                                .addComponent(txttenSK, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtdiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(48, 48, 48)
                                                        .addComponent(txtthoiGian,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(29, 29, 29)
                                                        .addComponent(txtchiPhi, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(288, Short.MAX_VALUE))));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cmbBanActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cmbBanActionPerformed

    private void HuyBobtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_HuyBobtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }// GEN-LAST:event_HuyBobtnActionPerformed

    private void ThemBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ThemBtnActionPerformed
        // TODO add your handling code here:
        HoatDong tt = new HoatDong();
        try {
            if (dsHDTT.isEmpty()) {
                tt.setMaHD("HD1");
            } else {
                String ma = "HD" + (dsHDTT.size() + 1);
                tt.setMaHD(ma);
            }
            String ten = txttenSK.getText();
            String ngay = txtthoiGian.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date tg = null;
            ComboBoxItemBan seletedBan = (ComboBoxItemBan) cmbBan.getSelectedItem();
            String maBan = seletedBan.getMaBan();
            String tenBan = seletedBan.getTenBan();

            tt.setTenHD(txttenSK.getText());
            tt.setLoaiHD("Hoat dong truyen thong");
            tt.setDiaDiem(txtdiaDiem.getText());
            tt.setThoiGian(txtthoiGian.getText());
            tt.setMoTa(txtmoTa.getText());
            tt.setSoThanhVien(Integer.parseInt(txtSL.getText()));
            tt.setKinhPhi(Float.parseFloat(txtchiPhi.getText()));
            tt.setDanhGia(txtDG.getText());
            tt.setMaBan(maBan);
            boolean flag = true;
            int maxLength = 50;

            if (ten.length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Không được để trống Tên sự kiện");
                flag = false;
            } else if (ten.length() > maxLength) {
                JOptionPane.showMessageDialog(rootPane, "Tên sự kiện quá dài mời nhập lại!");
                flag = false;
            } else if (ngay.trim().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Không được để trống thời gian diễn ra");
                flag = false;
            } else if (ngay.trim().length() != 0) {
                try {
                    tg = dateFormat.parse(ngay);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Thời gian sự kiện không đúng format");
                    flag = false;
                }
            }
            if (flag) {
                home.addTT(tt);
                JOptionPane.showMessageDialog(this, "Thêm thành công sự kiện mới.");
            }
            // Reset các ô dữ liệu về trống
            txttenSK.setText("");
            txtdiaDiem.setText("");
            txtthoiGian.setText("");
            txtmoTa.setText("");
            txtSL.setText("");
            txtchiPhi.setText("");
            txtDG.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi do: " + e.getMessage());
        }
    }// GEN-LAST:event_ThemBtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            AddTruyenThong dialog = new AddTruyenThong(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HuyBobtn;
    private javax.swing.JButton ThemBtn;
    private javax.swing.JComboBox<ComboBoxItemBan> cmbBan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDG;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtchiPhi;
    private javax.swing.JTextField txtdiaDiem;
    private javax.swing.JTextField txtmoTa;
    private javax.swing.JTextField txttenSK;
    private javax.swing.JTextField txttenSK1;
    private javax.swing.JTextField txtthoiGian;
    // End of variables declaration//GEN-END:variables
}
