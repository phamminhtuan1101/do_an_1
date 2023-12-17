
package uneti.project1.form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import uneti.project1.main.ConnectDB;
import uneti.project1.main.Main;

public class Form_DK extends javax.swing.JPanel {
    
    ConnectDB cn = new ConnectDB();
    Connection conn;
     
    ResultSet rs;
    Statement st;
    
    public Form_DK() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBorder1 = new uneti.project1.swing.LabelBorder();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        labelBorder6 = new uneti.project1.swing.LabelBorder();
        btndmk = new javax.swing.JButton();
        jmnv1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jmk1 = new javax.swing.JPasswordField();
        jcmk1 = new javax.swing.JPasswordField();
        labelBorder5 = new uneti.project1.swing.LabelBorder();
        btndk = new javax.swing.JButton();
        jmnv2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jmk2 = new javax.swing.JPasswordField();
        jnmk2 = new javax.swing.JPasswordField();
        jcnmk2 = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(18, 151, 224));

        labelBorder1.setBackground(new java.awt.Color(18, 151, 224));

        labelBorder6.setBackground(new java.awt.Color(255, 255, 255));

        btndmk.setBackground(new java.awt.Color(255, 255, 255));
        btndmk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btndmk.setText("Đổi mật khẩu");
        btndmk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btndmk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndmkActionPerformed(evt);
            }
        });

        jLabel14.setText("Mã nhân viên:");

        jLabel16.setText("Mật khẩu:");

        jLabel17.setText("Xác nhận mật khẩu:");

        javax.swing.GroupLayout labelBorder6Layout = new javax.swing.GroupLayout(labelBorder6);
        labelBorder6.setLayout(labelBorder6Layout);
        labelBorder6Layout.setHorizontalGroup(
            labelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder6Layout.createSequentialGroup()
                .addGroup(labelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labelBorder6Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(labelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(labelBorder6Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmk1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(labelBorder6Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jmnv1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(labelBorder6Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jmk1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(labelBorder6Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(btndmk, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        labelBorder6Layout.setVerticalGroup(
            labelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBorder6Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(labelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmnv1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(labelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmk1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(labelBorder6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmk1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btndmk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đăng ký tài khoản", labelBorder6);

        labelBorder5.setBackground(new java.awt.Color(255, 255, 255));

        btndk.setBackground(new java.awt.Color(255, 255, 255));
        btndk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btndk.setText("Đăng ký");
        btndk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btndk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndkActionPerformed(evt);
            }
        });

        jmnv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnv2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Mã nhân viên:");

        jLabel8.setText("Mật khẩu hiện tại:");

        jLabel9.setText("Mật khẩu mới:");

        jLabel13.setText("Xác nhận mật khẩu:");

        javax.swing.GroupLayout labelBorder5Layout = new javax.swing.GroupLayout(labelBorder5);
        labelBorder5.setLayout(labelBorder5Layout);
        labelBorder5Layout.setHorizontalGroup(
            labelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder5Layout.createSequentialGroup()
                .addGroup(labelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(labelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(labelBorder5Layout.createSequentialGroup()
                            .addGap(354, 354, 354)
                            .addComponent(btndk, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBorder5Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jcnmk2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(labelBorder5Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(labelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(labelBorder5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jmnv2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(labelBorder5Layout.createSequentialGroup()
                                .addGroup(labelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(labelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jmk2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jnmk2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        labelBorder5Layout.setVerticalGroup(
            labelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBorder5Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(labelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmnv2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(labelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmk2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(labelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnmk2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(labelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcnmk2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btndk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thay đổi mật khẩu", labelBorder5);

        javax.swing.GroupLayout labelBorder1Layout = new javax.swing.GroupLayout(labelBorder1);
        labelBorder1.setLayout(labelBorder1Layout);
        labelBorder1Layout.setHorizontalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        labelBorder1Layout.setVerticalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndkActionPerformed
        conn = cn.getConnection();
        try {
            st = conn.createStatement();
            String sql = "update Nhanvien set Password='"+jmk1.getText()+"'where MaNV='"+jmnv1.getText()+"'";
            if(jnmk2.getText().equals(jcnmk2.getText())){
                int rs = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");
            }else{
                JOptionPane.showMessageDialog(this, "Mật khẩu không trùng khớp!");
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btndkActionPerformed

    private void btndmkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndmkActionPerformed
       conn = cn.getConnection();
        try {
            st = conn.createStatement();
            String sql = "update Nhanvien set Password='"+jmk1.getText()+"'where MaNV='"+jmnv1.getText()+"'";
            if(jmk1.getText().equals(jcmk1.getText())){
                int rs = st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "Đăng ký tài khoản thành công");
            }else{
                JOptionPane.showMessageDialog(this, "Mật khẩu không trùng khớp!");
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btndmkActionPerformed

    private void jmnv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnv2ActionPerformed
        
    }//GEN-LAST:event_jmnv2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndk;
    private javax.swing.JButton btndmk;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField jcmk1;
    private javax.swing.JPasswordField jcnmk2;
    private javax.swing.JPasswordField jmk1;
    private javax.swing.JPasswordField jmk2;
    private javax.swing.JTextField jmnv1;
    private javax.swing.JTextField jmnv2;
    private javax.swing.JPasswordField jnmk2;
    private uneti.project1.swing.LabelBorder labelBorder1;
    private uneti.project1.swing.LabelBorder labelBorder5;
    private uneti.project1.swing.LabelBorder labelBorder6;
    // End of variables declaration//GEN-END:variables
}

