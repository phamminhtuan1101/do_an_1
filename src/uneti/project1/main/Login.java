
package uneti.project1.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBorder1 = new uneti.project1.swing.LabelBorder();
        labelBorder2 = new uneti.project1.swing.LabelBorder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtdn = new javax.swing.JTextField();
        jpass = new javax.swing.JPasswordField();
        btndn = new javax.swing.JButton();
        jshow = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        labelBorder3 = new uneti.project1.swing.LabelBorder();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(18, 151, 224));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        labelBorder1.setBackground(new java.awt.Color(18, 151, 224));

        labelBorder2.setBackground(new java.awt.Color(18, 151, 224));

        jLabel1.setText("Mã NV:");

        jLabel2.setText("Mật khẩu:");

        jtxtdn.setToolTipText("Nhập mã nhân viên...");
        jtxtdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdnActionPerformed(evt);
            }
        });

        btndn.setBackground(new java.awt.Color(255, 255, 255));
        btndn.setText("Đăng nhập");
        btndn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 151, 224), 1, true));
        btndn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndnActionPerformed(evt);
            }
        });

        jshow.setBackground(new java.awt.Color(18, 151, 224));
        jshow.setText("Hiện mật khẩu");
        jshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jshowMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Đăng nhập");

        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Quên mật khẩu ?");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Thoát");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(18, 151, 224), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        labelBorder3.setBackground(new java.awt.Color(255, 255, 255));
        labelBorder3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 10, true));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uneti/project1/img/Logo2.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Phần mềm quản lý kinh doanh máy tính xách tay");

        javax.swing.GroupLayout labelBorder3Layout = new javax.swing.GroupLayout(labelBorder3);
        labelBorder3.setLayout(labelBorder3Layout);
        labelBorder3Layout.setHorizontalGroup(
            labelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(labelBorder3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        labelBorder3Layout.setVerticalGroup(
            labelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBorder3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout labelBorder2Layout = new javax.swing.GroupLayout(labelBorder2);
        labelBorder2.setLayout(labelBorder2Layout);
        labelBorder2Layout.setHorizontalGroup(
            labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder2Layout.createSequentialGroup()
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labelBorder2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(labelBorder2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(labelBorder2Layout.createSequentialGroup()
                                .addComponent(jshow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(labelBorder2Layout.createSequentialGroup()
                                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpass, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtdn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 12, Short.MAX_VALUE))
                            .addGroup(labelBorder2Layout.createSequentialGroup()
                                .addComponent(btndn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(labelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        labelBorder2Layout.setVerticalGroup(
            labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtdn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jshow)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(labelBorder3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout labelBorder1Layout = new javax.swing.GroupLayout(labelBorder1);
        labelBorder1.setLayout(labelBorder1Layout);
        labelBorder1Layout.setHorizontalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        labelBorder1Layout.setVerticalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdnActionPerformed

    private void btndnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndnActionPerformed
        ConnectDB con = new ConnectDB();
        Connection conn = null;
        try {
            conn = con.getConnection();
            String sql = "Select * from Nhanvien where MaNV=? and Password =?";
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, jtxtdn.getText());
            ps.setString(2, jpass.getText());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Main m  = new Main();
                m.show();
                this.hide();
            }else{
                JOptionPane.showMessageDialog(this, "Sai tài khoản hoặc mật khẩu","Lỗi đăng nhập",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        
    }//GEN-LAST:event_btndnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int ex = JOptionPane.showConfirmDialog(this, "Bạn muốn thoát ứng dụng ?","Xác nhận",JOptionPane.YES_NO_OPTION);
        if(ex == JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
            return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jshowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jshowMouseClicked
       if(jshow.isSelected()){
           jpass.setEchoChar((char)0);
       }else{
        jpass.setEchoChar('*');
        }
    }//GEN-LAST:event_jshowMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
 protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(),15, 15);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JCheckBox jshow;
    private javax.swing.JTextField jtxtdn;
    private uneti.project1.swing.LabelBorder labelBorder1;
    private uneti.project1.swing.LabelBorder labelBorder2;
    private uneti.project1.swing.LabelBorder labelBorder3;
    // End of variables declaration//GEN-END:variables
}
