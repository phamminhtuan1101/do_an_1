
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


public class Form_PX extends javax.swing.JPanel {

    final String header[] = {"Số phiếu","Ngày tạo phiếu", "Tên khách hàng", "Địa chỉ", "SĐT", "Mã số thuế","Mã máy","Tên máy"
            , "Hãng SX","Số lượng", "Đơn giá","Thành tiền","Tổng tiền"};
    final DefaultTableModel tb = new DefaultTableModel(header,0);
    
    ConnectDB cn = new ConnectDB();
    Connection conn;
    
    Statement st;
    ResultSet rs;
    public Form_PX() {
        initComponents();
        loadData();
    }
    
    public void loadData(){
        try {
            conn = cn.getConnection();
            int number;
            Vector row;
            String sql = "select * from Phieuxuat";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new uneti.project1.swing.Table();
        labelBorder2 = new uneti.project1.swing.LabelBorder();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jsp = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jsdt = new javax.swing.JTextField();
        jkh = new javax.swing.JTextField();
        jdc = new javax.swing.JTextField();
        jtmt = new javax.swing.JTextField();
        jmsm = new javax.swing.JTextField();
        jhsx = new javax.swing.JTextField();
        jnlp = new javax.swing.JTextField();
        jmst = new javax.swing.JTextField();
        jdg = new javax.swing.JTextField();
        jsl = new javax.swing.JTextField();
        jtt = new javax.swing.JTextField();
        jtongt = new javax.swing.JTextField();
        labelBorder4 = new uneti.project1.swing.LabelBorder();
        jsearch1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(18, 151, 224));

        labelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        labelBorder1.setPreferredSize(new java.awt.Dimension(876, 472));

        jButton2.setText("Thêm");
        jButton2.setBorder(null);
        jButton2.setFocusable(false);
        jButton2.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sửa");
        jButton3.setBorder(null);
        jButton3.setFocusable(false);
        jButton3.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Xóa");
        jButton4.setBorder(null);
        jButton4.setFocusable(false);
        jButton4.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Tạo mới");
        jButton5.setBorder(null);
        jButton5.setFocusable(false);
        jButton5.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Số phiếu", "Tên CT", "SĐT", "Địa chỉ", "Tên máy", "Mã số máy", "Mã số thuế", "Hãng sản xuất", "Ngày tạo phiếu", "Đơn giá", "Số lượng", "Tổng tiền", "Thành tiền"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        labelBorder2.setBackground(new java.awt.Color(242, 242, 242));

        jLabel36.setText("Số phiếu:");

        jLabel38.setText("Tên khách hàng:");

        jLabel39.setText("SĐT:");

        jLabel40.setText("Địa chỉ:");

        jLabel45.setText("Số lượng:");

        jLabel44.setText("Đơn giá:");

        jLabel43.setText("Ngày làm phiếu:");

        jLabel48.setText("Thành tiền:");

        jLabel37.setText("Tên máy tính:");

        jLabel47.setText("Mã số thuế:");

        jLabel42.setText("Hãng sản xuất:");

        jLabel41.setText("Mã số máy tính:");

        jLabel46.setText("Tổng tiền:");

        javax.swing.GroupLayout labelBorder2Layout = new javax.swing.GroupLayout(labelBorder2);
        labelBorder2.setLayout(labelBorder2Layout);
        labelBorder2Layout.setHorizontalGroup(
            labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder2Layout.createSequentialGroup()
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labelBorder2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBorder2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtmt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jkh, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmsm, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel43)
                    .addComponent(jLabel42)
                    .addComponent(jLabel48)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46)
                    .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel45)
                        .addComponent(jLabel44)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jhsx, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnlp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmst, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdg, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtongt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        labelBorder2Layout.setVerticalGroup(
            labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(jhsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labelBorder2Layout.createSequentialGroup()
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jnlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jmst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(labelBorder2Layout.createSequentialGroup()
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel40)
                        .addComponent(jdc, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(labelBorder2Layout.createSequentialGroup()
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jdg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))))
                .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labelBorder2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtongt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)))
                    .addGroup(labelBorder2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jmsm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41)))))
        );

        javax.swing.GroupLayout labelBorder1Layout = new javax.swing.GroupLayout(labelBorder1);
        labelBorder1.setLayout(labelBorder1Layout);
        labelBorder1Layout.setHorizontalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(labelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(labelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        labelBorder1Layout.setVerticalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
        );

        labelBorder4.setBackground(new java.awt.Color(255, 255, 255));

        jsearch1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jsearch1.setToolTipText("Nhập tên cần tìm");
        jsearch1.setBorder(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uneti/project1/img/searchic.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout labelBorder4Layout = new javax.swing.GroupLayout(labelBorder4);
        labelBorder4.setLayout(labelBorder4Layout);
        labelBorder4Layout.setHorizontalGroup(
            labelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBorder4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsearch1)
                .addContainerGap())
        );
        labelBorder4Layout.setVerticalGroup(
            labelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jsearch1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelBorder4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(labelBorder4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        conn = cn.getConnection();
        try {
            // Kiem tra nhap du thong tin
            if(jsp.getText().equals("") || jnlp.getText().equals("") || jkh.getText().equals("") 
                    ||jdc.getText().equals("") || jsdt.getText().equals("") || jmst.getText().equals("")
                    || jmsm.getText().equals("") || jtmt.getText().equals("")
                    || jhsx.getText().equals("")
                    || jsl.getText().equals("") || jdg.getText().equals("")
                    || jtt.getText().equals("") || jtongt.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Nhập đủ dữ liệu!");
            }else{
                //kiem tra trung pk
                StringBuffer sb = new StringBuffer();
                String sql_check_pk = "select Sophieu from Phieuxuat where Sophieu = '" +jsp.getText()+"'";
                st = conn.createStatement();
                rs = st.executeQuery(sql_check_pk);
                if(rs.next()){
                    sb.append("Phiếu này đã tồn tại");
                }
                if(sb.length() > 0){
                    JOptionPane.showMessageDialog(this, sb.toString());
                }else{
                    String sql = "insert into Phieuxuat values('"+jsp.getText()+"','"+jnlp.getText()+"','"+jkh.getText()+"','"
                            +jdc.getText()+"','"+jsdt.getText()+"','"+jmst.getText()+"','"+jmsm.getText()+"','"
                            +jtmt.getText()+"','"+jhsx.getText()+"','"+jsl.getText()+"','"
                            +jdg.getText()+"','"+jtt.getText()+"','"+jtongt.getText()+"')";
                    st = conn.createStatement();
                    int kq = st.executeUpdate(sql);
                    if(kq>0){
                        JOptionPane.showMessageDialog(this, "Thêm thành công");
                        clearpx();
                    }
                }
                st.close();
            }
            conn.close();
            rs.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clearpx();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        conn = cn.getConnection();
        try {
            // Kiem tra nhap du thong tin
            if(jsp.getText().equals("") || jnlp.getText().equals("") || jkh.getText().equals("") 
                    ||jdc.getText().equals("") || jsdt.getText().equals("") || jmst.getText().equals("")
                    || jmsm.getText().equals("") || jtmt.getText().equals("")
                    || jhsx.getText().equals("") || jsl.getText().equals("")
                    || jsl.getText().equals("") || jdg.getText().equals("")
                    || jtt.getText().equals("") || jtongt.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Nhập đủ dữ liệu!");
            }else{
                st = conn.createStatement();
                String sql = "update Phieuxuat set Ngaylamphieu='" +jnlp.getText()+"',Tenkh='"+jkh.getText()+"',Diachi='"+jdc.getText()
                        +"',Sdt='"+jsdt.getText()+"',Masothue='"+jmst.getText()+"',Masomaytinh='"+jmsm.getText()
                        +"',Tenmay='"+jtmt.getText()+"',Hangsx='"+jdc.getText()+"',Soluong='"+jsl.getText()+"',Dongia='"+jdg.getText()
                        +"',Thanhtien='"+jtt.getText()+"',Tongtien='"+jtongt.getText()
                        +"'where Sophieu ='"+jsp.getText()+"'";
                st = conn.createStatement();
                int kq = st.executeUpdate(sql);
                if(kq>0){
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                    clearpx();
                }
                st.close();
            }
            conn.close();
            rs.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
       int x = table1.getSelectedRow();
      if (x >= 0){
                    jsp.setText(table1.getValueAt(table1.getSelectedRow(), 0)+"");
                    jnlp.setText(table1.getValueAt(table1.getSelectedRow(), 1)+"");
                    jkh.setText(table1.getValueAt(table1.getSelectedRow(), 2)+"");
                    jdc.setText(table1.getValueAt(table1.getSelectedRow(), 3)+"");
                    jsdt.setText(table1.getValueAt(table1.getSelectedRow(), 4)+"");
                    jmst.setText(table1.getValueAt(table1.getSelectedRow(), 5)+"");
                    jmsm.setText(table1.getValueAt(table1.getSelectedRow(), 6)+"");
                    jtmt.setText(table1.getValueAt(table1.getSelectedRow(), 7)+"");
                    jhsx.setText(table1.getValueAt(table1.getSelectedRow(), 8)+"");
                    jsl.setText(table1.getValueAt(table1.getSelectedRow(), 9)+"");
                    jdg.setText(table1.getValueAt(table1.getSelectedRow(), 10)+"");
                    jtt.setText(table1.getValueAt(table1.getSelectedRow(), 11)+"");
                    jtongt.setText(table1.getValueAt(table1.getSelectedRow(), 12)+"");
                    jsp.setEnabled(false);
    }
    }//GEN-LAST:event_table1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        conn = cn.getConnection();
        try {
            String sql = "delete Phieuxuat where Sophieu='"+jsp.getText()+"'";
            st = conn.createStatement();
            int cf = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không ?","Thông báo", JOptionPane.YES_NO_OPTION);
            if( cf == JOptionPane.YES_OPTION){
                st.executeUpdate(sql);
                clearpx();
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        conn = cn.getConnection();
        try {
            int number;
            Vector row;
            String sql = "select * from Phieuxuat where Ngaylamphieu like '%"+jsearch1.getText()+"%' or Sophieu like '%"
                    +jsearch1.getText()+"%' or Ngaylamphieu like '%"+jsearch1.getText()+"%' or Tenkh like '%"
                    +jsearch1.getText()+"%'or Diachi like '%"+jsearch1.getText()+"%'or Sdt like '%"+jsearch1.getText()+"%'or Masothue like '%"
                    +jsearch1.getText()+"%'or Masomaytinh like '%"+jsearch1.getText()+"%'or Tenmay like '%"+jsearch1.getText()+"%'or Hangsx like '%"
                    +jsearch1.getText()+"%'or Soluong like '%"+jsearch1.getText()+"%'";
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
    }//GEN-LAST:event_jLabel2MouseClicked
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(),15, 15);
        super.paintComponent(g);
    }
    private void clearpx(){
       
        jsdt.setText(null);
        jkh.setText(null);
        jnlp.setText(null);
        jdc.setText(null);
        jtmt.setText(null);
        jmsm.setText(null);
        jhsx.setText(null);
        jmst.setText(null);
        jdg.setText(null);
        jsl.setText(null);
        jtt.setText(null);
        jsp.setText(null);
        jtongt.setText(null);
        loadData();
        jsp.setEnabled(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jdc;
    private javax.swing.JTextField jdg;
    private javax.swing.JTextField jhsx;
    private javax.swing.JTextField jkh;
    private javax.swing.JTextField jmsm;
    private javax.swing.JTextField jmst;
    private javax.swing.JTextField jnlp;
    private javax.swing.JTextField jsdt;
    private javax.swing.JTextField jsearch1;
    private javax.swing.JTextField jsl;
    private javax.swing.JTextField jsp;
    private javax.swing.JTextField jtmt;
    private javax.swing.JTextField jtongt;
    private javax.swing.JTextField jtt;
    private uneti.project1.swing.LabelBorder labelBorder1;
    private uneti.project1.swing.LabelBorder labelBorder2;
    private uneti.project1.swing.LabelBorder labelBorder4;
    private uneti.project1.swing.Table table1;
    // End of variables declaration//GEN-END:variables
}
