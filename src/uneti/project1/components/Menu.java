
package uneti.project1.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import uneti.project1.event.EventMenuSelected;
import uneti.project1.model.Model_Menu;


public class Menu extends javax.swing.JPanel {
    private EventMenuSelected event;
    
    public void addEventMenuSeclected(EventMenuSelected event){
        this.event = event;
        listMenu2.addEventMenuSeclected(event);
    }
 
    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu2.setOpaque(false);
        init();
       
      }
    private void init(){
        listMenu2.addItem(new Model_Menu("kh","Khách hàng",Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("nv","Nhân viên",Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("pnpx","Phiếu nhập",Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("pnpx","Phiếu xuất",Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("stonkes","Doanh thu",Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("kho","Kho",Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("","",Model_Menu.MenuType.EMPTY));
        listMenu2.addItem(new Model_Menu("","Options",Model_Menu.MenuType.TITLE));
        listMenu2.addItem(new Model_Menu("acc","Tài khoản",Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("help","Trợ giúp",Model_Menu.MenuType.MENU));
        listMenu2.addItem(new Model_Menu("lo","Đăng xuất",Model_Menu.MenuType.MENU));
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        listMenu2 = new uneti.project1.swing.ListMenu<>();

        panelMoving.setBackground(new java.awt.Color(255, 255, 255));
        panelMoving.setOpaque(false);
        panelMoving.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelMoving.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý kinh doanh");
        panelMoving.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(listMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintChildren(Graphics grphcs)
        {Graphics2D g2 = (Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g=new GradientPaint(0,0,Color.decode("#1CB5E0"),0, getHeight(),Color.decode("#000046"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(),15, 15);
        g2.fillRect(getWidth() -20, 0,getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    
    private int x;
    private int y;
    
    public void initMoving(JFrame frame){
        panelMoving.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        }
        );
        panelMoving.addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseDragged(MouseEvent e) {
                frame.setLocation(e.getXOnScreen() - x,e.getYOnScreen() - y);
            }
            
        }
        );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private uneti.project1.swing.ListMenu<String> listMenu2;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
