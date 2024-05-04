package view;

import Model.ThanhVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class EditThanhVien extends javax.swing.JDialog {

    private TrangChu home;

    public EditThanhVien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        home = (TrangChu) parent;
        this.setLocationRelativeTo(null);
        this.setTitle("Trang sửa thông tin thành viên");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGR1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMaTV = new javax.swing.JTextField();
        txtTenTV = new javax.swing.JTextField();
        cbChuyenNghanh = new javax.swing.JComboBox<>();
        cbBan = new javax.swing.JComboBox<>();
        rbtnGioiTinhNam = new javax.swing.JRadioButton();
        rbtnGioiTinhNu = new javax.swing.JRadioButton();
        txtGmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        cbChucDanh = new javax.swing.JComboBox<>();
        btnHoanTat = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        txtNgaySinh = new javax.swing.JTextField();
        cbKhoa = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mã TV:");

        jLabel2.setText("Tên TV:");

        jLabel3.setText("Khoá:");

        jLabel4.setText("Chuyên nghành:");

        jLabel5.setText("Ban:");

        jLabel6.setText("Ngày sinh:");

        jLabel7.setText("Giới tính:");

        jLabel8.setText("Gmail:");

        jLabel9.setText("SĐT:");

        jLabel10.setText("Chức Danh:");

        txtMaTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaTVActionPerformed(evt);
            }
        });

        txtTenTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenTVActionPerformed(evt);
            }
        });

        cbChuyenNghanh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNTT", "KTPM", "QTKD", "Ngôn ngữ Anh", "Ngôn ngữ Hàn", "Kế Toán", "Khác" }));

        cbBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truyền thông & Sự kiện", "Hành chính", "Hát", "Rap", "Nhạc cụ", "Vũ đạo" }));

        btnGR1.add(rbtnGioiTinhNam);
        rbtnGioiTinhNam.setText("Nam");

        btnGR1.add(rbtnGioiTinhNu);
        rbtnGioiTinhNu.setText("Nữ");
        rbtnGioiTinhNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnGioiTinhNuActionPerformed(evt);
            }
        });

        cbChucDanh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trưởng Ban", "Thành Viên" }));

        btnHoanTat.setText("Hoàn tất sửa");
        btnHoanTat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoanTatActionPerformed(evt);
            }
        });

        btnHuy.setText("Huỷ bỏ");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        cbKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "K14", "K15", "K16", "K17", "K18" }));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("CHỈNH SỬA THÔNG TIN THÀNH VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHoanTat)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenTV, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txtMaTV, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(cbChuyenNghanh, 0, 195, Short.MAX_VALUE)
                            .addComponent(cbBan, 0, 195, Short.MAX_VALUE)
                            .addComponent(cbKhoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnGioiTinhNam)
                                        .addGap(33, 33, 33)
                                        .addComponent(rbtnGioiTinhNu))
                                    .addComponent(txtGmail)
                                    .addComponent(txtSDT)
                                    .addComponent(cbChucDanh, 0, 194, Short.MAX_VALUE)
                                    .addComponent(txtNgaySinh))))
                        .addContainerGap(186, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnHuy)
                        .addContainerGap(361, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel11)
                .addGap(0, 315, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(txtMaTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(txtTenTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnGioiTinhNam)
                    .addComponent(rbtnGioiTinhNu))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(cbChuyenNghanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(cbChucDanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(cbBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHoanTat)
                    .addComponent(btnHuy))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenTVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenTVActionPerformed

    private void txtMaTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaTVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaTVActionPerformed

    private void rbtnGioiTinhNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGioiTinhNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnGioiTinhNuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnHoanTatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoanTatActionPerformed
        // TODO add your handling code here:
        String ma = txtMaTV.getText();
        String ten = txtTenTV.getText();
        String khoa = cbKhoa.getSelectedItem().toString();
        String chuyenNghanh = cbChuyenNghanh.getSelectedItem().toString();
        String ban = cbBan.getSelectedItem().toString();
        String ngay = txtNgaySinh.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date ngaySinh = null;
        String gioiTinh = "";
        if (rbtnGioiTinhNam.isSelected()) {
            gioiTinh = "Nam";
        } else if (rbtnGioiTinhNu.isSelected()) {
            gioiTinh = "Nữ";
        }
        String gmail = txtGmail.getText();
        String sdt = txtSDT.getText();
        String chucDanh = cbChucDanh.getSelectedItem().toString();

        String pattern = "^[a-zA-Z0-9]+$";
        String pattern1 = "^[a-zA-Z\\sÀ-ỹ]+$";
        int maxLength = 30;
        boolean isOk = true;
         if (ten.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Không được để trống Tên thành viên!");
            isOk = false;
        } else if (ten.length() > maxLength) {
            JOptionPane.showMessageDialog(rootPane, "Tên thành viên không được vượt quá " + maxLength + " ký tự!");
            isOk = false;
        } else if (!ten.matches(pattern1)) {
            JOptionPane.showMessageDialog(rootPane, "Tên thành viên chỉ được chứa chữ cái, dấu cách và dấu gạch ngang!");
            isOk = false;
        } else if (ngay.trim().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ngày sinh!");
            isOk = false;
        } else if (ngay.trim().length() != 0) {
            try {
                ngaySinh = dateFormat.parse(ngay);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(rootPane, "Ngày sinh không hợp lệ!VD:10/11/2002");
                isOk = false;
            }
        }

        if (isOk) {
            if (gioiTinh.trim().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn giới tính!");
                isOk = false;
            } else if (gmail.trim().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập địa chỉ email! VD :abc@gmail.com");
                isOk = false;
            } else if (!isValidEmailFormat(gmail)) {
                JOptionPane.showMessageDialog(rootPane, "Địa chỉ email không hợp lệ!");
                isOk = false;
            } else if (sdt.trim().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập số điện thoại!");
                isOk = false;
            } else if (!isValidPhoneNumber(sdt)) {
                JOptionPane.showMessageDialog(rootPane, "Số điện thoại không hợp lệ! Vui lòng nhập 10 chữ số.");
                isOk = false;
            }
            if (isOk) {
                ThanhVien tv = new ThanhVien(ma, ten, khoa, chuyenNghanh, ban, ngay, gioiTinh, gmail, sdt, chucDanh);
                home.updateThanhVien(tv);
                JOptionPane.showMessageDialog(rootPane, "Sửa thành công thành viên mới !");
            }
        }
    }//GEN-LAST:event_btnHoanTatActionPerformed

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
            java.util.logging.Logger.getLogger(EditThanhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditThanhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditThanhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditThanhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditThanhVien dialog = new EditThanhVien(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup btnGR1;
    private javax.swing.JButton btnHoanTat;
    private javax.swing.JButton btnHuy;
    private javax.swing.JComboBox<String> cbBan;
    private javax.swing.JComboBox<String> cbChucDanh;
    private javax.swing.JComboBox<String> cbChuyenNghanh;
    private javax.swing.JComboBox<String> cbKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbtnGioiTinhNam;
    private javax.swing.JRadioButton rbtnGioiTinhNu;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtMaTV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenTV;
    // End of variables declaration//GEN-END:variables

    public void setEditData(ThanhVien tv) {
        txtMaTV.setText(tv.getMaTV());
        txtMaTV.setEditable(false);
        txtTenTV.setText(tv.getTenTV());
        cbKhoa.setSelectedItem(tv.getKhoa());
        cbChuyenNghanh.setSelectedItem(tv.getChuyenNghanh());
        cbBan.setSelectedItem(tv.getBan());
        txtNgaySinh.setText(tv.getNgaySinh());
        if (tv.getGioiTinh().equals("Nam")) {
            rbtnGioiTinhNam.setSelected(true);
        } else if (tv.getGioiTinh().equals("Nữ")) {
            rbtnGioiTinhNu.setSelected(true);
        }
        txtGmail.setText(tv.getEmail());
        txtSDT.setText(tv.getSdt());
        cbChucDanh.setSelectedItem(tv.getChucDanh());
    }

    private boolean isValidEmailFormat(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@gmail\\.com$";
        return email.matches(emailRegex);
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        String phoneNumberRegex = "\\d{10}";
        return phoneNumber.matches(phoneNumberRegex);
    }

}
