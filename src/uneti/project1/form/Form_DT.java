
package uneti.project1.form;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Form_DT extends javax.swing.JPanel {

   
    public Form_DT() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBorder1 = new uneti.project1.swing.LabelBorder();
        labelBorder3 = new uneti.project1.swing.LabelBorder();
        jLabel1 = new javax.swing.JLabel();
        jsearch = new javax.swing.JTextField();
        labelBorder2 = new uneti.project1.swing.LabelBorder();
        jLabel2 = new javax.swing.JLabel();
        labelBorder4 = new uneti.project1.swing.LabelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new uneti.project1.swing.Table();

        setBackground(new java.awt.Color(18, 151, 224));

        labelBorder1.setBackground(new java.awt.Color(18, 151, 224));

        labelBorder3.setBackground(new java.awt.Color(246, 246, 246));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uneti/project1/img/searchic.png"))); // NOI18N

        jsearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jsearch.setToolTipText("Nhập tên cần tìm");
        jsearch.setBorder(null);

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
            .addGroup(labelBorder3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jsearch)
        );

        labelBorder2.setBackground(new java.awt.Color(246, 246, 246));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tổng doanh thu :");

        javax.swing.GroupLayout labelBorder2Layout = new javax.swing.GroupLayout(labelBorder2);
        labelBorder2.setLayout(labelBorder2Layout);
        labelBorder2Layout.setHorizontalGroup(
            labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(760, Short.MAX_VALUE))
        );
        labelBorder2Layout.setVerticalGroup(
            labelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        labelBorder4.setBackground(new java.awt.Color(246, 246, 246));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày bán", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout labelBorder4Layout = new javax.swing.GroupLayout(labelBorder4);
        labelBorder4.setLayout(labelBorder4Layout);
        labelBorder4Layout.setHorizontalGroup(
            labelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(labelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(labelBorder4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        labelBorder4Layout.setVerticalGroup(
            labelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(labelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(labelBorder4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout labelBorder1Layout = new javax.swing.GroupLayout(labelBorder1);
        labelBorder1.setLayout(labelBorder1Layout);
        labelBorder1Layout.setHorizontalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelBorder4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelBorder2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelBorder3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        labelBorder1Layout.setVerticalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBorder4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(),15, 15);
        super.paintComponent(g);
    }

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jsearch;
    private uneti.project1.swing.LabelBorder labelBorder1;
    private uneti.project1.swing.LabelBorder labelBorder2;
    private uneti.project1.swing.LabelBorder labelBorder3;
    private uneti.project1.swing.LabelBorder labelBorder4;
    private uneti.project1.swing.Table table1;
    // End of variables declaration//GEN-END:variables
}
