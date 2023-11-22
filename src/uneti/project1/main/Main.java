
package uneti.project1.main;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import uneti.project1.event.EventMenuSelected;
import uneti.project1.form.Form_DT;
import uneti.project1.form.Form_Kho;
import uneti.project1.form.Form_KH;
import uneti.project1.form.Form_Login;
import uneti.project1.form.Form_NV;
import uneti.project1.form.Form_PN;
import uneti.project1.form.Form_PX;
import uneti.project1.swing.LabelBorder;

public class Main extends javax.swing.JFrame {
    Login lg = new Login();
    int xy;
    int xx;
   private static Main app;
//Selected Index: 1
//Selected Index: 2
//Selected Index: 3
//Selected Index: 4,5;
//Selected Index: 7
//Selected Index: 8
//Selected Index: 9

    public Main() {
        initComponents();
        
        setBackground(new Color(0,0,0,0));
        menu.initMoving(Main.this);
        menu.addEventMenuSeclected(new EventMenuSelected(){
            @Override
            public void selected(int index) {
               if(index == 0){
                   setForm(new Form_KH());
               }else if(index == 1){
                   setForm(new Form_NV());
               }else if(index == 2){
                   setForm(new Form_PN());
               }else if(index == 3){
                   setForm(new Form_PX());
               }else if(index == 4){
                   setForm(new Form_DT());
               }else if(index == 5){
                   setForm(new Form_Kho());
               }else if(index == 10){
                   Main.this.dispose();
                   lg.setVisible(true);
               }else if(index == 9){
                   
               }else if(index == 8){
                   
               }
            }            
        });
    }

    private void setForm(JComponent com){
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBorder1 = new uneti.project1.swing.LabelBorder();
        menu = new uneti.project1.components.Menu();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        labelBorder1.setBackground(new java.awt.Color(18, 151, 224));
        labelBorder1.setPreferredSize(new java.awt.Dimension(1100, 600));

        mainPanel.setOpaque(false);
        mainPanel.setPreferredSize(new java.awt.Dimension(876, 521));
        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout labelBorder1Layout = new javax.swing.GroupLayout(labelBorder1);
        labelBorder1.setLayout(labelBorder1Layout);
        labelBorder1Layout.setHorizontalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        labelBorder1Layout.setVerticalGroup(
            labelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 601, Short.MAX_VALUE)
            .addGroup(labelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(labelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bgMousePressed(MouseEvent evt){
        xx = evt.getX();
        xy = evt.getY();
    }
    
    private void bgMouseDragged(MouseEvent evt){
        this.setLocation(evt.getXOnScreen() - xx,evt.getYOnScreen() -xy);
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private uneti.project1.swing.LabelBorder labelBorder1;
    private javax.swing.JPanel mainPanel;
    private uneti.project1.components.Menu menu;
    // End of variables declaration//GEN-END:variables
}
