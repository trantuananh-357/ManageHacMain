/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Quy;
import controller.Dao;
import java.awt.Choice;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class AddQuy extends javax.swing.JDialog {

    private TrangChu home; 
    private ArrayList<Quy> dsQuy = new Dao().getSpend();
    
    public AddQuy(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
        this.setLocationRelativeTo(null);
         home = (TrangChu) parent;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btthemchiphi = new javax.swing.JButton();
        bthuybo = new javax.swing.JButton();
        cbbhoatdong = new javax.swing.JComboBox<>();
        txtmachitieu = new javax.swing.JTextField();
        txtthoigian = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTongQuy = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm chi tiêu");

        jLabel1.setText("Mã chi tiêu:");

        jLabel2.setText("Tên hoạt động:");

        jLabel3.setText("Thời gian:");

        btthemchiphi.setText("Thêm");
        btthemchiphi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthemchiphiActionPerformed(evt);
            }
        });

        bthuybo.setText("Hủy bỏ");
        bthuybo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthuyboActionPerformed(evt);
            }
        });

        cbbhoatdong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truyền thông ", "Cơ sở vật chất", "Sự kiện" }));

        jLabel5.setText("Tổng quỹ: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(bthuybo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btthemchiphi))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmachitieu)
                            .addComponent(cbbhoatdong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtthoigian)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTongQuy, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtmachitieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbbhoatdong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtthoigian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTongQuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btthemchiphi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bthuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bthuyboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthuyboActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bthuyboActionPerformed

    private void btthemchiphiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthemchiphiActionPerformed
        String ten = cbbhoatdong.getSelectedItem().toString();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date ngayChiTieu = null;
        
        String pattern = "^[a-zA-Z0-9]+$";
        
        Quy x = new Quy();          
        try {
            x.setMaQuy(txtmachitieu.getText());
            if (!x.getMaQuy().matches(pattern)) throw new Exception("Mã chi tiêu chỉ được chứa chữ cái và số!");
            for(var z : dsQuy){
                if(z.getMaQuy().equalsIgnoreCase(x.getMaQuy())){
                    throw new Exception("Trùng mã quỹ");
                }
            }              
            x.setThoiGian(txtthoigian.getText());
            try {
                ngayChiTieu = dateFormat.parse(x.getThoiGian());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Thời gian không hợp lệ!VD:10/11/2002");
            }
            x.setChiPhi(0);
            if(txtTongQuy.getText().length() == 0) throw new Exception("Tổng quỹ không được để trống");
            Double tongquy = Double.parseDouble(txtTongQuy.getText());
            x.setTongQuy(tongquy);
            
            home.addQuy(x);
            JOptionPane.showMessageDialog(this, "Thêm thành công quỹ mới");
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btthemchiphiActionPerformed

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
            java.util.logging.Logger.getLogger(AddQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddQuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddQuy dialog = new AddQuy(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bthuybo;
    private javax.swing.JButton btthemchiphi;
    private javax.swing.JComboBox<String> cbbhoatdong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtTongQuy;
    private javax.swing.JTextField txtmachitieu;
    private javax.swing.JTextField txtthoigian;
    // End of variables declaration//GEN-END:variables
}
