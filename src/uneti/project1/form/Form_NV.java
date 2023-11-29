
package uneti.project1.form;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uneti.project1.main.ConnectDB;


public class Form_NV extends javax.swing.JPanel {
    final String header[] = {"Mã nhân viên", "Họ tên", "Giới tính", "Ngày sinh", "Địa chỉ","SĐT", "Email"};
    final DefaultTableModel tb = new DefaultTableModel(header,0);
    
    ConnectDB cn = new ConnectDB();
    Connection conn;
    Statement st;
    ResultSet rs;
    
    public Form_NV() {
        initComponents();
        loadData();
       
    }
    
    public void loadData(){
        try {
            conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "select * from Nhanvien";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tb.setRowCount(0);
            while(rs.next()){
                row = new Vector();
                for(int i =  1; i <= number ; i++)
                row.addElement(rs.getString(i));
                tb.addRow(row);
                table1.setModel(tb);
            }
            st.close();
            rs.close();
            conn.close();
        } catch (Exception e) {
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBorder1 = new uneti.project1.swing.LabelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new uneti.project1.swing.Table();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        labelBorder2 = new uneti.project1.swing.LabelBorder();
        jLabel5 = new javax.swing.JLabel();
        jmnv = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jhvt = new javax.swing.JTextField();
        jdc = new javax.swing.JTextField();
        jsdt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jem = new javax.swing.JTextField();
        jns = new javax.swing.JTextField();
        jgt = new javax.swing.JTextField();
        labelBorder3 = new uneti.project1.swing.LabelBorder();
        jsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(18, 151, 224));

        labelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Tên KH", "Giới tính", "Ngày sinh", "SĐT", "Địa chỉ", "Email"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jButton2.setText("Thêm");
        jButton2.setBorder(null);
        jButton2.setFocusable(false);
        jButton2.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Sửa");
        jButton1.setBorder(null);
        jButton1.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.setBorder(null);
        jButton3.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Tạo mới");
        jButton4.setBorder(null);
        jButton4.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        labelBorder2.setBackground(new java.awt.Color(242, 242, 242));
        labelBorder2.setPreferredSize(new java.awt.Dimension(500, 200));

        jLabel5.setText("Mã nhân viên:");

        jLabel6.setText("Họ và tên:");

        jLabel7.setText("Giới tính:");

        jLabel8.setText("Ngày sinh:");

        jLabel9.setText("Số điện thoại:");

        jLabel10.setText("Địa chỉ:");

        jdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdcActionPerformed(evt);
            }
        });

        jsdt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jsdtKeyTyped(evt);
            }
        });

        jLabel11.setText("Email:");

        jem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout labelBorder2Layout = new javax.swing.GroupLayout(labelBorder2);
        labelBorder2.setLayout(labelBorder2Layout);
        labelBorder2Layout.setHorizontalGroup(
            labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jhvt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jdc)
                    .addComponent(jgt)
                    .addComponent(jmnv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jns, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jsdt)
                    .addComponent(jem))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        labelBorder2Layout.setVerticalGroup(
            labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jhvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout labelBorder1Layout = new javax.swing.GroupLayout(labelBorder1);
        labelBorder1.setLayout(labelBorder1Layout);
        labelBorder1Layout.setHorizontalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(labelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(labelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE))
                .addContainerGap())
        );
        labelBorder1Layout.setVerticalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labelBorder3.setBackground(new java.awt.Color(255, 255, 255));

        jsearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jsearch.setToolTipText("Nhập tên cần tìm");
        jsearch.setBorder(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uneti/project1/img/searchic.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout labelBorder3Layout = new javax.swing.GroupLayout(labelBorder3);
        labelBorder3.setLayout(labelBorder3Layout);
        labelBorder3Layout.setHorizontalGroup(
            labelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBorder3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsearch)
                .addContainerGap())
        );
        labelBorder3Layout.setVerticalGroup(
            labelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(labelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
//SUA THONG TIN
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conn = cn.getConnection();
        try {
            // Kiem tra nhap du thong tin
            if(jmnv.getText().equals("") || jhvt.getText().equals("") || jgt.getText().equals("") 
                    ||jdc.getText().equals("") || jns.getText().equals("") || jsdt.getText().equals("")|| jem.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Nhập đủ dữ liệu!");
            }else{
                st = conn.createStatement();
                String sql = "update Nhanvien set Hoten='"+jhvt.getText()+"',Gioitinh='"
                    +jgt.getText()+"',Ngaysinh='"+jns.getText()+"',Diachi='"+jdc.getText()+"',Sdt='"+jsdt.getText()+"',Email='"+jem.getText()
                    +"'where MaNV ='"+jmnv.getText()+"'";
                st = conn.createStatement();
                int kq = st.executeUpdate(sql);
                if(kq>0){
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                    clearstaffs();
                }
                st.close();
            }
            conn.close();
            rs.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jsdtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsdtKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jsdtKeyTyped

    private void jdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdcActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearstaffs();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int x = table1.getSelectedRow();
      if (x >= 0){
                    jmnv.setText(table1.getValueAt(table1.getSelectedRow(), 0)+"");
                    jhvt.setText(table1.getValueAt(table1.getSelectedRow(), 1)+"");
                    jgt.setText(table1.getValueAt(table1.getSelectedRow(), 2)+"");
                    jns.setText(table1.getValueAt(table1.getSelectedRow(), 3)+"");
                    jdc.setText(table1.getValueAt(table1.getSelectedRow(), 4)+"");
                    jsdt.setText(table1.getValueAt(table1.getSelectedRow(), 5)+"");
                    jem.setText(table1.getValueAt(table1.getSelectedRow(), 6)+"");
                    jmnv.setEnabled(false);
      }
    }//GEN-LAST:event_table1MouseClicked
//THEM THONG TIN
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         conn = cn.getConnection();
        try {
            // Kiem tra nhap du thong tin
            if(jmnv.getText().equals("") || jhvt.getText().equals("") || jgt.getText().equals("") 
                    ||jdc.getText().equals("") || jns.getText().equals("") || jsdt.getText().equals("") || jem.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Nhập đủ dữ liệu!");
            }else {
                //kiem tra trung pk
                StringBuffer sb = new StringBuffer();
                String sql_check_pk = "select MaNV from Nhanvien where MaNV = '" +jmnv.getText()+"'";
                st = conn.createStatement();
                rs = st.executeQuery(sql_check_pk);
                if(rs.next()){
                    sb.append("Nhân viên này đã tồn tại");
                }
                if(sb.length() > 0){
                    JOptionPane.showMessageDialog(this, sb.toString());
                }else{
                    String sql = "insert into Nhanvien values('"+jmnv.getText()+"','"+jhvt.getText()+"','"+jgt.getText()+"','"
                            +jns.getText()+"','"+jdc.getText()+"','"+jsdt.getText()+"','"+jem.getText()+"',null)";
                    st = conn.createStatement();
                    int kq = st.executeUpdate(sql);
                    if(kq>0){
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        clearstaffs();
                    }
                }
                
            }
            st.close();
            conn.close();
            rs.close();
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jemActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        conn = cn.getConnection();
        try {
            int number;
            Vector row;
            String sql = "select * from Nhanvien where Hoten like '%"+jsearch.getText()+"%' or MaNV like '%"+jsearch.getText()+"%' or Gioitinh like '%"
                    +jsearch.getText()+"%' or Ngaysinh like '%"+jsearch.getText()+"%' or Diachi like '%"+jsearch.getText()+"%' or Sdt like '%"
                    +jsearch.getText()+"%'or Email like '%"+jsearch.getText()+"%'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            ResultSetMetaData metadata = rs.getMetaData();
            number = metadata.getColumnCount();
            tb.setRowCount(0);
            while(rs.next()){
                row = new Vector();
                for(int i =  1; i <= number ; i++)
                row.addElement(rs.getString(i));
                tb.addRow(row);
                table1.setModel(tb);
            }
            st.close();
            rs.close();
            conn.close();
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel1MouseClicked
//XOA THONG TIN
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       conn = cn.getConnection();
        try {
            String sql = "delete Nhanvien where MaNV='"+jmnv.getText()+"'";
            st = conn.createStatement();
            int cf = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không ?","Thông báo", JOptionPane.YES_NO_OPTION);
            if( cf == JOptionPane.YES_OPTION){
                st.executeUpdate(sql);
                clearstaffs();
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            }
        } catch (Exception e) {
        }
        
    
    }//GEN-LAST:event_jButton3ActionPerformed
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(),15, 15);
        super.paintComponent(g);
    }
    private void clearstaffs(){
        jmnv.setText(null);
        jhvt.setText(null);
        jsdt.setText(null);
        jdc.setText(null);
        jem.setText(null);
        jgt.setText(null);
        jns.setText(null);
        loadData();
        jmnv.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jdc;
    private javax.swing.JTextField jem;
    private javax.swing.JTextField jgt;
    private javax.swing.JTextField jhvt;
    private javax.swing.JTextField jmnv;
    private javax.swing.JTextField jns;
    private javax.swing.JTextField jsdt;
    private javax.swing.JTextField jsearch;
    private uneti.project1.swing.LabelBorder labelBorder1;
    private uneti.project1.swing.LabelBorder labelBorder2;
    private uneti.project1.swing.LabelBorder labelBorder3;
    private uneti.project1.swing.Table table1;
    // End of variables declaration//GEN-END:variables
}
