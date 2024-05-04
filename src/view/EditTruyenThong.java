package view;

import Model.HoatDong;
import Model.Quy;
import controller.Dao;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EditTruyenThong extends javax.swing.JDialog {

    private TrangChu home;
    static int vitri;
    HoatDong tt = new HoatDong();
    List<HoatDong> dsHDTT = new Dao().getMedia();
    Quy q;

    public EditTruyenThong(JFrame parent, boolean modal, int vt) {
        super(parent, modal);
        initComponents();
        home = (TrangChu) parent;
        this.setLocationRelativeTo(null);
        vitri = vt;
        setDefaultData();
    }

    private void setDefaultData() {
        layFileHDTT();
        tt = dsHDTT.get(vitri);
        txttenSK.setText(tt.getTenHD());
        txtmoTa.setText(tt.getMoTa());
        txtdanhGia.setText(tt.getDanhGia());
        txtSLTV.setText("" + tt.getSoThanhVien());
        txtdiaDiem.setText(tt.getDiaDiem());
        txtthoiGian.setText(tt.getThoiGian());
        txtchiPhi.setText("" + tt.getKinhPhi());
    }

    public void layFileHDTT() {
        FileInputStream fi;
        ObjectInputStream in;
        try {
            fi = new FileInputStream("hdTruyenThong.txt");
            in = new ObjectInputStream(fi);
            dsHDTT = (ArrayList<HoatDong>) in.readObject();
            fi.close();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttenSK = new javax.swing.JTextField();
        txtmoTa = new javax.swing.JTextField();
        txtdanhGia = new javax.swing.JTextField();
        txtSLTV = new javax.swing.JTextField();
        txtdiaDiem = new javax.swing.JTextField();
        txtthoiGian = new javax.swing.JTextField();
        txtchiPhi = new javax.swing.JTextField();
        SuaBtn = new javax.swing.JButton();
        HuyBoBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("THÊM MỚI NHÂN SỰ CHO HOẠT ĐỘNG");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sửa thông tin sự kiện");

        jLabel1.setText("Tên sự kiện");

        jLabel3.setText("Mô tả:");

        jLabel4.setText("Đánh giá");

        jLabel6.setText("Số lượng thành viên");

        jLabel8.setText("Địa điểm :");

        jLabel9.setText("Thời gian:");

        jLabel10.setText("Chi phí:");

        SuaBtn.setText("Sửa");
        SuaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaBtnActionPerformed(evt);
            }
        });

        HuyBoBtn.setText("Huỷ bỏ");
        HuyBoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyBoBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SỬA ĐỔI SỰ KIỆN - TRUYỀN THÔNG");

        jLabel2.setText("tham gia :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttenSK, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txtmoTa)
                            .addComponent(txtdanhGia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtSLTV, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdiaDiem, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtthoiGian, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtchiPhi, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(SuaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(HuyBoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtSLTV, txtchiPhi, txtdiaDiem, txtthoiGian});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {HuyBoBtn, SuaBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(txttenSK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSLTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtthoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtmoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtchiPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtdanhGia, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SuaBtn)
                            .addComponent(HuyBoBtn))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtdiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtSLTV, txtchiPhi, txtdiaDiem, txtthoiGian});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {HuyBoBtn, SuaBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HuyBoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyBoBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_HuyBoBtnActionPerformed

    private void SuaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaBtnActionPerformed
        // TODO add your handling code here:
        try {
            String ten = txttenSK.getText();
            String ngay = txtthoiGian.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date tg = null;

            boolean flag = true;
            int maxLength = 30;
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

            tt.setTenHD(txttenSK.getText());
            tt.setLoaiHD("Hoat dong truyen thong");
            tt.setDiaDiem(txtdiaDiem.getText());
            tt.setThoiGian(txtthoiGian.getText());
            tt.setMoTa(txtmoTa.getText());
            tt.setSoThanhVien(Integer.parseInt(txtSLTV.getText()));
            tt.setKinhPhi(Double.parseDouble(txtchiPhi.getText()));
            tt.setDanhGia(txtdanhGia.getText());

            if (flag) {
                home.editHDTT(tt, vitri);
                JOptionPane.showMessageDialog(rootPane, "Đã update sự kiện thành công");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }


    }//GEN-LAST:event_SuaBtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditTruyenThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditTruyenThong dialog = new EditTruyenThong(new javax.swing.JFrame(), true, vitri);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HuyBoBtn;
    private javax.swing.JButton SuaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtSLTV;
    private javax.swing.JTextField txtchiPhi;
    private javax.swing.JTextField txtdanhGia;
    private javax.swing.JTextField txtdiaDiem;
    private javax.swing.JTextField txtmoTa;
    private javax.swing.JTextField txttenSK;
    private javax.swing.JTextField txtthoiGian;
    // End of variables declaration//GEN-END:variables

}
